package ua.hillel.dskushnir.lesson23;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        Doctor doctor1=new Doctor();
        KeeperFirst keeperFirst=new KeeperFirst();
        KepperSecond kepperSecond=new KepperSecond();
        Director director=new Director();
        Groomer groomer=new Groomer();


        Pig pig=new Pig(456,LocalDate.now());
        System.out.println(pig);
        pig.registerObserver(director);
        pig.registerObserver(doctor1);
        pig.registerObserver(keeperFirst);
        pig.registerObserver(groomer);
        pig.problem();
        System.out.println();


        Tiger tiger=new Tiger(123,LocalDate.now());
        System.out.println(tiger);
        tiger.registerObserver(director);
        tiger.registerObserver(doctor1);
        tiger.registerObserver(kepperSecond);
        tiger.problem();




    }
}
