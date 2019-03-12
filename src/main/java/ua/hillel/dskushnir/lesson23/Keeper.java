package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;

public abstract class Keeper implements ObserverHunger{
    @Override
    public void updateHunger(Animal animal, LocalDate localDate) {
        animal.animalNoHunger();


    }
}
