package ua.hillel.dskushnir.lesson23;

import java.time.LocalDate;

public class WildAnimal extends Animal {
    public WildAnimal(int id, LocalDate localDate) {
        super(id, localDate);
    }

    @Override
    public int getId() {
        return super.getId();
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
    public void notifyObservers() {
        super.notifyObservers();
    }
}

