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

/**
 * https://www.lintcode.com/problem/178/
 * 
 * Description
 * 
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of 
 * nodes), write a function to check whether these edges make up a valid tree.
 * 
 * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, 
 * [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * 
 * Example 1:
 * 
 *     0, 1], [0, 2], [0, 3], [1, 4
 * 
 *     Output: true.
 * 
 * Example 2:
 * 
 *     0, 1], [1, 2], [2, 3], [1, 3], [1, 4
 * 
 *     Output: false.
 * 
 * @author John Dickerson - 13 May 2022
 */
public class GraphValidTree_JD implements GraphValidTreeAPI {

    /**
     * @param n: An integer
     * @param edges: a list of undirected edges
     * @return: true if it's a valid tree, or false
     */
    @Override
    public boolean validTree( int n, int[][] edges ) {

        return false;
    }
}
