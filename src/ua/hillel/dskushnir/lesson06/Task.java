package ua.hillel.dskushnir.lesson06;

public class Task {
    protected Lesson[] lessons;
    protected Student[] students;

    public Task(Lesson[] lessons, Student[] students) {
        this.lessons = lessons;
        this.students = students;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}





