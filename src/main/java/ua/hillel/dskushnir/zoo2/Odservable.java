package ua.hillel.dskushnir.zoo2;

import java.util.ArrayList;

public class Odservable implements SickObservable {

    ArrayList<Observer>observers= new ArrayList<Observer>();
    SickObservable animal;

    public Odservable(SickObservable animal) {
        this.animal = animal;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(animal);

        }

    }
}
