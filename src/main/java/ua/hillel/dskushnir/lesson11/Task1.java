package ua.hillel.dskushnir.lesson11;


import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        List<Object>objects = List.of(1,List.of(2,List.of(3,4,5),List.of(6,7),List.of(8,List.of(9,10))));
        System.out.println(objects);
        ListIterator<Object>listIterator=objects.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        /*void recurson(List<Object> objects,int index) {
            if( index >= objects.size() ) return;
            Object o= objects.get(index) ;

            recurson (objects,index+1);*/



    }

}
