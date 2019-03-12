package ua.hillel.dskushnir.lesson23;

import java.time.LocalDate;

public class Doctor implements ObserverSick,ObserverHunger{

     @Override
     public void updateHunger(Animal animal, LocalDate localDate) {
         System.out.println("Doktor say:"+animal.toString()+"Keeper must help!");

     }

     @Override
     public void updateSick(Animal animal,LocalDate localDate) {
         animal.animalNoSick();
         System.out.println("Doctor say:"+animal.toString()+"is healthy !");

     }

 }
