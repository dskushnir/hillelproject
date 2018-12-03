package ua.hillel.dskushnir.lesson03;

public class Task1 {
    public static void main(String[] args) {
        char ch1 = '*';
        char ch2 = ' ';
        String string =
                "* * * *  \n" + "*    * \n" + "*   *  *\n" + "* *    *\n" + "*   *  *\n" + "*    * \n" + "* * * *";
        System.out.println(string);
        countSymbol(string, ch1, ch2);

    }

    private static void countSymbol(String string, char ch1, char ch2) {
        int counter1 = 0;
        int counter2 = 0;
        if (string.isEmpty()) {
            System.out.println("String is empty");
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ch1) {
                    counter1++;
                }
                if (string.charAt(i) == ch2) {
                    counter2++;
                }
            }
            System.out.println("Characters * =" + counter1 + ", characters ' ' =" + counter2);

        }
    }


}