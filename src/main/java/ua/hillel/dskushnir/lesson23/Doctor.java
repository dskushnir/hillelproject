package ua.hillel.dskushnir.lesson23;

public class Doctor extends Person implements Answer{

    @Override
    public void update(Animal animal) {
        super.update(animal);
        answer();
    }

    @Override
    public void answer() {
        System.out.println("Health Ok");
    }
}
