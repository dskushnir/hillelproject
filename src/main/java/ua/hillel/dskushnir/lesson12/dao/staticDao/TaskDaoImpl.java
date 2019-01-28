package ua.hillel.dskushnir.lesson12.dao.staticDao;

import ua.hillel.dskushnir.lesson12.interfaces.TaskDao;
import ua.hillel.dskushnir.lesson12.model.Task;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaskDaoImpl implements TaskDao {
    static private Map<Integer, Task> tasks =
            new LinkedHashMap<>();
    static private int i = 10;

    @Override
    public Task create(Task task) {
        int id = i++;
        task.setId(id);
        tasks.put(id, task);
        return task;

    }

    @Override
    public void update(Task task) {
        Integer id = task.getId();
        tasks.put(id, task);

    }

    @Override
    public void delete(Task task) {
        tasks.remove(task.getId());

    }

    @Override
    public Task findbyId(Integer id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList<>(tasks.values());
    }
}
