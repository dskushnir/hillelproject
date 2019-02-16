package ua.hillel.dskushnir.lesson18;

import java.util.*;

public class MainSvoiContainer {
    public static void main(String[] args) {
        SvoiContainer svoiContainer1 = new SvoiContainer();
        svoiContainer1.add("Tim");
        svoiContainer1.add("Tom");
        svoiContainer1.add("Alex");
        System.out.println("svoiContainer1");
        System.out.println(svoiContainer1.toString());
        System.out.println("Size" + svoiContainer1.size());
        System.out.println( "If contains Jon ="+svoiContainer1.contains("Jon"));
        System.out.println();

        SvoiContainer svoiContainer2=new SvoiContainer();
        svoiContainer2.add("Jon");
        svoiContainer2.add("Jack");
        System.out.println("svoiContainer2");
        System.out.println(svoiContainer2);

        System.out.println("Add svoiContainer2  to svoiContainer1 ="+svoiContainer1.addAll(svoiContainer2));
        System.out.println(svoiContainer1);
        System.out.println();
        System.out.println("If svoiContaine1r  contains  svoiContainer2=" +svoiContainer1.containsAll(svoiContainer2));
        System.out.println("Clear svoiContainer1    ");
        svoiContainer1.clear();
        System.out.println(svoiContainer1);
        System.out.println("IsEmpty  svoiContainer  "+ svoiContainer1.isEmpty());
        System.out.println(svoiContainer1.size());
        System.out.println();
        System.out.println(" svoiContainer2.toArray();");
        svoiContainer2.toArray();
        System.out.println(svoiContainer2);
        Object[] peopleArray = svoiContainer2.toArray();
        System.out.println("Printing elements from first to last:");
        for(Object person : peopleArray){
            System.out.println(person);
        }
        System.out.println("Printing elements array");
        Object[] array = svoiContainer2.toArray(new Object[svoiContainer2.size()]);
        System.out.println("svoiContainer2.toArray(new Object[svoiContainer2.size()])");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("svoiContainer2.remove(\"Jon\");");
        svoiContainer2.remove("Jon");
        System.out.println(svoiContainer2);
        System.out.println();
        System.out.println("svoiContainer2.add Jim, Piter, Jimmi");
        svoiContainer2.add("Jim");
        svoiContainer2.add("Piter");
        svoiContainer2.add("Jimmi");
        System.out.println(svoiContainer2);
        System.out.println("svoiContainer1.add Jack, Jim] ");
        svoiContainer1.add("Jack");
        svoiContainer1.add("Jim");
        System.out.println(svoiContainer1);
        System.out.println();
        System.out.println("svoiContainer2.removeAll(svoiContainer1)" );
       svoiContainer2.removeAll(svoiContainer1);
        System.out.println(svoiContainer2);
        System.out.println();
        svoiContainer1.add("Piter");
        svoiContainer1.add("Jimmi");
        svoiContainer2.add("Alex");
        System.out.println(svoiContainer1);
        System.out.println(svoiContainer2);
        System.out.println(svoiContainer1.retainAll(svoiContainer2));
        System.out.println("svoiContainer1.retainAll(svoiContainer2) ="+ svoiContainer1.retainAll(svoiContainer2));

        System.out.println();

        System.out.println(svoiContainer1);
        System.out.println(svoiContainer2);





    }
}
