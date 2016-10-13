package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/14.
 */
public class Stack<Item> {

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
        return item;
    }

    private class Node{
        Item item;
        Node next;
    }

}
