package ua.hillel.dskushnir.lesson03;

public class Task1 {
    public static void main(String[] args) {
        char ch1 = '*';
        char ch2 = ' ';
        String initials =
                "* * * *  \n" + "*    * \n" + "*   *  *\n" + "* *    *\n" + "*   *  *\n" + "*    * \n" + "* * * *";
        System.out.println(initials);
        countSymbol(initials, ch1);
        countSymbol(initials,ch2);
    }
    private static void countSymbol(String string, char ch ){
        int counter = 0;
        if (string.isEmpty()) {
            System.out.println("String is empty");
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ch) {
                    counter++;
                }

            }
            System.out.println("Characters" + ch + "=" + counter);
        }
    }
}