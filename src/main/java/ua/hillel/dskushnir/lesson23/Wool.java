package ua.hillel.dskushnir.lesson23;

public class Wool implements Problem {
    private boolean isWool;
    @Override
    public boolean isProblem() {
        return isWool;
    }

    @Override
    public void problem() {
        isWool=true;

    }

    @Override
    public void noProblem() {
        isWool=false;

    }
}
