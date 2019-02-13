package ua.hillel.dskushnir.lesson18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SvoiContainer2 implements Collection {
    private Object[] objects = new Object[0];





    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
  /*  private void newSize() {
        capacity = capacity *2+1;
    }*/

    @Override
    public boolean contains(Object o) {
        for (Object obj : objects) {
            if (obj.equals(o)) {
                return true;
            }
        }


        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < objects.length;
            }

            @Override
            public Object next() {
                if (index == objects.length) {
                    throw new IndexOutOfBoundsException(" Index out of bounds");
                }
                Object result = objects[index];
                index++;
                return result;
            }

        };
    }

    @Override
    public Object[] toArray() {
        Object[] temp = new Object[objects.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = objects[i];
        }
        return temp;
    }

    @Override

    public Object[] toArray(Object[] a) {
        int size = size();
        if (a.length < size)
            return Arrays.copyOf(objects, size, a.getClass());
        System.arraycopy(objects, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;

    }

    @Override
    public boolean add(Object o) {
        int size = size();
        Object[] temp = new Object[objects.length + 1];
        for (int i = 0; i < size; i++) {
            temp[i] = objects[i];
        }
        temp[size] = o;
        objects = temp;
        return false;
    }


    @Override
    public boolean remove(Object o) {

        Object[] temp = new Object[objects.length - 1];
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (objects[i].equals(o)) {
                index = i;
                break;
            }
        }
        System.arraycopy(objects, 0, temp, 0, index);
        System.arraycopy(objects, index + 1, temp, 0, objects.length - index - 1);
        objects = temp;
        return true;
    }


    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c)
            if (!contains(o)) {
                return false;
            }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            if (add(o)) {
                return false;
            }
        }
        return true;
    }


   // removeAll метод удаляет только первое совпадение- оно и понятно-  remove проходит только один раз . Можно ли remove зациклить?
    // У меня не получилось, к сожалению.

    @Override
    public boolean removeAll(Collection c) {

        for (Object o : c) {
            if (remove(o)) {
                return false;
            }
        }
        return true;
    }
    // это второй вариант- оставляет только Jim.
    // Подскажи, пожалуйста, в каком направлении продвигаться,
     /* @Override
    public boolean removeAll(Collection c) {
        int counter = 0;
        for (Object o : c) {
            for (int i = 0; i < size(); i++) {
                if (!Objects.equals(objects[i], o)) {
                    counter++;
                    Object[] temp = new Object[counter];
                    for (int j = 0; j < temp.length; j++) {
                        temp[j] = objects[i];
                    }
                    objects = temp;
                    return true;
                }
            }
        }
        return false;
    }*/



    @Override
    public boolean retainAll(Collection c) {


        return false;
    }

    @Override
    public void clear() {

        for (int i = 0; i < size(); i++) {
            objects[i] = null;
        }

        objects=new Object[0];
    }

    @Override
    public String toString() {
        return "SvoiContainer2{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }

}
