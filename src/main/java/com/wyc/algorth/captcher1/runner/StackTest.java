package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.Stack;

/**
 * Created by Administrator on 2016/10/14.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
    }
}
