package ua.hillel.dskushnir.lesson19;


import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class MainDoubly {
    public static void main(String[] args) {
        DoublyLinkedList  doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.addFirst("Jon");
        doublyLinkedList.addFirst("Jack");
        doublyLinkedList.addFirst("Alex");
        System.out.println(doublyLinkedList.size());
        System.out.println(doublyLinkedList.toString());
        Iterator iterator=doublyLinkedList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println();
        System.out.println(((DoublyLinkedList.ListIterator) iterator).previous());
        System.out.println(((DoublyLinkedList.ListIterator) iterator).previous());
        System.out.println(((DoublyLinkedList.ListIterator) iterator).previous());







    }





}
