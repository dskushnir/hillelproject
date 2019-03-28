package ua.hillel.dskushnir.lesson27;

import java.util.ArrayList;
import java.util.List;

public class Pass {
    public static void main(String[] args) {
        System.out.println(generateSymbols());
    }

    private static List<Character> generateSymbols() {
        List<Character> symbols = new ArrayList<Character>();
        for (char c='0'; c<='9'; c++) symbols.add(c);
        for (char c='A'; c<='Z'; c++) symbols.add(c);
        for (char c='a'; c<='z'; c++) symbols.add(c);
        return symbols;
    }
}
