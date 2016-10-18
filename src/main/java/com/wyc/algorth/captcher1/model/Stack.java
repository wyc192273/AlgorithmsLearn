package com.wyc.algorth.captcher1.model;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/14.
 */
public class Stack<Item> implements Iterable<Item>{

    private Node first;
    private int size ;
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return size;
    }
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReserveIterator();
    }

    private class ReserveIterator implements Iterator<Item> {
        Node current = first;

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
