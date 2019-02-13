package ua.hillel.dskushnir.lesson11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K,V> extends LinkedHashMap <K,V>{
    private static final int MAX__ENTRIES =5;

    public Cache(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX__ENTRIES;
    }

}





