package ua.hillel.dskushnir.lesson06;

public class Task1 {
    public static void main(String[] args) {
        Student student1=new Student("Ivan","Ivanov");
        Student student2=new Student("Fedor","Fedorov");
        Student[] students = new Student[2];
        students[0] = student1;
        students[1]=student2;

        Teacher teacher1=new Teacher("Petr","Petrov");

        Topics topics1=new Topics("A");

        Lesson lesson1=new Lesson(1,topics1);
        Lesson[]lessonsJava=new Lesson[1];
        lessonsJava[0]=lesson1;

        Course course = new Course("java",students,teacher1,lessonsJava);


    }


}
