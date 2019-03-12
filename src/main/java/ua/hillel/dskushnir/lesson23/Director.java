package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;

public class Director  implements ObserverSick,ObserverHunger,ObserverWool{
    @Override
    public void updateHunger(Animal animal, LocalDate localDate) {


        System.out.println("Director say: "+animal.toString()+"- is hungry! Keeper -Help!!!");

    }

    @Override
    public void updateSick(Animal animal,LocalDate localDate) {

        System.out.println("Director say:  "+animal.toString()+"-is sick! Doctor -Help!!!");

    }

    @Override
    public void updateWool(Animal animal,LocalDate localDate) {

        System.out.println("Director say:"+animal.toString()+"Shaggy animal! Groomer -Help!!!");

    }





}

