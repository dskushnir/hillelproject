package ua.hillel.dskushnir.lesson13;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpMain {
    public static void main(String[] args) {
        boolean matches1="067-841-40-79".matches("\\d{3}-\\d{3}-\\d{2}-\\d{2}");
        System.out.println(matches1);
        boolean matches = "11d".matches("\\d+.");
        System.out.println(matches);
        String email = "login@domen.com";
        String s ="067-841-40-79 abasd 067-841-40-79 verve 067-841-40-79 verve";
        String[]split=s.split("\\d{3}-\\d{3}-\\d{2}-\\d{2}");
        System.out.println(Arrays.toString(split));
        String reges="\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(reges);
        Matcher matcher =pattern.matcher(s);
        while (matcher.find()){
            System.out.print("Start : " + matcher.start());
            System.out.print(" End : " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

    }

}
