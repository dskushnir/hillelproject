package ua.hillel.dskushnir.lesson23;

public  class Hunger implements Problem {
    private boolean isHunger;
    @Override
    public boolean isProblem() {
        return isHunger;
    }

    @Override
    public void problem() {
        isHunger=true;

    }

    @Override
    public void noProblem() {
        isHunger=false;

    }
}


