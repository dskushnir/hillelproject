package ua.hillel.dskushnir.zoo3;
public interface SickObservable {
    void registerObserverSick(ObserverSick observerSick);
    void removeObserverSick(ObserverSick observerSick);
    void notifyObserverSick();



}
