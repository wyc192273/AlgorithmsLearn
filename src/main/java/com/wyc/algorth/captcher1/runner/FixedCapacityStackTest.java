package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.FixedCapacityStack;

/**
 * Created by Administrator on 2016/10/10.
 */
public class FixedCapacityStackTest {
    public static void main(String[] args) {
        FixedCapacityStack<Integer> fixedCapacityStack = new FixedCapacityStack<Integer>(10);
        fixedCapacityStack.push(1);
        fixedCapacityStack.push(2);
        System.out.println(fixedCapacityStack.pop());
        System.out.println(fixedCapacityStack.size());
        System.out.println(fixedCapacityStack.isEmpty());
    }
}
