package ua.hillel.dskushnir.lesson12.dao.staticDao;

import ua.hillel.dskushnir.lesson12.interfaces.TeacherDao;
import ua.hillel.dskushnir.lesson12.model.Teacher;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TeacherDaoImpl implements TeacherDao {
    static private Map<Integer, Teacher> teachers=
            new LinkedHashMap<>();
    static private int i = 10;
    @Override
    public Teacher create(Teacher teacher) {
        int id = i++;
        teacher.setId(id);
        teachers.put(id, teacher);
        return teacher;

    }

    @Override
    public void update(Teacher teacher) {
        Integer id = teacher.getId();
        teachers.put(id, teacher);

    }

    @Override
    public void delete(Teacher teacher) {
        teachers.remove(teacher.getId());

    }

    @Override
    public Teacher findbyId(Integer id) {
        return teachers.get(id);
    }

    @Override
    public List<Teacher> getAll() {
        return new  ArrayList<>(teachers.values());
    }
}
