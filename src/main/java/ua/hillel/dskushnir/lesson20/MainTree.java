package ua.hillel.dskushnir.lesson20;

import java.util.Iterator;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add("a");
        tree.add("c");
        tree.add("m");
        tree.add("b");
        System.out.println(tree.toString());

        System.out.println("If contains a -"+ tree.contains("a"));
        System.out.println("If contains p -"+ tree.contains("p"));
        System.out.println("Size="+tree.size());
        System.out.println("If tree isEmpty "+tree.isEmpty());
        Iterator iterator=tree.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("If hasNext ="+ iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("If hasNext="+iterator.hasNext());
        tree.remove("b");
        System.out.println("Remove b");
            for (String s : tree) {
                System.out.println(s);
            }
        System.out.println();
        System.out.println("Size="+tree.size());
        System.out.println("clear");
        tree.clear();
        System.out.println("Size="+ tree.size());
        System.out.println();
        tree.add("k");
        tree.add("l");
        tree.add("m");
        System.out.println(tree.toString());
        tree.descOrder(tree.root);






    }
}