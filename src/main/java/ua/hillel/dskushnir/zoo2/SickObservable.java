package ua.hillel.dskushnir.zoo2;

public interface SickObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();

}
