package ua.hillel.dskushnir.lesson21;

import java.util.Iterator;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>(4);
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
        hashMap.getInfo();
        hashMap.put(5,"l");
        System.out.println();
        hashMap.getInfo();
        System.out.println();
        System.out.println(hashMap.size());
        System.out.println("If contains key=1 -"+hashMap.containsKey(1));
        System.out.println("If contains value=b-"+hashMap.containsValue("b"));
        hashMap.getInfo();
        System.out.println();
        System.out.println("If isEmpty - " +hashMap.isEmpty());
        System.out.println("Value (key=3"+ hashMap.get(3));
        System.out.println("Remove Value (key=4)");
        System.out.println(hashMap.remove(4));
        hashMap.getInfo();
        System.out.println();
        System.out.println(hashMap.size());
        System.out.println();
        System.out.println("Clear");
        hashMap.clear();
        System.out.println("Size" +hashMap.size());


    }
}
