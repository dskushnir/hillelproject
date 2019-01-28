package ua.hillel.dskushnir.lesson12.services;

import ua.hillel.dskushnir.lesson12.dao.staticDao.TeacherDaoImpl;
import ua.hillel.dskushnir.lesson12.interfaces.TeacherDao;
import ua.hillel.dskushnir.lesson12.model.Teacher;



public class TeacherService {
    private static TeacherDao teacherDao = new TeacherDaoImpl();

      public static Teacher saveAllTeacher(Teacher teacher)  {
          Integer id=teacher.getId();
          String name=teacher.getName();
          return teacherDao.create(teacher);
      }



}
