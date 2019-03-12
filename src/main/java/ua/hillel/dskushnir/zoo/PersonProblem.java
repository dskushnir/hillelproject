package ua.hillel.dskushnir.zoo;

public class PersonProblem implements ObserverProblem {
    @Override
    public void updateProblem(AnimalProblem animalProblem) {
        System.out.println("Ok");
    }
}
