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
package com.spotadev.algo.blind75.trees.easy.lowest_common_ancestor_of_a_binary_search_tree;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class LowestCommonAncestorOfABinarySearchTreeTest {

    private LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree;

    @BeforeClass
    public void setUp() {

        lowestCommonAncestorOfABinarySearchTree = new LowestCommonAncestorOfABinarySearchTree();
    }


    @Test
    public void lowestCommonAncestorTest() {

        TreeNode root = null;
        TreeNode p = null;
        TreeNode q = null;

        TreeNode lowestCommonAncestor =
                lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor( root, p, q );
    }
}