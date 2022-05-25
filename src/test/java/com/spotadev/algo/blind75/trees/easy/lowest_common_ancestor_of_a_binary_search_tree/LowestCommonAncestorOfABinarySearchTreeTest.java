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

import org.testng.Assert;
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
    public void lowestCommonAncestorTest_1() {

        TreeNode root = new TreeNode( 6 );
        TreeNode node_2 = new TreeNode( 2 );
        TreeNode node_8 = new TreeNode( 8 );
        TreeNode node_0 = new TreeNode( 0 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_7 = new TreeNode( 7 );
        TreeNode node_9 = new TreeNode( 9 );
        TreeNode node_3 = new TreeNode( 3 );
        TreeNode node_5 = new TreeNode( 5 );

        root.left = node_2;
        root.right = node_8;
        node_2.left = node_0;
        node_2.right = node_4;
        node_8.left = node_7;
        node_8.right = node_9;
        node_4.left = node_3;
        node_4.right = node_5;

        TreeNode p = new TreeNode( 2 );
        TreeNode q = new TreeNode( 8 );

        TreeNode lowestCommonAncestor =
                lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor( root, p, q );

        Assert.assertEquals( lowestCommonAncestor.val, 6 );
    }


    @Test
    public void lowestCommonAncestorTest_2() {

        TreeNode root = new TreeNode( 6 );
        TreeNode node_2 = new TreeNode( 2 );
        TreeNode node_8 = new TreeNode( 8 );
        TreeNode node_0 = new TreeNode( 0 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_7 = new TreeNode( 7 );
        TreeNode node_9 = new TreeNode( 9 );
        TreeNode node_3 = new TreeNode( 3 );
        TreeNode node_5 = new TreeNode( 5 );

        root.left = node_2;
        root.right = node_8;
        node_2.left = node_0;
        node_2.right = node_4;
        node_8.left = node_7;
        node_8.right = node_9;
        node_4.left = node_3;
        node_4.right = node_5;

        TreeNode p = new TreeNode( 2 );
        TreeNode q = new TreeNode( 1 );

        TreeNode lowestCommonAncestor =
                lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor( root, p, q );

        Assert.assertEquals( lowestCommonAncestor.val, 2 );
    }
}
