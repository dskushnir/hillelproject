package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;

public class Groomer implements ObserverWool {
    @Override
    public void updateWool(Animal animal, LocalDate localDate) {
        animal.animalNoWool();
        System.out.println("Groomer say: "+animal.toString()+"Haircut - OK!");
    }
}

