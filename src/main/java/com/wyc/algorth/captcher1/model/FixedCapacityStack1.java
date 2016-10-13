package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/10.
 */
public class FixedCapacityStack1<Item> {
    private Item[] entries;
    private int size;
    public FixedCapacityStack1(int cap){
        entries = (Item[]) new Object[cap];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void push(Item item){
        if(size==entries.length){
            resize(2*entries.length);
        }
        entries[size++] = item;
    }
    public Item pop(){
        if(isEmpty()){
            return null;
        }
        Item item = entries[--size] ;
        entries[size] = null;
        if(size>0 && size == entries.length/4) resize(entries.length / 2);
        return item;
    }

    private void resize(int max){
        Item[] newEntries = (Item[]) new Object[max];
        for(int i =0;i<entries.length;i++){
            newEntries[i] = entries[i];
        }
        entries = newEntries;
    }
}
