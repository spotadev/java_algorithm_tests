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
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractGraphValidTree {

    protected GraphValidTreeAPI graphValidTree;

    public void validTreeTest() {

        int n = -1;
        int[][] edges = new int[][] {};
        boolean validTree = graphValidTree.validTree( n, edges );
    }
}
