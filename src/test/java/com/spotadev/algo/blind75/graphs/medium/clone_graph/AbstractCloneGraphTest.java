/*
    ================================================================================================
    This code is part of java_algorith_tests which is an effort of SpotADev

    java_algorith_tests is used for getting SpotADev devs up to speed so they can pass tests on
    java algorithms.
    
    Copyright (C) 2021 java_algorith_tests

    ================================================================================================
    Author : John Dickerson
    ================================================================================================
*/
package com.spotadev.algo.blind75.graphs.medium.clone_graph;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=mQeF6bN8hMk
 * 
 * https://leetcode.com/problems/clone-graph/
 * 
 *     Runtime: 39 ms, faster than 43.21% of Java online submissions for Clone Graph.
 *     
 *     Memory Usage: 43.4 MB, less than 44.60% of Java online submissions for Clone Graph.
 * 
 * Given a reference of a node in a connected undirected graph.
 * 
 * Return a deep copy (clone) of the graph.
 * 
 * Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
 * 
 * class Node {
 *     public int val;
 *     public List<Node> neighbors;
 * }
 *  
 * Test case format:
 * 
 *     For simplicity, each node's value is the same as the node's index (1-indexed). For example, 
 *     the first node with val == 1, the second node with val == 2, and so on. The graph is 
 *     represented in the test case using an adjacency list.
 * 
 *     An adjacency list is a collection of unordered lists used to represent a finite graph. 
 *     Each list describes the set of neighbors of a node in the graph.
 * 
 *     The given node will always be the first node with val = 1. You must return the copy of the 
 *     given node as a reference to the cloned graph.
 * 
 * Example 1:
 * 
 *     Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 *     Output: [[2,4],[1,3],[2,4],[1,3]]
 *     
 *     Explanation: There are 4 nodes in the graph.
 * 
 *         1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
 *         2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
 *         3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
 *         4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
 * 
 * Example 2:
 * 
 *     Input: adjList = [[]]
 *     Output: [[]]
 * 
 *     Explanation: Note that the input contains one empty list. The graph consists of only one 
 *     node with val = 1 and it does not have any neighbors.
 * 
 * Example 3:
 * 
 *     Input: adjList = []
 *     Output: []
 *     Explanation: This an empty graph, it does not have any nodes.
 * 
 * Constraints:
 * 
 *     The number of nodes in the graph is in the range [0, 100].
 *     1 <= Node.val <= 100
 *     Node.val is unique for each node.
 *     There are no repeated edges and no self-loops in the graph.
 *     The Graph is connected and all nodes can be visited starting from the given node.
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractCloneGraphTest {

    protected CloneGraphAPI cloneGraph;

    void cloneGraphTest_1() {

        Node node1 = new Node( 1 );
        Node node2 = new Node( 2 );
        Node node3 = new Node( 3 );
        Node node4 = new Node( 4 );

        List<Node> node1Neighbours = new ArrayList<>();
        node1Neighbours.add( node2 );
        node1Neighbours.add( node4 );
        node1.neighbors = node1Neighbours;

        List<Node> node2Neighbours = new ArrayList<>();
        node2Neighbours.add( node1 );
        node2Neighbours.add( node3 );
        node2.neighbors = node2Neighbours;

        List<Node> node3Neighbours = new ArrayList<>();
        node3Neighbours.add( node2 );
        node3Neighbours.add( node4 );
        node3.neighbors = node3Neighbours;

        List<Node> node4Neighbours = new ArrayList<>();
        node4Neighbours.add( node1 );
        node4Neighbours.add( node3 );
        node4.neighbors = node4Neighbours;

        Node clonedNode1 = cloneGraph.cloneGraph( node1 );
        Assert.assertEquals( clonedNode1.val, 1 );
        Assert.assertTrue( clonedNode1 != node1 );
        Assert.assertEquals( clonedNode1.neighbors.get( 0 ).val, 2 );
        Assert.assertEquals( clonedNode1.neighbors.get( 1 ).val, 4 );

        Node clonedNode4 = clonedNode1.neighbors.get( 1 );
        Assert.assertEquals( clonedNode4.val, 4 );
        Assert.assertTrue( clonedNode4 != node4 );
        Assert.assertEquals( clonedNode4.neighbors.get( 0 ).val, 1 );
        Assert.assertEquals( clonedNode4.neighbors.get( 1 ).val, 3 );

        Node clonedNode3 = clonedNode4.neighbors.get( 1 );
        Assert.assertEquals( clonedNode3.val, 3 );
        Assert.assertTrue( clonedNode3 != node3 );
        Assert.assertEquals( clonedNode3.neighbors.get( 0 ).val, 2 );
        Assert.assertEquals( clonedNode3.neighbors.get( 1 ).val, 4 );

        Node clonedNode2 = clonedNode3.neighbors.get( 0 );
        Assert.assertEquals( clonedNode2.val, 2 );
        Assert.assertTrue( clonedNode2 != node2 );
        Assert.assertEquals( clonedNode2.neighbors.get( 0 ).val, 1 );
        Assert.assertEquals( clonedNode2.neighbors.get( 1 ).val, 3 );
    }


    void cloneGraphTest_2() {

        Node node1 = new Node( 1 );
        Node clonedNode1 = cloneGraph.cloneGraph( node1 );
        Assert.assertEquals( clonedNode1.val, 1 );
        Assert.assertTrue( clonedNode1 != node1 );
    }


    void cloneGraphTest_3() {

        Node clonedNode1 = cloneGraph.cloneGraph( null );
        Assert.assertNull( clonedNode1 );
    }
}
