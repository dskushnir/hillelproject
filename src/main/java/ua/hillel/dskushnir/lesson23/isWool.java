package ua.hillel.dskushnir.lesson23;

public interface isWool extends Problem {
    @Override
    default boolean isProblem() {
        return false;
    }

    @Override
    default void problem() {

    }

    @Override
    default void noProblem() {

    }
}
