package ua.hillel.dskushnir.zoo;

public interface Subject {
    void registerObserverProblem(ObserverProblem observerProblem);
    void removeObserverProblem(ObserverProblem observerProblem);
    void notifyObserverProblem();

}
