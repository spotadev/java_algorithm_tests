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
package com.spotadev.algo.blind75.trees.easy.subtree_of_another_tree;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class SubtreeOfAnotherTreeTest {

    private SubtreeOfAnotherTree subtreeOfAnotherTree;

    @BeforeClass
    public void setUp() {

        subtreeOfAnotherTree = new SubtreeOfAnotherTree();
    }


    @Test
    public void isSubtree() {

        TreeNode root = null;
        TreeNode subRoot = null;
        boolean isSubtree = subtreeOfAnotherTree.isSubtree( root, subRoot );
        Assert.assertTrue( isSubtree );
    }
}
