package com.wyc.algorth.captcher1.model;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/17.
 */
public class Queue<Item> implements Iterable<Item>{
    private Node first;
    private Node last;
    private int size;
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    public void enqueue(Item item){
        Node oldNode = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else{
            oldNode.next = last;
        }
        size++;
    }

    public Item dequeue(){
        if(isEmpty()){
            return null;
        }
        Item item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        size-- ;
        return item;
    }

    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext() {
            return current!=null;
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
