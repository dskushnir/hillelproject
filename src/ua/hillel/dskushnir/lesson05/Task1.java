package ua.hillel.dskushnir.lesson05;

public class Task1 {
    public static void main(String[] args){

        Complex complex1=new Complex(6.0,8.0);
        Complex complex2=new Complex(-2.0,6.0);
        Complex complex3=new Complex(0.5,1.5);
        System.out.println("Complex1 = "+complex1);
        System.out.println("Complex2 = "+complex2);
        System.out.println("Complex3 = "+complex3);
        System.out.println("Real(complex1)="+complex1.getReal());
        System.out.println("Imaginary(complex1)="+ complex1.getImaginary());
        System.out.println("Real(complex2)="+complex2.getReal());
        System.out.println("Imaginary(complex2)="+ complex2.getImaginary());
        System.out.println("Complex1 + complex2="+complex1.plus(complex2));
        System.out.println("Complex2 + complex1="+complex2.minus(complex1));
        System.out.println("Complex1 /complex2="+complex1.divid(complex2));
        System.out.println("Complex1 *complex2="+complex1.mult(complex2));
        System.out.println("|complex1|="+complex1.mod());
        System.out.println("|complex2|="+complex2.mod());
        if (complex3.equals(complex1)){
            System.out.println("Complex3 equals complex1");
        }else {
            System.out.println("Complex3 not equals complex1");

        }
    }
}
