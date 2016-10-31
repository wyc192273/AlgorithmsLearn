package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/26.
 */
//连通分量数据结构
public class UF {
    private int id[];  //分量id （触点作为索引）
    private int count; //分量数量
    public UF(int N){
        id = new int[N];
        count = N;
        for(int i=0;i<N;i++){
            id[i] = i; //触点i的分量初始化是自己i
        }
    }
    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    public int find(int p){
        return id[p];
    }

    public void union(int p ,int q){
        int pId = find(p);
        int qId = find(q);
        if(pId == qId) return;
        for(int i=0;i<id.length;i++){
            if(id[i]==pId) id[i] = qId;
        }
        count--;
    }

}
