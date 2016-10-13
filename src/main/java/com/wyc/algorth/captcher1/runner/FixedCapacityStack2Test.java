package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.FixedCapacityStack2;

/**
 * Created by Administrator on 2016/10/13.
 */
public class FixedCapacityStack2Test {
    public static void main(String[] args) {
        FixedCapacityStack2<Integer> fixedCapacityStack2 = new FixedCapacityStack2<Integer>();
        fixedCapacityStack2.push(1);
        fixedCapacityStack2.push(2);
        fixedCapacityStack2.push(3);
        for(int i : fixedCapacityStack2){
            System.out.println(i);
        }

        fixedCapacityStack2.pop();
        fixedCapacityStack2.pop();
        fixedCapacityStack2.pop();
    }
}
