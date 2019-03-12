package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements SubjectSick,SubjectHunger,SubjectWool {
    private int id;
    private ProblemAnimal sick=new ProblemAnimal();
    private ProblemAnimal hunger=new ProblemAnimal();
    private ProblemAnimal wool=new ProblemAnimal();
    private List<ObserverSick> observerS =new ArrayList<>();
    private List<ObserverHunger>observerH=new ArrayList<>();
    private List<ObserverWool>observerW=new ArrayList<>();

    public Animal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void animalSick(){
        sick.problem();
        notifyObserverSick();
    }
    public void animalNoSick(){
        sick.noProblem();
    }

    public void animalHunger(){
        hunger.problem();
      notifyObserverHunger();
    }
    public void animalNoHunger(){
        hunger.noProblem();
    }

    public void animalWool(){
        wool.problem();
        notifyObserverWool();
    }
    public void animalNoWool() {
        wool.noProblem();

    }

    @Override
    public void registerObserverHunger(ObserverHunger observerHunger) {
        observerH.add(observerHunger);
    }

    @Override
    public void removeObserverHunger(ObserverHunger observerHunger) {
        int i = observerH.indexOf(observerHunger);
        if (i >= 0) {
            observerH.remove(i);
        }
    }

    @Override
    public void notifyObserverHunger() {
        for (ObserverHunger o : observerH) {
            o.updateHunger(this,
                    LocalDate.now());
        }
    }

    @Override
    public void registerObserverSick(ObserverSick observerSick) {
        observerS.add(observerSick);
    }

    @Override
    public void removeObserverSick(ObserverSick observerSick) {
        int i = observerS.indexOf(observerSick);
        if (i >= 0) {
            observerS.remove(i);
        }
    }

    @Override
    public void notifyObserverSick() {
        for (ObserverSick o:observerS){
            o.updateSick(this,LocalDate.now() );
        }
    }

    @Override
    public void registerObserverWool(ObserverWool observerWool) {
        observerW.add(observerWool);

    }

    @Override
    public void removeObserverWool(ObserverWool observerWool) {
        int i = observerW.indexOf(observerWool);
        if (i >= 0) {
            observerW.remove(i);
        }
    }

    @Override
    public void notifyObserverWool() {
        for (ObserverWool o:observerW){
            o.updateWool(this,LocalDate.now() );
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "id=" + id +
                ", "+ LocalDate.now() +
                '}';

    }
}





