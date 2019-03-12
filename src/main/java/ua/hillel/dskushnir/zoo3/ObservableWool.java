package ua.hillel.dskushnir.zoo3;

import java.util.ArrayList;

public class ObservableWool implements WoolObservable {
    ArrayList<ObserverWool>observerWools=new ArrayList<ObserverWool>();
    WoolObservable animal;

    public ObservableWool(WoolObservable animal) {
        this.animal = animal;
    }

    @Override
    public void registerObserverWool(ObserverWool observerWool) {
        observerWools.add(observerWool);

    }

    @Override
    public void removeObserverWool(ObserverWool observerWool) {
        int i =observerWools.indexOf(observerWool);
        if (i>=0){
            observerWools.remove(i);
        }

    }

    @Override
    public void notifyObserverWool() {
        for (ObserverWool o:observerWools){
            o.update(animal);
        }

    }
}
