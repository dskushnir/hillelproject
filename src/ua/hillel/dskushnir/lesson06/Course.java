package ua.hillel.dskushnir.lesson06;

public class Course implements GetInfo{

    protected String name;
    protected Student[]students;
    protected Teacher teacher;
    protected Lesson[]lessons;

    public Course(String name, Student[] students, Teacher teacher, Lesson[] lessons) {
        this.name = name;
        this.students = students;
        this.teacher = teacher;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public void print() {

    }
}

