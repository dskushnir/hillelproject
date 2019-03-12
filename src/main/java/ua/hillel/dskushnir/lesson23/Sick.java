package ua.hillel.dskushnir.lesson23;

public  class Sick implements Problem {
    private boolean isSick;

    @Override
    public boolean isProblem() {
        return isSick;
    }

    @Override
    public void problem() {

        isSick=true;
    }

    @Override
    public void noProblem() {
        isSick=false;

    }






}

