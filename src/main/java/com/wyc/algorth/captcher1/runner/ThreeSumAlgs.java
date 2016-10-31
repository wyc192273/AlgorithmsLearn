package com.wyc.algorth.captcher1.runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/10/20.
 */
public class ThreeSumAlgs {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int[] a = new int[1] ;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(TwoSumAlgs.class.getResource("/").getPath()+ "1.4/2Kints.txt"));
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
        System.out.println(threeSum(a));
        System.out.println(System.currentTimeMillis() - start);
        long start2 = System.currentTimeMillis();
        System.out.println(threeSumFast(a));
        System.out.println(System.currentTimeMillis() - start2);
    }

    public static int threeSum(int []a){
        int N = a.length;
        int result = 0;
        for(int i =0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if((a[i] + a[j] + a[k])==0){
                       result++;
                    }
                }
            }
        }
        return result;
    }

    public static int threeSumFast(int []a){
        int N = a.length;
        Arrays.sort(a);
        int cnt = 0;
        for(int i =0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(Arrays.binarySearch(a,(-a[i]-a[j]))>j){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
