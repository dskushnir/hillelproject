package ua.hillel.dskushnir.lesson19;



public class MainMyLinkedList {
    public static void main(String[] args) {

        MyLinkedList<String>myLinkedList=new MyLinkedList<>();
        myLinkedList.addFirs("One");
        myLinkedList.addFirs("Two");
        myLinkedList.addFirs("Three");
        myLinkedList.addFirs("Four");
        myLinkedList.addFirs("Five");
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.getElementByIndex(1));



        }

    }

