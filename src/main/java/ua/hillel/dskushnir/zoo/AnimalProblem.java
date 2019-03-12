package ua.hillel.dskushnir.zoo;

import java.util.ArrayList;
import java.util.List;

public class AnimalProblem extends IsRealProblem implements Subject {
   /* public String name;

    public AnimalProblem(String name) {
        this.name = name;
    }*/
    private List<ObserverProblem> observerPr=new ArrayList<>();

    @Override
    public void registerObserverProblem(ObserverProblem observerProblem) {
        observerPr.add(observerProblem);

    }

    @Override
    public void removeObserverProblem(ObserverProblem observerProblem) {
        int i=observerPr.indexOf(observerProblem);
        if (i>=0){
            observerPr.remove(i);
        }
    }

    @Override
    public void notifyObserverProblem() {
        for (ObserverProblem o : observerPr) {
            o.updateProblem(this);
        }
    }

    @Override
    public void problem() {
        super.problem();
        notifyObserverProblem();
    }

    @Override
    public void noProblem() {
        super.noProblem();
    }
}
