package ua.hillel.dskushnir.zoo2;

public class AnimalHW implements Sickable {
    private String name;



    Odservable odservable;

    public AnimalHW() {
        odservable=new Odservable(this);
    }

    @Override
    public void sick() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        odservable.registerObserver(observer);

    }

    @Override
    public void notifyObservers() {
        odservable.notifyObservers();








    }
}
