package ua.hillel.dskushnir.zoo;

public class ZooTest {
    public static void main(String[] args) {
        AnimalZoo animalZoo=new AnimalZoo("Cat");
        PersonProblem personProblem=new PersonProblem();
        animalZoo.registerObserverProblem(personProblem);
        animalZoo.problem();
    }
}
