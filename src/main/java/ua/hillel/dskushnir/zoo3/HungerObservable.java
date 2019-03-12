package ua.hillel.dskushnir.zoo3;

public interface HungerObservable {
    void registerObserverHunger(ObserverHunger observerHunger);
    void removeObserverHunger(ObserverHunger observerHunger);
    void notifyObserverHunger();


}
