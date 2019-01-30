package ua.hillel.dskushnir.lesson11;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer sum = myScanner.nextInt();
        List<Integer> list = List.of(8, 9, 4, 5, 1);
        Map<Integer, Integer> map = new HashMap<>();
        map(list, sum,map);


    }

    private  static void map(List<Integer> list, Integer sum,Map<Integer,Integer>map) {
        for (int i = 0; i < list.size(); i++) {
            map.put(sum-list.get(i),i);
            if (map.containsKey(list.get(i))) {
                System.out.println(map.get(list.get(i)) + "+" + map.get(sum - list.get(i)));
            }
            else {
                System.out.println("Number not found");
            }



        }


    }

}









