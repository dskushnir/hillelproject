package ua.hillel.dskushnir.zoo;

import ua.hillel.dskushnir.lesson23.Problem;

public class IsRealProblem  implements Problem {
    public boolean isRealProblem;
    @Override
    public boolean isProblem() {
        return isRealProblem;
    }

    @Override
    public void problem() {
        isRealProblem=true;

    }

    @Override
    public void noProblem() {
        isRealProblem=false;

    }
}
