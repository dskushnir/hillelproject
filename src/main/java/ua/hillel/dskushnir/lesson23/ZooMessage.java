package ua.hillel.dskushnir.lesson23;



public class ZooMessage {
    public static void main(String[] args) {
        Doctor doctor=new Doctor();
        KeeperFirst keeperFirst=new KeeperFirst();
        KepperSecond kepperSecond=new KepperSecond();
        Director director=new Director();
        Groomer groomer=new Groomer();



        Pig pig=new Pig(456);
        pig.registerObserverHunger(director);
        pig.registerObserverHunger(doctor);
        pig.registerObserverSick(director);
        pig.registerObserverSick(doctor);
        pig.registerObserverWool(director);
        pig.registerObserverWool(groomer);
        pig.registerObserverHunger(keeperFirst);
        pig.animalWool();
        System.out.println();
        pig.animalSick();
        System.out.println();
        pig.animalHunger();
        System.out.println();

        Tiger tiger=new Tiger(789);
        tiger.registerObserverHunger(director);
        tiger.registerObserverHunger(doctor);
        tiger.registerObserverHunger(keeperFirst);
        tiger.registerObserverSick(director);
        tiger.registerObserverSick(doctor);
        System.out.println();
        tiger.animalSick();
        System.out.println();
        tiger.animalHunger();
        tiger.removeObserverHunger(keeperFirst);
        tiger.registerObserverHunger(kepperSecond);
        System.out.println();
        tiger.animalHunger();

    }
}
