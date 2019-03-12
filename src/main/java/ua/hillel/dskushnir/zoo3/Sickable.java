package ua.hillel.dskushnir.zoo3;

public interface Sickable extends SickObservable {
    boolean isSick();
    void sick();
    void  noSick();
}
