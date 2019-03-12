package ua.hillel.dskushnir.lesson23;

public interface SubjectSick {
    void registerObserverSick(ObserverSick observerSick);
    void removeObserverSick(ObserverSick observerSick);
    void notifyObserverSick();
}
