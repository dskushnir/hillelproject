package ua.hillel.dskushnir.lesson12.dao.staticDao;

import ua.hillel.dskushnir.lesson12.interfaces.StudentDao;
import ua.hillel.dskushnir.lesson12.model.Student;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {
    static private Map<Integer, Student> students =
            new LinkedHashMap<>();
    static private int i = 10;
    @Override

    public Student create(Student student) {
        int id=i++;
        student.setId(id);
        students.put(id,student);
        return student;
    }

    @Override
    public void update(Student student) {
        Integer id= student.getId();
        students.put(id,student);

    }

    @Override
    public void delete(Student student) {
        students.remove(student.getId());


    }

    @Override
    public Student findbyId(Integer id) {

        return students.get(id);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }
}
