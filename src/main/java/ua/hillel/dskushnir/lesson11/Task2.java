package ua.hillel.dskushnir.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);

        }
        for (int i = 0; i <5 ; i++) {

            System.out.println(+ arrayList.get(i));
        }
        System.out.println();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number>0");
        int n = myScanner.nextInt();
        ArrayList<Integer>arrayList1=new ArrayList<>();
        if (n==0 || n<0){
            throw new IllegalArgumentException("Value of n <0 or n=0, enter n>0");
        }
        for (int i = 0; i < n; i++) {
            arrayList1.add(i+1);

            System.out.println(arrayList1.get(i));

        }
        System.out.println();

        Collections.reverse(arrayList1);

        System.out.println();
        Collections.reverse(arrayList1);
        for (int i = 0; i <n ; i++) {
            if (arrayList1.get(i) % 3 == 0) {

                System.out.println(arrayList1.get(i));

            }
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {

            if (arrayList1.get(i) % 2 == 0) {

                System.out.println(arrayList1.get(i));
            }
        }
        System.out.println();
        double sum=0;
        double avarage =0;
        for (int i = 0; i <n ; i++) {
            sum = sum + arrayList1.get(i);
            avarage = sum/n;
        }
            System.out.println("sum=" +sum);
        System.out.println("avarage="+ avarage);
        System.out.println();
        System.out.println("max valur" +Collections.max(arrayList1));
        System.out.println("min vslue"  +Collections.min(arrayList1));
        int sumMinMax = Collections.max(arrayList1)+Collections.min(arrayList1);
        System.out.println("Sum Min + Max =" +sumMinMax);
        System.out.println();
        int mult = 1;
        for (int i = 0; i < n; i++) {
            if (arrayList1.get(i) % 2 != 0) {
                mult *= arrayList1.get(i);
            }
        }
        System.out.println("product of odd elements ="+ mult);
        System.out.println();
        System.out.println("Enter a number");
        int m = myScanner.nextInt();
        int index =arrayList1.indexOf(m);
        if (index!=-1){
            System.out.println("Value is found, index of value ="+ index);
        }else {
            System.out.println("Value is not found");
        }
    }
}
