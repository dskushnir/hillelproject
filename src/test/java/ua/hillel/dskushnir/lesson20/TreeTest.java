package ua.hillel.dskushnir.lesson20;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class TreeTest {
    private Tree tree;

    @Before
    public void setup(){
        tree=new Tree();

    }

    @Test
    public void shouldSizeBeforeAdd() {
        assertEquals(0,0);
    }

    @Test
    public void shouldIsEmptyBeforeAdd() {
        assertTrue(tree.isEmpty());
    }

    @Test
    public void shouldAdd() {
       assertTrue(tree.add("123"));

    }
    @Test
    public void shouldSizeAfterAdd(){
        tree.add("123");
        assertEquals(1,tree.size());

    }

    @Test
    public void shouldContains() {
       tree.add("123");
       assertTrue(tree.contains("123"));

    }

    @Test
    public void shouldRemove() {
        tree.add("123");
        assertTrue(tree.remove("123"));

    }
    @Test
    public void shouldSizeAfterRemove(){
        tree.add("123");
        tree.add("456");
        tree.remove("123");
        assertEquals(1,tree.size());
    }


    @Test
    public void shouldIterator() {
        tree.add("a");
        tree.add("c");
        tree.add("b");
        Iterator iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println(tree.toString());
    }

    @Test
    public void shouldDescOrder() {
        tree.add("b");
        tree.add("a");
        tree.add("c");
        tree.descOrder(tree.root);

    }
    @Test
    public void shouldClear() {

        tree.add("123");
        tree.add("456");
        tree.add("789");
        tree.clear();
        assertTrue(tree.isEmpty());
    }
}