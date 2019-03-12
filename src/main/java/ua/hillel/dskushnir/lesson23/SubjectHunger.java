package ua.hillel.dskushnir.lesson23;

public interface SubjectHunger {
     void registerObserverHunger(ObserverHunger observerHunger);
     void removeObserverHunger(ObserverHunger observerHunger);
     void notifyObserverHunger();


}
