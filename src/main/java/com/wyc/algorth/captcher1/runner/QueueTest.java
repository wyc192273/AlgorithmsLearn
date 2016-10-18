package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.Queue;

/**
 * Created by Administrator on 2016/10/17.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        for(int a : queue){
            System.out.println(a);
        }
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
    }
}
