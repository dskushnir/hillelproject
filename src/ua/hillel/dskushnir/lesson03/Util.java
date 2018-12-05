package ua.hillel.dskushnir.lesson03;

class Task3 {

    public static void main(String[] args) {
        String string = "Not New York, Roy went on";
        if (isPalindrom(string)) {
            System.out.println(string + " -  It is a palindrome ");
        } else System.out.println(string + " - It is not  palindrome ");

    }

    private static boolean isPalindrom(String string) {
        String convert = string.replaceAll("[^A-Za-z]+", "").toLowerCase();
        if ( convert.isEmpty()) {
            return false;
        }
        int leftPosition = 0;
        int rightPosition = convert.length() - 1;
        while (leftPosition < rightPosition) {
            if (convert.charAt(leftPosition++) != convert.charAt(rightPosition--)) {
                return false;
            }
        }
        return true;
    }
}
