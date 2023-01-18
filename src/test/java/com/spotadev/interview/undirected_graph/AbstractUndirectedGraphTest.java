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
package com.spotadev.interview.undirected_graph;

import org.testng.Assert;

/**
 * @author John Dickerson - 26 Jun 2022
 */
public abstract class AbstractUndirectedGraphTest {

    protected UndirectedGraphAPI undirectedGraph;

    void sumOfAllEdgesTest_1() {

        int N = 5;
        int A[] = { 2, 2, 1, 2 };
        int B[] = { 1, 3, 4, 4 };

        int maxSum = undirectedGraph.sumOfAllEdges( N, A, B );
        Assert.assertEquals( maxSum, 31 );
    }
}
