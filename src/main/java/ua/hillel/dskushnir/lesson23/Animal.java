package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal extends RealProblem implements Subject {
    public int id;
    public LocalDate localDate;
    private ArrayList<Observer> observers;



    public Animal(int id, LocalDate localDate) {
        this.id = id;
        this.localDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);


    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }


    }

    @Override
    public void problem() {
        super.problem();
    }

    @Override
    public void healed() {
        super.healed();
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            o.update(this );
        }

    }

    @Override
    public boolean isProblem() {
        return super.isProblem();
    }
}





