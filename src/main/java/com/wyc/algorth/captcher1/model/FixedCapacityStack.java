package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/10.
 */
public class FixedCapacityStack<Item> {
    private Item[] entries;
    private int size;
    public FixedCapacityStack(int cap){
        entries = (Item[]) new Object[cap];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void push(Item item){
        entries[size++] = item;
    }
    public Item pop(){
        return entries[--size] ;
    }
}
