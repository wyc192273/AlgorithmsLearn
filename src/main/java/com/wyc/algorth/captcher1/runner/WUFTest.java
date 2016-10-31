package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.WeightedQuickUnionUF;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/26.
 */
public class WUFTest {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(UFTest.class.getResource("/").getPath()+"1.5/tinyUF.txt"));
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(UFTest.class.getResource("/").getPath()+"1.5/mediumUF.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(UFTest.class.getResource("/").getPath()+"1.5/largeUF.txt"));
        String str = bufferedReader.readLine();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(Integer.parseInt(str));
        long beginTime =System.currentTimeMillis();
        while ((str = bufferedReader.readLine())!=null){
            String[] array = str.split(" ");
            int p = Integer.parseInt(array[0]);
            int q = Integer.parseInt(array[1]);
            if(uf.connected(p,q)) continue;
            uf.union(p,q);
//            System.out.println(p+" -- "+q);
        }
        System.out.println(uf.count());
        System.out.println("cost time :"+(System.currentTimeMillis() - beginTime));
    }
}
