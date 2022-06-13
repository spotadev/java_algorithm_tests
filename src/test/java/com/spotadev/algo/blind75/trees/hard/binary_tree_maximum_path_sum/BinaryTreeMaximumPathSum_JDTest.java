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
package com.spotadev.algo.blind75.trees.hard.binary_tree_maximum_path_sum;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class BinaryTreeMaximumPathSum_JDTest {

    private BinaryTreeMaximumPathSumAPI binaryTreeMaximumPathSum;

    @BeforeClass
    public void setUp() {

        binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum_JD();
    }


    @Test
    public void maxPathSumTest() {

        TreeNode root = new TreeNode( 1 );
        TreeNode node_2 = new TreeNode( 2 );
        TreeNode node_3 = new TreeNode( 3 );
        root.left = node_2;
        root.right = node_3;
        int maxPathSum = binaryTreeMaximumPathSum.maxPathSum( root );
        Assert.assertEquals( maxPathSum, 6 );
    }


    @Test
    public void maxPathSumTest_2() {

        TreeNode root = new TreeNode( -10 );
        TreeNode node_9 = new TreeNode( 9 );
        TreeNode node_20 = new TreeNode( 20 );
        TreeNode node_15 = new TreeNode( 15 );
        TreeNode node_7 = new TreeNode( 7 );
        root.left = node_9;
        root.right = node_20;
        node_20.left = node_15;
        node_20.right = node_7;
        int maxPathSum = binaryTreeMaximumPathSum.maxPathSum( root );
        Assert.assertEquals( maxPathSum, 42 );
    }


    @Test
    public void maxPathSumTest_3() {

        TreeNode root = new TreeNode( -3 );
        int maxPathSum = binaryTreeMaximumPathSum.maxPathSum( root );
        Assert.assertEquals( maxPathSum, -3 );
    }
}
