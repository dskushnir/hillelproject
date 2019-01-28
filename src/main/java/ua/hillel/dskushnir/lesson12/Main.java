package ua.hillel.dskushnir.lesson12;

import ua.hillel.dskushnir.lesson12.dao.staticDao.*;
import ua.hillel.dskushnir.lesson12.model.*;
import ua.hillel.dskushnir.lesson12.services.*;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Task(x, "Task " + x)
                ).collect(Collectors.toList());

        List<Lesson> lessons = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Lesson(x, "Lesson " + x)
                ).collect(Collectors.toList());

        List<Student> students = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Student(x, "Student " + x,
                        getHomeworks(lessons, tasks))
                ).collect(Collectors.toList());

        List<Course> courses = IntStream.rangeClosed(1, 2)
                .mapToObj(x ->
                        new Course(x, "course " + x, lessons,
                                new Teacher(x,"Techer"+x), students, tasks)
                ).collect(Collectors.toList());
        List<Topic>topics=IntStream.rangeClosed(1,5).mapToObj(x->new Topic(x,"Topic"+x)).collect(Collectors.toList());
        List<Teacher>teachers=IntStream.rangeClosed(1,2).mapToObj(x->new Teacher(x,"Teacher"+x)).collect(Collectors.toList());


        courses.forEach(course -> {
            Course course1 = CourseService.saveAllCource(course);
            System.out.println(course1);
        });
        System.out.println("---------------------");
        CourseDaoImpl courceDao = new CourseDaoImpl();
        Course course = courceDao.findbyId(11);
        System.out.println(course);
        System.out.println("---------------------");

        students.forEach(student -> {Student student1= StudentService.saveAllStudent(student);
            System.out.println(student1);
        });
        System.out.println("---------------------");
        StudentDaoImpl studentDao=new StudentDaoImpl();
        Student student=studentDao.findbyId(11);
        System.out.println(student);
        System.out.println("---------------------");

        lessons.forEach(lesson -> {Lesson lesson1= LessonService.saveAllLesson(lesson);
            System.out.println(lesson1);
        });
        System.out.println("---------------------");
        LessonDaoImpl lessonDao=new LessonDaoImpl();
        Lesson lesson=lessonDao.findbyId(11);
        System.out.println(lesson);
        System.out.println("---------------------");

        tasks.forEach(task -> {Task task1= TaskService.saveAllTask(task);
            System.out.println(task1);
        });
        System.out.println("---------------------");
        TaskDaoImpl taskDao=new TaskDaoImpl();
        Task task=taskDao.findbyId(11);
        System.out.println(task);
        System.out.println("---------------------");

        topics.forEach(topic -> {Topic topic1= TopicService.saveAllTopic(topic);
            System.out.println(topic1);

        });
        System.out.println("---------------------");
        TopicDaoImpl topicDao=new TopicDaoImpl();
        Topic topic=topicDao.findbyId(11);
        System.out.println(topic);
        System.out.println("---------------------");

        teachers.forEach(teacher -> {Teacher teacher1=TeacherService.saveAllTeacher(teacher);
            System.out.println(teacher1);
        });
        System.out.println("---------------------");
        TeacherDaoImpl teacherDao=new TeacherDaoImpl();
        Teacher teacher=teacherDao.findbyId(11);
        System.out.println(teacher);

        System.out.println("---------------------");

        for (Course cours : courses) {
            cours.showHomework();
            System.out.println("------------------------");
            System.out.println("------------------------");
        }
        System.out.println();
        /*System.out.println(LocalTime.now());
        List<Teacher> teachers =
                courses.stream()
                        .map(Course::getTeacher)
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(LocalTime.now());*/

    }

    private static List<HomeWork> getHomeworks(
            List<Lesson> lessons,
            List<Task> tasks) {
        int id = 1;
        List<HomeWork> result = new ArrayList<>();
        for (Lesson lesson : lessons) {
            for (Task task : tasks) {
                result.add(new HomeWork(id++, lesson
                        , task));
            }
        }
        return result;
    }

    private static List<HomeWork> getHomeworks2(
            List<Lesson> lessons,
            List<Task> tasks) {
        int id = 1;
        List<HomeWork> collect = lessons.stream()
                .flatMap(lesson -> tasks.stream()
                        .map(task -> new HomeWork(lesson, task)))
                .collect(Collectors.toList());
        for (HomeWork homeWork : collect) {
            homeWork.setId(id++);
        }
        return collect;

    }

}