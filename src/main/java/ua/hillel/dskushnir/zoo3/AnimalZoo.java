package ua.hillel.dskushnir.zoo3;

public class AnimalZoo {
    AnimalSick animalSick;

    public AnimalZoo(AnimalSick animalSick) {
        this.animalSick = animalSick;
    }

    public boolean isSick() {
        return animalSick.isSick();
    }

    public void sick() {
        animalSick.sick();
    }

    public void noSick() {
        animalSick.noSick();
    }

    public void registerObserverSick(ObserverSick observerSick) {
        animalSick.registerObserverSick(observerSick);
    }

    public void removeObserverSick(ObserverSick observerSick) {
        animalSick.removeObserverSick(observerSick);
    }

    public void notifyObserverSick() {
        animalSick.notifyObserverSick();
    }
}
