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
package com.spotadev.algo.blind75.trees.medium.binary_tree_level_order_traversal;

import java.util.List;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractBinaryTreeLevelOrderTraversalTest {

    protected BinaryTreeLevelOrderTraversalAPI binaryTreeLevelOrderTraversal;

    void levelOrderTest_1() {

        TreeNode root = new TreeNode( 3 );
        TreeNode node_9 = new TreeNode( 9 );
        TreeNode node_20 = new TreeNode( 20 );
        TreeNode node_15 = new TreeNode( 15 );
        TreeNode node_7 = new TreeNode( 7 );

        root.left = node_9;
        root.right = node_20;
        node_20.left = node_15;
        node_20.right = node_7;

        List<List<Integer>> levelOrders = binaryTreeLevelOrderTraversal.levelOrder( root );
        List<?> list_0 = levelOrders.get( 0 );
        Assert.assertEquals( list_0.get( 0 ), 3 );
        List<?> list_1 = levelOrders.get( 1 );
        Assert.assertEquals( list_1.get( 0 ), 9 );
        Assert.assertEquals( list_1.get( 1 ), 20 );
        List<?> list_2 = levelOrders.get( 2 );
        Assert.assertEquals( list_2.get( 0 ), 15 );
        Assert.assertEquals( list_2.get( 1 ), 7 );
    }


    void levelOrderTest_2() {

        TreeNode root = new TreeNode( 1 );

        List<List<Integer>> levelOrders = binaryTreeLevelOrderTraversal.levelOrder( root );
        List<?> list_0 = levelOrders.get( 0 );
        Assert.assertEquals( list_0.get( 0 ), 1 );
    }

}
