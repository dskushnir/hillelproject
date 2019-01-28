package ua.hillel.dskushnir.lesson12.interfaces;
import java.util.List;

interface AbstractDao<T> {
    T create(T course);

    void update(T course);

    void delete(T course);

    T findbyId(Integer id);

    List<T> getAll();

}
