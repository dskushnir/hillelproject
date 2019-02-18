package ua.hillel.dskushnir.lesson19;


import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class MainDoubly {
    public static void main(String[] args) {
        DoublyLinkedList  doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.addFirst("Jon");
        doublyLinkedList.addFirst("Jack");
        doublyLinkedList.addFirst("Alex");
        System.out.println(doublyLinkedList.toString());
        System.out.println(doublyLinkedList.size());
        System.out.println();

        doublyLinkedList.addLast("Jim");
        System.out.println(doublyLinkedList.toString());
        doublyLinkedList.removeFirst();
        System.out.println(doublyLinkedList.toString());
        doublyLinkedList.removeLast();
        System.out.println(doublyLinkedList.toString());
        System.out.println(doublyLinkedList.size());
        System.out.println();
        doublyLinkedList.add(1,"Paul");
        doublyLinkedList.add(0,"Piter");
        System.out.println(doublyLinkedList.toString());
        System.out.println("index of Paul = "+doublyLinkedList.indexOf("Paul"));
        System.out.println();
        Iterator iterator=doublyLinkedList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        ((DoublyLinkedList.ListIterator) iterator).add("Joana");
        System.out.println(doublyLinkedList);
        iterator.next();
        iterator.remove();
        System.out.println(doublyLinkedList.toString());
        System.out.println(((DoublyLinkedList.ListIterator) iterator).hasPrevious());
        System.out.println();
        System.out.println(((DoublyLinkedList.ListIterator) iterator).previous());
        System.out.println(((DoublyLinkedList.ListIterator) iterator).previous());
        System.out.println(((DoublyLinkedList.ListIterator) iterator).previous());
        System.out.println(iterator.hasNext());
        System.out.println(doublyLinkedList.toString());























    }





}
