package com.wyc.algorth.captcher1.model;

/**
 * Created by Administrator on 2016/10/26.
 */
//路径亚索加权quick union
public class UFLJWQU {
    private int id[];   //触点做索引
    private int sz[];   //触点做索引，各个根节点的权值
    private int count;
    public UFLJWQU(int N){
        count = N;
        id = new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
        sz = new int[N];
        for(int i=0;i<N;i++){
            sz[i] = 1;
        }
    }
    public int count(){
        return count;
    }
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }
    private int find(int p){
        int oldP = p;
        while(p != id[p]){
            p = id[p];

        }
        id[oldP] = p;
        return p;
    }

    public void union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        if(sz[pRoot] >= sz[qRoot]){
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }else{
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }
        count--;
    }
}
