package ua.hillel.dskushnir.lesson06;

public class Hometask {

    protected Task[]tasks;
    protected Mark []marks;

    public Hometask(Task[] tasks, Mark[] marks) {
        this.tasks = tasks;
        this.marks = marks;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }
}



