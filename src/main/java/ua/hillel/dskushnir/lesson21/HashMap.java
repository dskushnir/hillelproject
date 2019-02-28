package ua.hillel.dskushnir.lesson21;

import java.util.*;

public class HashMap<K,V> {
    private Entry<K, V>[] data;
    private int initialCapacity;
    private K key;
    private V value;

    public HashMap(int capacity) {
        initialCapacity = capacity;
        data = new Entry[initialCapacity];
    }

    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;


        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Entry<?, ?> entry = (Entry<?, ?>) o;

            if (!key.equals(entry.key)) return false;
            return value.equals(entry.value);
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }


    public void put(K key, V value) {
        if (key == null) {
            throw new RuntimeException("null key is not allowed");
        }
        int hash = hash(key);
        Entry<K, V> entry = new Entry<K, V>(key, value, null);
        if (data[hash] == null) {
            data[hash] = entry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = data[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        entry.next = current.next;
                        data[hash] = entry;
                    } else {
                        entry.next = current.next;
                        previous.next = entry;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = entry;

        }

    }

    public V get(K key) {
        if (key == null) {
            return null;
        }
        int hash = hash(key);
        if (data[hash] == null) {
            return null;
        } else {
            Entry<K, V> temp = data[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    public boolean remove(K keyNew) {
        if (keyNew == null) {
            return false;
        }
        int hash = hash(keyNew);
        if (data[hash] == null) {
            return false;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = data[hash];
            while (current != null) {
                if (current.key.equals(keyNew)) {
                    if (previous == null) {
                        data[hash] = data[hash].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
            return false;
        }
    }

    public boolean containsKey(K keyNew) {
        int hash = hash(keyNew);
        if (data[hash] == null) {
            return false;
        } else {
            Entry<K, V> current = data[hash];
            while (current != null) {
                if (current.key.equals(keyNew)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                int nodeCount = 0;
                for (Entry<K, V> e = data[i]; e.next != null; e = e.next) {
                    nodeCount++;
                }
                count += nodeCount;
                count++;
            }
        }
        return count;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % initialCapacity;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public boolean containsValue(Object o) {
        if (o == null)
            return false;

        Entry[] tab = data;
        for (int i = 0; i < tab.length; i++)
            for (Entry e = tab[i]; e != null; e = e.next)
                if (o.equals(e.value))
                    return true;
        return false;


    }




    public void clear() {
        Entry[] tab = data;
        for (int i = 0; i < tab.length; i++)
            tab[i] = null;
        data = new Entry[0];
    }


    public void getInfo() {

        for (int i = 0; i < initialCapacity; i++) {
            if (data[i] != null) {
                Entry<K, V> entry = data[i];
                while (entry != null) {
                    System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
                    entry = entry.next;
                }
            }
        }
    }
    //  Set<K> keySet() и  Set<Map.Entry<K, V>> entrySet()  не готовы.
  /*  public void putAll(Map<K, V> m) {

        Map.Entry<K, V> e = m.entrySet().iterator().next();

        put(e.getKey(), e.getValue());

    }


    public Set<K> keySet() {

        return new AbstractSet<K>() {
            @Override
            public Iterator<K> iterator() {
                return new Iterator<K>() {
                    public boolean hasNext() {
                        return index < HashMap.this.size();
                    }

                    public K next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        index++;

                        return key;
                    }

                    public void remove() {
                        HashMap.this.clear();
                    }

                    int index;
                };
            }

            @Override
            public int size() {
                return HashMap.this.size();
            }
        };
    }


    public Collection<V> values() {
        return new AbstractList<V>() {
            @Override
            public V get(final int index) {
                if (index > size() - 1) {
                    throw new IndexOutOfBoundsException();
                }
                return value;
            }

            @Override
            public int size() {
                return HashMap.this.size();
            }
        };
    }


    public Set<Map.Entry<K, V>> entrySet() {
        return new AbstractSet<Map.Entry<K, V>>() {
            @Override
            public Iterator<Map.Entry<K, V>> iterator() {
                return new Iterator<Map.Entry<K, V>>() {
                    public boolean hasNext() {
                        return index < HashMap.this.size();
                    }

                    public Map.Entry<K, V> next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        index++;

                        return new Map.Entry<K, V>() {
                            public K getKey() {
                                return getKey();
                            }

                            public V getValue() {
                                return getValue();
                            }

                            public V setValue(final V value) {
                                final V oldValue = HashMap.this.value;

                                HashMap.this.value = value;

                                return oldValue;
                            }
                        };
                    }

                    public void remove() {
                        clear();
                    }

                    int index = 0;
                };
            }

            @Override
            public int size() {
                return HashMap.this.size();
            }

        };

    }*/


}


