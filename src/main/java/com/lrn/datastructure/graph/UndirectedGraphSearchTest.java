package com.lrn.datastructure.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * GraphSearch测试
 * @author hoaven
 * @see UndirectedGraphNode
 * @see UndirectedGraphSearch
 */
public class UndirectedGraphSearchTest {
    UndirectedGraphNode<Integer> node1;
    UndirectedGraphNode<Integer> node2;
    UndirectedGraphNode<Integer> node3;
    UndirectedGraphNode<Integer> node4;
    UndirectedGraphNode<Integer> node5;
    UndirectedGraphNode<Integer> node6;
    UndirectedGraphNode<Integer> node7;
    UndirectedGraphNode<Integer> node8;
    UndirectedGraphNode<Integer> node9;
    UndirectedGraphNode<Integer> node10;

    @Before
    public void before(){
        node1 = new UndirectedGraphNode<>(1);
        node2 = new UndirectedGraphNode<>(2);
        node3 = new UndirectedGraphNode<>(3);
        node4 = new UndirectedGraphNode<>(4);
        node5 = new UndirectedGraphNode<>(5);
        node6 = new UndirectedGraphNode<>(6);
        node7 = new UndirectedGraphNode<>(7);
        node8 = new UndirectedGraphNode<>(8);
        node9 = new UndirectedGraphNode<>(9);
        node10 = new UndirectedGraphNode<>(10);

        node1.neighborList.add(node2);
        node1.neighborList.add(node3);

        node2.neighborList.add(node4);
        node2.neighborList.add(node5);
        node2.neighborList.add(node6);

        node3.neighborList.add(node1);
        node3.neighborList.add(node6);
        node3.neighborList.add(node7);
        node3.neighborList.add(node8);

        node4.neighborList.add(node2);
        node4.neighborList.add(node5);

        node5.neighborList.add(node2);
        node5.neighborList.add(node4);
        node5.neighborList.add(node6);

        node6.neighborList.add(node2);
        node6.neighborList.add(node5);
        node6.neighborList.add(node3);
        node6.neighborList.add(node8);
        node6.neighborList.add(node9);
        node6.neighborList.add(node10);

        node7.neighborList.add(node3);

        node8.neighborList.add(node3);
        node8.neighborList.add(node6);
        node8.neighborList.add(node9);

        node9.neighborList.add(node6);
        node9.neighborList.add(node8);
        node9.neighborList.add(node10);

        node10.neighborList.add(node6);
        node10.neighborList.add(node9);
    }

    @Test
    public void searchDFSTest(){
        UndirectedGraphSearch<Integer> undirectedGraphSearch = new UndirectedGraphSearch<>();
        undirectedGraphSearch.searchDFS(node1);

        String expectedSearchPath = "1->2->4->5->6->3->7->8->9->10";
        Assert.assertEquals(expectedSearchPath, undirectedGraphSearch.searchPathDFS.toString());
    }

    @Test
    public void searchBFSTest(){
        UndirectedGraphSearch<Integer> undirectedGraphSearch = new UndirectedGraphSearch<>();
        undirectedGraphSearch.searchBFS(node1);

        String expectedSearchPath = "1->2->3->4->5->6->7->8->9->10";
        Assert.assertEquals(expectedSearchPath, undirectedGraphSearch.searchPathBFS.toString());
    }
}
