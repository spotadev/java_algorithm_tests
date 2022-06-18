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
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractGraphValidTree {

    protected GraphValidTreeAPI graphValidTree;

    public void validTreeTest_1() {

        int n = 5;
        int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } };
        boolean validTree = graphValidTree.validTree( n, edges );
        Assert.assertTrue( validTree );
    }


    public void validTreeTest_2() {

        int n = 5;
        int[][] edges = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 4 } };
        boolean validTree = graphValidTree.validTree( n, edges );
        Assert.assertFalse( validTree );
    }


    public void validTreeTest_3() {

        int n = 2;
        int[][] edges = { { 1, 0 } };
        boolean validTree = graphValidTree.validTree( n, edges );
        Assert.assertTrue( validTree );
    }
}
