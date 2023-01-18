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
