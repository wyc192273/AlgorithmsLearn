package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.FixedCapacityStackOfStrings;

/**
 * Created by Administrator on 2016/10/10.
 */
public class FixedCapacityStackOfStringsTest {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(100);
        stack.push("test1");
        stack.push("test2");
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
