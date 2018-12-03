package ua.hillel.dskushnir.lesson03;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Task5 {
    public static void main(String[] args) {
        int mounth = 240;
        BigDecimal rateOfYear = new BigDecimal(0.2);
        BigDecimal initialAmount = new BigDecimal(1000.00);
        BigDecimal monthlyAmount = new BigDecimal(100.00);
        BigDecimal mountOfYear = new BigDecimal(12.00);
        BigDecimal coeffCount = new BigDecimal(1);
        BigDecimal[] array = new BigDecimal[mounth + 1];
        initDepositArray(array, rateOfYear, mountOfYear, coeffCount, initialAmount, monthlyAmount);
        System.out.println("Balance on deposit at the end of each month ");
        printDepositArray(array);
        System.out.println("The amount of the pension deposit  is = ");
        printDepositAmount(array, mounth);
    }

    private static void initDepositArray(BigDecimal[] array, BigDecimal rateOfYear, BigDecimal mounthOfYear, BigDecimal coefCount, BigDecimal initialAmount, BigDecimal monthlyAmount) {
        for (int i = 0; i < array.length; i++) {
            array[0] = initialAmount;
        }
        for (int i = 1; i < array.length; i++) {
            BigDecimal rateOfMounth = rateOfYear.divide(mounthOfYear, 2, RoundingMode.CEILING);
            BigDecimal coefAmounthOfMounth = coefCount.add(rateOfMounth);
            array[i] = (((array[i - 1].add(monthlyAmount))).multiply(coefAmounthOfMounth, MathContext.DECIMAL32)).setScale(2, RoundingMode.CEILING);
        }
    } private static void printDepositArray(BigDecimal[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printDepositAmount(BigDecimal[] array, int mounth)
    {
        System.out.print(array[mounth] + " ");
    }
}


