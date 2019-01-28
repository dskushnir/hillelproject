package ua.hillel.dskushnir.lesson12.services;

import ua.hillel.dskushnir.lesson12.dao.staticDao.StudentDaoImpl;
import ua.hillel.dskushnir.lesson12.interfaces.StudentDao;
import ua.hillel.dskushnir.lesson12.model.HomeWork;
import ua.hillel.dskushnir.lesson12.model.Student;

import java.util.List;

public class StudentService {
    private static StudentDao studentDao= new StudentDaoImpl();
    public  static Student saveAllStudent (Student student){
        List<HomeWork> homeWorkList=student.getHomeWorkList();
        return studentDao.create(student);
    }

}
