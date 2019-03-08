package ua.hillel.dskushnir.lesson23;

import java.time.LocalDate;

public class HomeAnimal extends Animal   {
    public HomeAnimal(int id, LocalDate localDate) {
        super(id, localDate);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setProblem(boolean problem) {
        super.setProblem(problem);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public LocalDate getLocalDate() {
        return super.getLocalDate();
    }

    @Override
    public void setLocalDate(LocalDate localDate) {
        super.setLocalDate(localDate);
    }

    @Override
    public void registerObserver(Observer o) {
        super.registerObserver(o);
    }

    @Override
    public void removeObserver(Observer o) {
        super.removeObserver(o);
    }

    @Override
    public void problem() {
        super.problem();
    }

    @Override
    public void noProblem() {
        super.noProblem();
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public boolean isProblem() {
        return super.isProblem();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





