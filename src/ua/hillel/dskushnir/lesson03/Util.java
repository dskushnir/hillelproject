package ua.hillel.dskushnir.lesson03;

public class Util {
        public static boolean isPalindrom(String string) {
        String convert = string.replaceAll("[^A-Za-z]+", "").toLowerCase();
        if ( convert.isEmpty()) {
            System.out.println("String is empty");
            return false;

        }
        int leftPosition = 0;
        int rightPosition = convert.length() - 1;
        while (leftPosition < rightPosition) {
            if (convert.charAt(leftPosition++) != convert.charAt(rightPosition--)) {
                System.out.println();
                System.out.println(string + " - It is not  palindrome ");
                return false;
            }
        }
            System.out.println(string + " -  It is a palindrome ");
        return true;
    }
}
