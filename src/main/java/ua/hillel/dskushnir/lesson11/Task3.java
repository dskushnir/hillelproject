package ua.hillel.dskushnir.lesson11;


import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        //  Map<Object,Object> Cache = new LinkedHashMap<>(MAX_CAPACITY, 0.75f, true){
    }
}




  /*  public class Cache extends LinkedHashMap<Object,Object>{
        float loadFactor;
        boolean accessOrder;

        public Cache(int initialCapacity, float loadFactor, boolean accessOrder) {
            super(initialCapacity, loadFactor, accessOrder);

        }

        final int MAX_CAPACITY = 100;




            @Override
            protected boolean removeEldestEntry(Map.Entry<Object, Object> eldest) {
                return size() > MAX_CAPACITY;
            }
        }
   //     public class FifoCache<KEY, VALUE> implements LruCache<KEY,VALUE> {

       //     final int limit;

         //   Map<KEY, VALUE> map = new LinkedHashMap<KEY, VALUE> () {

                @Override
                protected boolean removeEldestEntry ( Map.Entry<KEY, VALUE> eldest ) {
        //            return this.size () > limit;
                }
            };


            public LruCacheNormal ( int limit ) {
                this.limit = limit;
            }

            public void put ( KEY key, VALUE value ) {
                map.put ( key, value );


            }


            public VALUE get ( KEY key ) {

                return map.get ( key );
            }


            public VALUE getSilent ( KEY key ) {

                return map.get ( key );
            }

            public void remove ( KEY key ) {
                map.remove ( key );
            }

            public int size () {
                return map.size ();
            }

            public String toString() {
                return map.toString ();
            }*/
