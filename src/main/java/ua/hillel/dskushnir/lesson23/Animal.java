package ua.hillel.dskushnir.lesson23;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal extends RealProblem implements Subject {
    public int id;
    public LocalDate localDate;
    private List<Observer> observers =new ArrayList<>();

    public Animal(int id, LocalDate localDate) {
        this.id = id;
        this.localDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

   @Override
    public void setProblem(boolean problem) {
        super.setProblem(problem);
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
        notifyObservers();
    }

    @Override
    public void noProblem() {
        super.noProblem();
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

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", localDate=" + localDate +
                '}';
    }
}





