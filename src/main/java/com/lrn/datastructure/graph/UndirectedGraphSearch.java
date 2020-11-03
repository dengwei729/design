package com.lrn.datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dengwei
 * @since 2020/10/30.
 */
public class UndirectedGraphSearch<T> {
    public StringBuffer searchPathDFS = new StringBuffer();
    public StringBuffer searchPathBFS = new StringBuffer();

    /**
     * 深度优先搜索实现
     *
     * @param root
     */
    public void searchDFS(UndirectedGraphNode<T> root) {
        if (root == null) {
            return;
        }

        // visited root
        if (searchPathDFS.length() > 0) {
            searchPathDFS.append("->");
        }
        searchPathDFS.append(root.data.toString());
        root.visited = true;

        for (UndirectedGraphNode<T> node : root.neighborList) {
            if (!node.visited) {
                searchDFS(node);
            }
        }
    }

    /**
     * 广度优先搜索实现,使用队列
     *
     * @param root
     */
    public void searchBFS(UndirectedGraphNode<T> root) {
        Queue<UndirectedGraphNode<T>> queue = new LinkedList<UndirectedGraphNode<T>>();

        // visited root
        if (searchPathBFS.length() > 0) {
            searchPathBFS.append("->");
        }
        searchPathBFS.append(root.data.toString());
        root.visited = true;

        // 加到队列队尾
        queue.add(root);

        while (!queue.isEmpty()) {
            UndirectedGraphNode<T> r = queue.poll();
            for (UndirectedGraphNode<T> node : r.neighborList) {
                if (!node.visited) {
                    searchPathBFS.append("->");
                    searchPathBFS.append(node.data.toString());
                    node.visited = true;

                    queue.add(node);
                }
            }
        }
    }
}


//测试用例
