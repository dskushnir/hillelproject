package ua.hillel.dskushnir.lesson12.services;

import ua.hillel.dskushnir.lesson12.dao.staticDao.CourseDaoImpl;
import ua.hillel.dskushnir.lesson12.interfaces.CourseDao;
import ua.hillel.dskushnir.lesson12.model.*;

import java.util.List;

public class CourseService {
    private static CourseDao courseDao = new CourseDaoImpl();

    public static Course saveAllCource(Course course) {
        List<Lesson> lessons = course.getLessons();
        List<Student> students = course.getStudents();
        List<Task>tasks=course.getTasks();
        Teacher teacher=course.getTeacher();

        return courseDao.create(course);
    }
}
