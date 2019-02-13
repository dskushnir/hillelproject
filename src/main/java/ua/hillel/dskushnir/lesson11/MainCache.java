package ua.hillel.dskushnir.lesson11;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainCache {
    public static void main(String[] args) {
        Cache cache
                = new Cache(16, .75f, true);
        cache.put(1, null);
        cache.put(2, null);
        cache.put(3, null);
        cache.put(4, null);


        Set<Integer> keys = cache.keySet();
        System.out.println(cache.keySet());
        cache.put(100,null);
        System.out.println(cache.keySet());
        cache.put(101,null);
        System.out.println(cache.keySet());

    }

}
