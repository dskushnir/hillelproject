package ua.hillel.dskushnir.lesson12.services;

import ua.hillel.dskushnir.lesson12.dao.staticDao.TaskDaoImpl;
import ua.hillel.dskushnir.lesson12.interfaces.TaskDao;
import ua.hillel.dskushnir.lesson12.model.Task;
import ua.hillel.dskushnir.lesson12.model.Topic;

public class TaskService {
    private static TaskDao taskDao=new TaskDaoImpl();
    public static Task saveAllTask(Task task) {
        Topic topic =task.getTopic();
        return taskDao.create(task);
    }
}
