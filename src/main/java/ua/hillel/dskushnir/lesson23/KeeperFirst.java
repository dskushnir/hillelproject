package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;

public class KeeperFirst extends Keeper {
    @Override
    public void updateHunger(Animal animal, LocalDate localDate) {
        super.updateHunger(animal,localDate);
        System.out.println("KeeperFirst say:"+animal.toString()+" - Food -OK!");
    }
}
