package com.lrn.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengwei
 * @since 2020/10/30.
 */
public class UndirectedGraphNode<T> {
    T data;
    List<UndirectedGraphNode<T>> neighborList;
    boolean visited;

    public UndirectedGraphNode(T data) {
        this.data = data;
        neighborList = new ArrayList<UndirectedGraphNode<T>>();
        visited = false;
    }

    public boolean equals(UndirectedGraphNode<T> node){
        return this.data.equals(node.data);
    }

    /**
     * 还原图中所有节点为未访问
     */
    public void restoreVisited(){
        restoreVisited(this);
    }

    /**
     * 还原node的图所有节点为未访问
     * @param node
     */
    private void restoreVisited(UndirectedGraphNode<T> node){
        if(node.visited){
            node.visited = false;
        }

        List<UndirectedGraphNode<T>> neighbors = node.neighborList;
        for(int i = 0; i < neighbors.size(); i++){
            restoreVisited(neighbors.get(i));
        }

    }
}
