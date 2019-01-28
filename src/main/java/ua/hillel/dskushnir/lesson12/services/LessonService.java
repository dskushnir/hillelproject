package ua.hillel.dskushnir.lesson12.services;

import ua.hillel.dskushnir.lesson12.dao.staticDao.LessonDaoImpl;
import ua.hillel.dskushnir.lesson12.interfaces.LessonDao;
import ua.hillel.dskushnir.lesson12.model.Lesson;
import ua.hillel.dskushnir.lesson12.model.Topic;

import java.util.List;

public class LessonService {

    private static LessonDao lessonDao= new LessonDaoImpl();

    public static Lesson saveAllLesson(Lesson lesson) {
        List<Topic> topics = lesson.getTopics();


        return lessonDao.create(lesson);
    }
}
