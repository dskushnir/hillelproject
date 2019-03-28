package ua.hillel.dskushnir.lesson27;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelBruteForce {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        //the hashes to be cracked
        String[] hashes = {"f016441d00c16c9b912d05e9d81d894d",
                "5ebe2294ecd0e0f08eab7690d2a6ee69","13d70e09909669272b19647c2a55dacb"};

        //An ExecutorService is a high-level parallel programming facility, that can execute a number of tasks
        //the FixedThreadPool is an ExecutorService that uses a configurable number of parallel threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //Submit one Task per hash to the thread po
        for (String hash : hashes) {
            executorService.submit(new Forcer(hash));
        }

        //An ExecutorSerice must be shut down properly (this also causes the program to await termination of
        // all pending tasks in the thread pool)
        executorService.shutdown();
    }
}

/**
 * The Class that contains the actual brute-forcing task.
 * <p>
 * It implements the build-in Interface "Runnable", so it can be run on a Thread or a Thread-Execution-Facility
 * (such as an ExecutorService).
 */
class Forcer implements Runnable {

    private static  int LENGTH = 6;

    //These will sore the hash to be cracked in both bytes (required for comparison) and String representation
    // (required for output)
    private final byte[] crackMe;
    private final String crackMeString;

    //The MessageDigest does the SHA-256 caclulation. Note that this may throw a NoSuchAlgorithmException when there
    // is no SHA-256 implementation in the local standard libraries (but that algorithm is mandatory, so this code
    // probably will never throw that Excpetion
    private final MessageDigest digest = MessageDigest.getInstance("MD5");

    public Forcer(String crackMe) throws NoSuchAlgorithmException {
        this.crackMeString = crackMe;
        this.crackMe = DatatypeConverter.parseHexBinary(crackMe);
    }

    @Override
    public void run() {

        String match = "";

        //all loops use this array for their counters. This is very dirty and should never be done in production!
        char[] chars = new char[LENGTH];

        //used for short-stopping when a match is found - one could abuse the match-variable for this, but this is
        // much clearer
        boolean done = false;

        for (chars[0] = 'a'; chars[0] <= 'z' && !done; chars[0]++) {
            for (chars[1] = 'a'; chars[1] <= 'z' && !done; chars[1]++) {
                for (chars[2] = 'a'; chars[2] <= 'z' && !done; chars[2]++) {
                    for (chars[3] = 'a'; chars[3] <= 'z' && !done; chars[3]++) {
                        for (chars[4] = 'a'; chars[4] <= 'z' && !done; chars[4]++) {
                            for (chars[5] = 'a'; chars[5] <= 'z' && !done; chars[5]++) {

                                //the String creation is necessary to get the encoding right
                                String canidate = new String(chars);
                                //genenrate SHA-256 hash using Java's standard facilities
                                byte[] hash = digest.digest(canidate.getBytes());
                                if (Arrays.equals(hash, crackMe)) {
                                    match = canidate;
                                    done = true;
                                }

                            }
                        }
                    }
                }
            }
        }

                System.out.println(String.format("Hash %s has the following match : %s", crackMeString, match));

        }
    }



