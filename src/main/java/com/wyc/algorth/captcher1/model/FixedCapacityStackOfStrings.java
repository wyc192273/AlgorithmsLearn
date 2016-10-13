package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/10.
 */
public class FixedCapacityStackOfStrings {
    private String [] entries;
    private int size;
    public FixedCapacityStackOfStrings(int cap){
        entries = new String[cap];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(String item){
        entries[size++] = item;
    }

    public String pop(){
        return entries[--size];
    }

}
