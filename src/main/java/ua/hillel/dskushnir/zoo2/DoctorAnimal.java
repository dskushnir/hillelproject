package ua.hillel.dskushnir.zoo2;

public class DoctorAnimal implements Observer {
    @Override
    public void update(SickObservable animal) {
        System.out.println("Ok");
    }
}
