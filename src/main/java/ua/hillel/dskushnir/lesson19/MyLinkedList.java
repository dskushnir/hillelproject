package ua.hillel.dskushnir.lesson19;

import java.util.*;

public class MyLinkedList <T>implements List<T>,Deque<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode= new Node<T>(null,firstNode,null);
        firstNode=new Node<T>(null,null,lastNode);
        lastNode.setNextElement(firstNode);
    }

    private class Node<T> {
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;


        public Node(T currentElement, Node<T> nextElement, Node<T> prevElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;

        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<T> prevElement) {
            this.prevElement = prevElement;
        }
    }






    public void addLast(T t) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(t);
        lastNode= new Node<T>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;

    }

    public void addFirs(T t) {
        Node<T> next = firstNode;
        next.setCurrentElement(t);
        firstNode= new Node<T>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    public int size() {
        return size;

    }

    public T getElementByIndex(int counter) {
        Node<T> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElemeht(target);
        }
        return target.getCurrentElement();
    }

    private Node<T> getNextElemeht(Node<T> current) {
        return current.getNextElement();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public T next() {
                return getElementByIndex(counter++);
            }
        };
    }






    public ListIterator<T> listIterator () {
        return new ListIterator<T>() {

            int counter=0;
            int tar=counter-1;

            @Override
            public boolean hasNext() {
                return counter<size ;
            }

            @Override
            public T next() {
                if (counter== size) {
                    throw new IndexOutOfBoundsException(" Counter out of bounds");
                }
                return getElementByIndex(counter++);

            }

            @Override
            public boolean hasPrevious() {
                return counter>0;
            }

            @Override
            public T previous() {
                if (tar== 0) {
                    throw new IndexOutOfBoundsException(" Counter out of bounds");
                }
                return getElementByIndex(tar--);
            }

            @Override
            public int nextIndex() {

                if (counter< size) {
                    return counter+1;
                }
                return size;
            }

            @Override
            public int previousIndex() {
                if (counter>0) {
                    return tar;
                }
                return -1;
            }

            @Override
            public void remove() {


            }

            @Override
            public void set(T t) {

            }

            @Override
            public void add(T t) {

            }
        };
    }

    @Override
    public void addFirst(T t) {

    }

    @Override
    public boolean offerFirst(T t) {
        return false;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public void push(T t) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}


