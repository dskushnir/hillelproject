package ua.hillel.dskushnir.io.stream;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Stream {
    public static void main(String[] args) throws IOException {
         byteCopy();
         charCopy();
         byteBufferedCopy();
         linesCopy();
         dataStream();
         bytyBufferCopy();

        url();
       zipStream();

        File file = new File("test.text");
        System.out.println(file.exists());
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
      /*  Files.walkFileTree(
                Paths.get("E:\\Hillel\\"),
                new SimpleFileVisitor<>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        System.out.println(file);
                        //  FileVisitResult
                        return super.visitFile(file, attrs);*/


        File file1 = new File("");
        System.out.println(file1.isDirectory());
        Path path = file1.toPath();
        Path path1 = Paths.get("E:\\Hillel\\test.text");
        File file2 = path1.toFile();
        Iterator<Path> iterator = path1.iterator();
        while (iterator.hasNext()) {
            Path next = iterator.next();
            System.out.println(next.toString());
        }
        WatchService watcher = FileSystems.getDefault().newWatchService();
        Path path2 = Paths.get("E:\\Hillel\\");
        WatchKey register = path2.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
        try {
            WatchKey take = watcher.take();
            System.out.println(take);
            List<WatchEvent<?>> x = take.pollEvents();
            for (WatchEvent<?> watchEvent : x) {
                System.out.println(watchEvent);
            }
            System.out.println(x);
        } catch (InterruptedException x) {
        }


        InputStream in = System.in;
        OutputStream out = System.out;
        // Files.walkFileTree(Path.get("")),
        // new SimpleFileVisitor<>(){


    }

    private static void byteCopy() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("E:\\Hillel\\text3");
            out = new FileOutputStream("E:\\Hillel\\text4");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }

        }
    }

    private static void charCopy() throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("E:\\Hillel\\text3");
            out = new FileWriter("E:\\Hillel\\text4");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }

        }
    }

    private static void byteBufferedCopy() throws IOException {

        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("E:\\Hillel\\text5"));
            out = new BufferedOutputStream(new FileOutputStream("E:\\Hillel\\text7"));
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }

        }

    }
    private static void bytyBufferCopy()throws IOException{

        FileInputStream in = new FileInputStream("E:\\Hillel\\text5");
        FileOutputStream out = new FileOutputStream("E:\\Hillel\\text7");
        IOUtils.copy(IOUtils.buffer(in),IOUtils.buffer(out));
        String some_text1 = "some text";
        InputStream some_text = IOUtils.toInputStream(some_text1, Charset.defaultCharset());
        IOUtils.copy(some_text,new FileOutputStream("someText.txt"));

    }

    private static void linesCopy() throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("E:\\Hillel\\text5"));
            out = new BufferedWriter(new FileWriter("E:\\Hillel\\text7"));
            String c;

            while ((c = in.readLine()) != null) {
                out.write(c);
                out.write(System.lineSeparator());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }

        }


    }


    private static void dataStream() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.dat"));
        dataOutputStream.writeInt(123);
        dataOutputStream.writeDouble(321.11);
        dataOutputStream.writeUTF("TEST");
        dataOutputStream.flush();
        dataOutputStream.close();
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.dat"));
        int i = dataInputStream.readInt();
        double v = dataInputStream.readDouble();
        String s = dataInputStream.readUTF();
        System.out.println(i);
        System.out.println(v);
        System.out.println(s);
        dataInputStream.close();

    }


    private static void url() throws IOException {
        String url = "http://google.com";
        try (InputStream inUrl = new URL(url).openStream();
             InputStreamReader inputStreamReader = new InputStreamReader(inUrl);
             BufferedReader br = new BufferedReader(inputStreamReader)) {
            String s;
            List<String> strings = new ArrayList<>();
            while ((s = br.readLine()) != null) {
                strings.add(s);

            }
            strings.forEach(System.out::println);

        } catch (IOException e) {
            throw new IOException("Exeption when open your URL" + url);


        }

    }

    private static void zipStream() throws IOException {
        String fileName = "E:\\Hillel\\text7";
        String fipFileName = "E:\\Hillel\\output.zip";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(fipFileName));
             FileInputStream fis = new FileInputStream(fileName)) {
            ZipEntry entry1 = new ZipEntry("text7");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
            zout.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());


        }
    }
    public static void ObjectStream()throws IOException,ClassNotFoundException{
        ObjectInputStream objectInputStream=new ObjectInputStream(
                new FileInputStream("object.date"));
        byte width=12;


    }



    static class Car implements Serializable {
        static long serialVersionUID = 57631562110954875L;
        public static String ss;
        public int id;
        List<Weel> weels;
        String name;

        public Car() {
        }

        public Car(int id, List<Weel> weels) {
            this.id = id;
            this.weels = weels;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", weel=" + weels +
                    '}';
        }
    }

    static class TeslaCar extends Car implements Serializable {
        public TeslaCar(int id, List<Weel> weels) {
            super(id, weels);
        }

        @Override
        public String toString() {
            return "TeslaCar{" +
                    "id=" + id +
                    ", weels=" + weels +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    static class Weel implements Externalizable {
        static long serialVersionUID = 57631562110954335L;
        int radus;
        byte width;
        String vendor;

        public Weel() {
        }

        public Weel(int radus, byte width, String vendor) {
            this.radus = radus;
            this.width = width;
            this.vendor = vendor;
        }

        @Override
        public String toString() {
            return "Weel{" +
                    "radus=" + radus +
                    ", width=" + width +
                    ", vendor='" + vendor + '\'' +
                    '}';
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(radus);
            out.writeByte(width);
            out.writeUTF(vendor);
            out.flush();
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            radus = in.readInt();
            width = in.readByte();
            vendor = in.readUTF();
            // System.out.println("readExternal o " + (Integer) in.readInt());
           /*

            in.close();*/
        }
    }


}