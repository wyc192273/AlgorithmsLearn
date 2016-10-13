package com.wyc.algorth.captcher1.model;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Bag<Item> implements Iterable<Item> {
    private Node first;
    private int size;
    public void add(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {

        }
    }

    private class Node{
        Item item;
        Node next;
    }
}
