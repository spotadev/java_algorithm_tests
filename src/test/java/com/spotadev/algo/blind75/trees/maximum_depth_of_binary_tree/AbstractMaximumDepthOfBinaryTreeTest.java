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
package com.spotadev.algo.blind75.trees.maximum_depth_of_binary_tree;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractMaximumDepthOfBinaryTreeTest {

    protected MaximumDepthOfBinaryTree_RecursiveUsingMax_JD maximumDepthOfBinaryTree;

    public void maxDepthTest_1() {

        TreeNode node_3 = new TreeNode( 3 );
        node_3.left = new TreeNode( 9 );

        TreeNode node_20 = new TreeNode( 20 );
        node_3.right = node_20;

        TreeNode node_15 = new TreeNode( 15 );
        node_20.left = node_15;

        TreeNode node_7 = new TreeNode( 7 );
        node_20.right = node_7;

        int maxDepth = maximumDepthOfBinaryTree.maxDepth( node_3 );
        Assert.assertEquals( maxDepth, 3 );
    }


    public void maxDepthTest_2() {

        TreeNode node_1 = new TreeNode( 1 );

        TreeNode node_2 = new TreeNode( 2 );
        node_1.right = node_2;

        int maxDepth = maximumDepthOfBinaryTree.maxDepth( node_1 );
        Assert.assertEquals( maxDepth, 2 );
    }
}
