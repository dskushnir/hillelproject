package ua.hillel.dskushnir.zoo2;

public class Zoo2Main {
    public static void main(String[] args) {
        DoctorAnimal doctorAnimal=new DoctorAnimal();
        AnimalHW animalHW=new AnimalHW();
        animalHW.registerObserver(doctorAnimal);
        animalHW.sick();
    }
}
