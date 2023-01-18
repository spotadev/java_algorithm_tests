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

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractSubtreeOfAnotherTreeTest {

    protected SubtreeOfAnotherTreeAPI subtreeOfAnotherTree;

    void isSubtreeTest_1() {

        TreeNode root = new TreeNode( 3 );

        TreeNode node_4 = new TreeNode( 4 );
        node_4.left = new TreeNode( 1 );
        node_4.right = new TreeNode( 2 );
        root.left = node_4;

        root.right = new TreeNode( 5 );

        TreeNode subRoot = new TreeNode( 4 );
        subRoot.left = new TreeNode( 1 );
        subRoot.right = new TreeNode( 2 );

        boolean isSubtree = subtreeOfAnotherTree.isSubtree( root, subRoot );
        Assert.assertTrue( isSubtree );
    }


    void isSubtreeTest_2() {

        TreeNode root = new TreeNode( 3 );

        TreeNode node_4 = new TreeNode( 4 );
        node_4.left = new TreeNode( 1 );
        TreeNode node_2 = new TreeNode( 2 );
        node_2.left = new TreeNode( 0 );
        node_4.right = node_2;
        root.left = node_4;

        root.right = new TreeNode( 5 );

        TreeNode subRoot = new TreeNode( 4 );
        subRoot.left = new TreeNode( 1 );
        subRoot.right = new TreeNode( 2 );

        boolean isSubtree = subtreeOfAnotherTree.isSubtree( root, subRoot );
        Assert.assertFalse( isSubtree );
    }
}
