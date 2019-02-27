package ua.hillel.dskushnir.lesson21;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class MyMap implements Map {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
    /*   @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {

        return null;
    }

    public void put(Object key,Object value);
    public Object get(Object key);
    public int size();
    public Set keySet();
    public Set entrySet();
    public interface MyEntry
    {
        public Object getKey();
        public Object getValue();
    }
    class MySimpleMap implements MyMap
    {
        private ArrayList keys;
        private ArrayList values;
        private int index;

        public MySimpleMap()
        {
            keys=new ArrayList();
            values=new ArrayList();
            index=0;
        }

        public void put(Object key,Object value)
        {
            keys.add(key);
            values.add(value);
            index++;
        }

        public Object get(Object key)
        {
            int i=keys.indexOf(key);
            if (i>=0)
                return values.get(i);
            else
                return null;
        }

        public int size()
        {
            return index;
        }

        public Set keySet()
        {
            HashSet set=new HashSet();
            set.addAll(keys);
            return set;
        }

        //Nested class starts...
        class MySimpleEntry implements MyMap.MyEntry
        {
            Object key;
            Object value;

            public MySimpleEntry(Object k,Object v)
            {
                key=k;
                value=v;
            }

            public Object getKey()
            {
                return key;
            }

            public Object getValue()
            {
                return value;
            }
        }// Nested class ends.

        public Set entrySet()
        {
            HashSet set=new HashSet();
            for (int i=0;i<index;i++)
            {
                Object k=keys.get(i);
                Object v=values.get(i);
                MySimpleEntry temp=new MySimpleEntry(k,v);
                set.add(temp);
            }
            return set;
        }
    }*/
}
