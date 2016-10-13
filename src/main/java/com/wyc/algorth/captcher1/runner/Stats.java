package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.Bag;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        numbers.add(100.0);
        numbers.add(99.0);
        numbers.add(101.0);
        numbers.add(98.0);
        numbers.add(107.0);
        numbers.add(81.0);
        numbers.add(120.0);
        numbers.add(109.0);
        numbers.add(101.0);
        numbers.add(90.0);

        int N = numbers.size();
        double sum = 0;
        for ( double x : numbers){
            sum += x;
        }
        double mean = sum/N;
        sum = 0.0;
        for (double x:numbers){
            sum += (x-mean)*(x-mean);
        }
        double std = Math.sqrt(sum/(N-1));
        System.out.println(String.format("Mean : %.2f", mean));
        System.out.println(String.format("Std dev : %.2f", std));
    }
}
