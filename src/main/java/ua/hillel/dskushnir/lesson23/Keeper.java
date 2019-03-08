package ua.hillel.dskushnir.lesson23;



public abstract class Keeper extends Person implements Answer{
    @Override
    public void update(Animal animal) {
        super.update(animal);
        answer();

    }

    @Override
    public void answer() {

        System.out.println("Food Ok");
    }
}
