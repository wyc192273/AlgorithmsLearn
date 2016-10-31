package com.wyc.algorth.captcher1.runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/10/20.
 */
public class TwoSumAlgs {
    public static void main(String[] args) {
//        System.out.println(TwoSumAlgs.class.getResource("/").getPath());
        List<Integer> list = new ArrayList<Integer>();
        int[] a = new int[1] ;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(TwoSumAlgs.class.getResource("/").getPath()+ "1.4/16Kints.txt"));
            String str ;
            while((str = bufferedReader.readLine())!=null){
                list.add(Integer.parseInt(str.trim()));
            }
            a = new int[list.size()];
            for(int i=0;i<list.size();i++){
                a[i] = list.get(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        System.out.println(twoSum(a));
        System.out.println(System.currentTimeMillis() - start);
        long start2 = System.currentTimeMillis();
        System.out.println(twoSumFast(a));
        System.out.println(System.currentTimeMillis() - start2);

    }
    public static int twoSum(int[] a){
        int N = a.length;
        int result = 0;
        for(int i =0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(a[i]+a[j]==0){
                    result++;
                }
            }
        }
        return result;
    }

    public static int twoSumFast(int[] a){
        //NlogN
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for(int i =0;i<N;i++){
            //logN
            if(Arrays.binarySearch(a,-a[i])>i){
                cnt++;
            }
        }
        return cnt;
    }
}
