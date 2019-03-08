package ua.hillel.dskushnir.lesson23;
public abstract class Person implements  Observer{
    @Override
    public void update(Animal animal) {
        animal.noProblem();

    }
}
