package ua.hillel.dskushnir.lesson07;

import java.lang.annotation.Annotation;

public class Task1 {
    public static void main(String[] args) {
        Cat cat=new Cat("Mila","British Shorthair","silver chinchilla");
        Class aClass =cat.getClass();
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }
    }
}
