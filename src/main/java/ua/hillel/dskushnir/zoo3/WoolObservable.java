package ua.hillel.dskushnir.zoo3;

public interface WoolObservable {
    void registerObserverWool(ObserverWool observerWool);
    void removeObserverWool(ObserverWool observerWool);
    void notifyObserverWool();

}
