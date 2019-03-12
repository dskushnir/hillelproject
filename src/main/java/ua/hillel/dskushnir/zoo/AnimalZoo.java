package ua.hillel.dskushnir.zoo;

public class AnimalZoo extends AnimalProblem {
   public String name;

    public AnimalZoo(String name) {
        this.name = name;
    }

    @Override
    public void registerObserverProblem(ObserverProblem observerProblem) {
        super.registerObserverProblem(observerProblem);
    }

    @Override
    public void removeObserverProblem(ObserverProblem observerProblem) {
        super.removeObserverProblem(observerProblem);
    }

    @Override
    public void notifyObserverProblem() {
        super.notifyObserverProblem();
    }

    @Override
    public void problem() {
        super.problem();
    }

    @Override
    public void noProblem() {
        super.noProblem();
    }
}
