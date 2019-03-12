package ua.hillel.dskushnir.zoo3;



public class AnimalSick implements Sickable {

   private ObservableSick observableSick=new ObservableSick(this);

    public AnimalSick(ObservableSick observableSick) {
        this.observableSick = observableSick;
    }


    private boolean isSick;


    @Override
    public boolean isSick() {
        return isSick;
    }

    @Override
    public void sick() {
        isSick=true;
        notifyObserverSick();

    }

    @Override
    public void noSick() {
        isSick=false;

    }

    @Override
    public void registerObserverSick(ObserverSick observerSick) {
        observableSick.registerObserverSick(observerSick);


    }

    @Override
    public void removeObserverSick(ObserverSick observerSick) {
        observableSick.removeObserverSick(observerSick);

    }

    @Override
    public void notifyObserverSick() {
        observableSick.notifyObserverSick();

    }



}
