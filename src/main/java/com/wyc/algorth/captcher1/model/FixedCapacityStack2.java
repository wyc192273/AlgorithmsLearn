package com.wyc.algorth.captcher1.model;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/13.
 */
public class FixedCapacityStack2<Item> implements Iterable<Item>{
    private int initCapacity = 10;
    private Item[] entries = (Item[])new Object[initCapacity];
    private int size;
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
        for(int i =0;i<size;i++){
            newEntries[i] = entries[i];
        }
        entries = newEntries;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator{
        private int i = size;

        public boolean hasNext() {
            return i>0;
        }

        public Item next() {
            return (Item) entries[--i];
        }

        public void remove() {

        }
    }

}
