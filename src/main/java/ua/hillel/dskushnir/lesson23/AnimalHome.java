package ua.hillel.dskushnir.lesson23;

public class AnimalHome extends Animal {
    public AnimalHome(int id) {
        super(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    @Override
    public void animalSick() {
        super.animalSick();
    }

    @Override
    public void animalNoSick() {
        super.animalNoSick();
    }


    @Override
    public void animalHunger() {
        super.animalHunger();
    }

    @Override
    public void animalNoHunger() {
        super.animalNoHunger();
    }



    @Override
    public void animalWool() {
        super.animalWool();
    }

    @Override
    public void animalNoWool() {
        super.animalNoWool();
    }

    @Override
    public void registerObserverHunger(ObserverHunger observerHunger) {
        super.registerObserverHunger(observerHunger);
    }

    @Override
    public void removeObserverHunger(ObserverHunger observerHunger) {
        super.removeObserverHunger(observerHunger);
    }

    @Override
    public void notifyObserverHunger() {
        super.notifyObserverHunger();
    }

    @Override
    public void registerObserverSick(ObserverSick observerSick) {
        super.registerObserverSick(observerSick);
    }

    @Override
    public void removeObserverSick(ObserverSick observerSick) {
        super.removeObserverSick(observerSick);
    }

    @Override
    public void notifyObserverSick() {
        super.notifyObserverSick();
    }

    @Override
    public void registerObserverWool(ObserverWool observerWool) {
        super.registerObserverWool(observerWool);
    }

    @Override
    public void removeObserverWool(ObserverWool observerWool) {
        super.removeObserverWool(observerWool);
    }

    @Override
    public void notifyObserverWool() {
        super.notifyObserverWool();
    }
}
