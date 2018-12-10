package ua.hillel.dskushnir.lesson05;

import java.util.Arrays;

public class Complex implements Comparable<Complex> {
    private final double real;
    private final double imaginary;



    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }


    @Override
    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double mod() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public Complex plus(Complex z) {

        return new Complex(real + z.real, imaginary + z.imaginary);
    }

    public Complex minus(Complex z) {

        return new Complex(real - z.real, imaginary - z.imaginary);
    }

    public Complex divid(Complex z) {

        double m = z.mod();

        return new Complex((real * z.real - imaginary * z.imaginary) / m, (imaginary * z.real - real * z.imaginary) / m);
    }

    public Complex mult(Complex z) {

        return new Complex(real * z.real - imaginary * z.imaginary, real * z.imaginary + imaginary * z.real);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Complex that = (Complex) obj;
        return (this.real == that.real) && (this.imaginary == that.imaginary);
    }

    @Override
    public int compareTo(Complex o) {
        if(this.real< o.real)
        {
            return -1;
        }
        else if(this.real > o.real)
        {
            return 1;
        }
        return 0;
    }


}




















