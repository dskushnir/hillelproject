package ua.hillel.dskushnir.lesson23;

public abstract class RealProblem implements Problem{
    public boolean isProblem;

    public void setProblem(boolean problem) {
        isProblem = problem;
    }

    @Override
    public boolean isProblem() {
        return isProblem;
    }
    public void problem(){
        isProblem=true;
    }
    public void healed(){
        isProblem=false;
    }

}
