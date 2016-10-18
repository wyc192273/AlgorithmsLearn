package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.Queue;

import java.util.Stack;

/**
 * Created by Administrator on 2016/10/17.
 */
public class OutStackAlgs {

    public static void main(String[] args) {
        System.out.println(isRightOutStack(new int[]{4,3,2,1,0,9,8,7,6,5}));
        System.out.println(isRightOutStack(new int[]{4,6,8,7,5,3,2,9,0,1}));
        System.out.println(isRightOutStack(new int[]{2,5,6,7,4,8,9,3,1,0}));
        System.out.println(isRightOutStack(new int[]{4,3,2,1,0,5,6,7,8,9}));
        System.out.println(isRightOutStack(new int[]{1,2,3,4,5,6,9,8,7,0}));
        System.out.println(isRightOutStack(new int[]{0,4,6,5,3,8,1,7,2,9}));
        System.out.println(isRightOutStack(new int[]{1,4,7,9,8,6,5,3,0,2}));
        System.out.println(isRightOutStack(new int[]{2,1,4,3,6,5,8,7,9,0}));

    }


    public static boolean isRightOutStack(int[] outStack){
        Stack<Integer> inStack = new Stack<Integer>();
        int index = 0;
        for(int i = 0;i<outStack.length;){
            if(inStack.isEmpty() || inStack.peek() < outStack[i]){
                inStack.push(index);
                index++;
            }else{
                inStack.pop();
                i++;
            }
        }
        if(inStack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
