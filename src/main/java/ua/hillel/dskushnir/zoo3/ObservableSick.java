package ua.hillel.dskushnir.zoo3;



import java.util.ArrayList;

public class ObservableSick implements SickObservable {
    ArrayList<ObserverSick>observerSicks=new ArrayList<ObserverSick>();
    SickObservable animal;

    public ObservableSick(SickObservable animal) {
        this.animal = animal;
    }

    @Override
    public void registerObserverSick(ObserverSick observerSick) {
        observerSicks.add(observerSick);

    }

    @Override
    public void removeObserverSick(ObserverSick observerSick) {
        int i=observerSicks.indexOf(observerSick);
        if (i>=0){
            observerSicks.remove(i);
        }

    }

    @Override
    public void notifyObserverSick() {
        for (ObserverSick o : observerSicks) {
            o.update(animal);


        }
    }
}
