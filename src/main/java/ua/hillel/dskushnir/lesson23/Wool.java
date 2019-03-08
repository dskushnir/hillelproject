package ua.hillel.dskushnir.lesson23;

public abstract class Wool implements Problem {
    private boolean isWool;
    public void setWool(boolean wool){
        isWool=wool;

    }
    @Override
    public boolean isProblem() {
        return isWool;
    }
    public void wool(){
        isWool=true;
    }
    public void noWool(){
        isWool=false;
    }
}
