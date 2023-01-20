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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=8f1XPm4WOUc
 * 
 * This is locked:
 * 
 *      https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
 * 
 * This solution is not using:
 * 
 *     Union Find
 * 
 * No metrics because locked.
 * 
 * Note you need premium membership on leetcode to access this one.
 * 
 * You have a graph of n nodes. You are given an Integer n and an array of edges where
 * 
 *      edges[i] = [ai, bi] 
 *      
 * indicates that there is an edge between:
 * 
 *      ai and bi
 *      
 * in the graph.
 * 
 * Return the number of connected components in the graph.
 * 
 * Example 1
 * 
 *      0-1      3
 *        |      |
 *        2      4
 *        
 * Input: n = 5, edges = { {0,1}, {1,2}, {3,4} }
 * Output: 2
 * 
 * @author John Dickerson - 17 Jun 2022
 */
public class NumberConnectedComponentsInAnUndirectedGraph_JDTest extends
        AbstractNumberConnectedComponentsInAnUndirectedGraphTest {

    @BeforeClass
    public void setUp() {

        numberConnectedComponentsInAnUndirectedGraph =
                new NumberConnectedComponentsInAnUndirectedGraph_JD();
    }


    @Test
    public void countComponentsTest_1() {

        super.countComponentsTest_1();
    }


    @Test
    public void countComponentsTest_2() {

        super.countComponentsTest_2();
    }
}
