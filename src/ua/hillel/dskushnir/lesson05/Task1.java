package ua.hillel.dskushnir.lesson05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Complex complex1 = new Complex(6.0, 2.0);
        Complex complex2 = new Complex(-2.0, 6.0);
        Complex complex3 = new Complex(0.5, 1.5);
        Complex complex4 = new Complex(2.0, 1.0);
        Complex complex5 = new Complex(10.0, 3.5);
        Complex[] arrayOfComplex1 = new Complex[5];
        arrayOfComplex1[0] = complex1;
        arrayOfComplex1[1] = complex2;
        arrayOfComplex1[2] = complex3;
        arrayOfComplex1[3] = complex4;
        arrayOfComplex1[4] = complex5;
        Arrays.sort(arrayOfComplex1);
        System.out.println("First array of Complex number: ");
        for (int i = 0; i <arrayOfComplex1.length ; i++) {

            System.out.println(arrayOfComplex1[i]+";");
        }
        Complex complex11 = new Complex(4.0, 8.0);
        Complex complex12 = new Complex(-1.0, 7.0);
        Complex complex13 = new Complex(3.5, 1.5);
        Complex complex14 = new Complex(9.0, 6.0);
        Complex complex15 = new Complex(12.0, 3.0);
        System.out.println();
        Complex[] arrayOfComplex11 = new Complex[5];
        arrayOfComplex11[0] = complex11;
        arrayOfComplex11[1] = complex12;
        arrayOfComplex11[2] = complex13;
        arrayOfComplex11[3] = complex14;
        arrayOfComplex11[4] = complex15;
        Arrays.sort(arrayOfComplex11);
        System.out.println("Second array of Complex number: ");

        for (int i = 0; i <arrayOfComplex11.length ; i++) {
            System.out.println(arrayOfComplex11[i]+";");
        }
        System.out.println();
        Complex res[]=new Complex[arrayOfComplex1.length+arrayOfComplex11.length];
        System.arraycopy(arrayOfComplex1,0,res,0,arrayOfComplex1.length);
        System.arraycopy(arrayOfComplex11,0,res,arrayOfComplex1.length,arrayOfComplex11.length);
        Arrays.sort(res);
        System.out.println("Result array of Complex number: ");
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]+ ";");
        }
        System.out.println();
        System.out.println("Complex1 = " + complex1);
        System.out.println("Complex2 = " + complex2);
        System.out.println("Complex3 = " + complex3);
        System.out.println("Real(complex1)=" + complex1.getReal());
        System.out.println("Imaginary(complex1)=" + complex1.getImaginary());
        System.out.println("Real(complex2)=" + complex2.getReal());
        System.out.println("Imaginary(complex2)=" + complex2.getImaginary());
        System.out.println("Complex1 + complex2=" + complex1.plus(complex2));
        System.out.println("Complex2 + complex1=" + complex2.minus(complex1));
        System.out.println("Complex1 /complex2=" + complex1.divid(complex2));
        System.out.println("Complex1 *complex2=" + complex1.mult(complex2));
        System.out.println("|complex1|=" + complex1.mod());
        System.out.println("|complex2|=" + complex2.mod());
        if (complex3.equals(complex1)) {
            System.out.println("Complex3 equals complex1");
        } else {
            System.out.println("Complex3 not equals complex1");
        }
    }
}


