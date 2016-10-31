package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/26.
 */
//quick union
public class UFQU {
    private int id[];  //分量id （触点作为索引）
    private int count; //分量数量
    public UFQU(int N){
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
        //只有根节点的触点和分量相等
        while(p != id[p]){
            p = id[p];
        }
        return p;
    }

    public void union(int p ,int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        //将p的根节点的分量指向q的根节点
        id[pRoot] = qRoot;
        count--;
    }
}
