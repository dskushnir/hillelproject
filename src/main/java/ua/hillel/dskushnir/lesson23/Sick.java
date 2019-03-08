package ua.hillel.dskushnir.lesson23;

public abstract class Sick implements Problem {
    private boolean isSick;
    public void setSick(boolean sick){
        isSick=sick;
    }
    @Override
    public boolean isProblem() {
        return isSick;
    }
    public void sick(){
        isSick=true;
    }
    public void noSick(){
        isSick=false;
    }

}

