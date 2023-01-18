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
package com.spotadev.algo.blind75.graphs.medium.number_connected_components_in_an_undirected_graph;

import org.testng.Assert;

/**
 * @author John Dickerson - 17 Jun 2022
 */
public abstract class AbstractNumberConnectedComponentsInAnUndirectedGraphTest {

    protected NumberConnectedComponentsInAnUndirectedGraphAPI numberConnectedComponentsInAnUndirectedGraph;

    void countComponentsTest_1() {

        int[][] edges = { { 0, 1 }, { 1, 2 }, { 3, 4 } };
        int n = 5;
        int number = numberConnectedComponentsInAnUndirectedGraph.countComponents( n, edges );
        Assert.assertEquals( number, 2 );
    }


    /**
     *       0      3       6       
     *       1    4   5     7
     *       2             8  9
     */
    void countComponentsTest_2() {

        int[][] edges = { { 0, 1 }, { 1, 2 }, { 3, 4 }, { 3, 5 }, { 6, 7 }, { 7, 8 }, { 7, 9 } };
        int n = 10;
        int number = numberConnectedComponentsInAnUndirectedGraph.countComponents( n, edges );
        Assert.assertEquals( number, 3 );
    }

}
