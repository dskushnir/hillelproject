package ua.hillel.dskushnir.zoo3;

import java.util.ArrayList;

public class ObservableHunger  implements HungerObservable {
    ArrayList<ObserverHunger>observerHungers=new ArrayList<ObserverHunger>();
    HungerObservable animal;

    public ObservableHunger(HungerObservable animal) {
        this.animal = animal;
    }

    @Override
    public void registerObserverHunger(ObserverHunger observerHunger) {
        observerHungers.add(observerHunger);

    }

    @Override
    public void removeObserverHunger(ObserverHunger observerHunger) {
        int i= observerHungers.indexOf(observerHunger);
        if (i>=0){
            observerHungers.remove(i);
        }

    }

    @Override
    public void notifyObserverHunger() {
        for (ObserverHunger o:observerHungers){
            o.update(animal);
        }

    }
}



