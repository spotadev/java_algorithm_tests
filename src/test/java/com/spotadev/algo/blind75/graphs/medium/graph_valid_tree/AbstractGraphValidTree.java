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
package com.spotadev.algo.blind75.graphs.medium.graph_valid_tree;

import org.testng.Assert;

/**
 *  https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=bXsUuownnoQ
 * 
 * https://www.lintcode.com/problem/178/
 *
 * Description
 * 
 * Given n nodes labelled from 0 to n - 1 and a list of undirected edges (each edge is a pair of 
 * nodes), write a function to check whether these edges make up a valid tree.
 * 
 * A valid tree has nodes that are connected and do not loop.
 * 
 * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, 
 * [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * 
 * Example 1:
 * 
 *         0
 *      1  2  3  
 *      4
 *     
 *     n = 5 
 *     { {0, 1}, {0, 2}, {0, 3}, {1, 4} }
 * 
 *     Output: true.
 * 
 * Example 2:
 * 
 *         0
 *       1
 *     2-3 4
 *     
 *     Note in above: 
 *     
 *         1 is connected to 2 
 *         1 is connected to 3
 *         2 is connected to 3   ==> that makes a loop
 * 
 *     { {0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4} }
 * 
 *     Output: false.
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractGraphValidTree {

    protected GraphValidTreeAPI graphValidTree;

    void validTreeTest_1() {

        int n = 5;
        int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } };
        boolean validTree = graphValidTree.validTree( n, edges );
        Assert.assertTrue( validTree );
    }


    void validTreeTest_2() {

        int n = 5;
        int[][] edges = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 4 } };
        boolean validTree = graphValidTree.validTree( n, edges );
        Assert.assertFalse( validTree );
    }


    void validTreeTest_3() {

        int n = 2;
        int[][] edges = { { 1, 0 } };
        boolean validTree = graphValidTree.validTree( n, edges );
        Assert.assertTrue( validTree );
    }
}
