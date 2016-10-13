package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.Bag;

/**
 * Created by Administrator on 2016/10/8.
 */
public class BagRunner {
    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<Integer>();
        bag.add(1);
        System.out.println(bag.size());
        System.out.println(bag.isEmpty());
        bag.add(2);
        for(int b : bag){
            System.out.println(b);
        }
    }
}
