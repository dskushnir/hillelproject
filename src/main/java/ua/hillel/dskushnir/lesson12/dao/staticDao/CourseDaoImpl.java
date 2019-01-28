package ua.hillel.dskushnir.lesson12.dao.staticDao;

import ua.hillel.dskushnir.lesson12.interfaces.CourseDao;
import ua.hillel.dskushnir.lesson12.model.Course;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CourseDaoImpl implements CourseDao {
    static private Map<Integer, Course> courses =
            new LinkedHashMap<>();
    static private int i = 10;

    @Override
    public Course create(Course course) {
        int id = i++;
        course.setId(id);
        courses.put(id, course);
        return course;
    }



    @Override
    public void update(Course course) {

        Integer id = course.getId();
        courses.put(id, course);

    }

    @Override
    public void delete(Course course) {
        courses.remove(course.getId());
    }

    @Override
    public Course findbyId(Integer id) {
        return courses.get(id);
    }

    @Override
    public List<Course> getAll() {
        return new ArrayList<>(courses.values());
    }
}