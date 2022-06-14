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
package com.spotadev.algo.blind75.trees.medium.kth_smallest_element_in_a_bst;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractKthSmallestElementInABSTTest {

    protected KthSmallestElementInABSTAPI kthSmallestElementInABST;

    public void kthSmallest_1() {

        TreeNode root = new TreeNode( 3 );
        TreeNode node_1 = new TreeNode( 1 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_2 = new TreeNode( 2 );

        root.left = node_1;
        root.right = node_4;
        node_1.right = node_2;

        int smallest = kthSmallestElementInABST.kthSmallest( root, 1 );
        Assert.assertEquals( smallest, 1 );
    }


    public void kthSmallest_2() {

        TreeNode root = new TreeNode( 5 );
        TreeNode node_3 = new TreeNode( 3 );
        TreeNode node_6 = new TreeNode( 6 );
        TreeNode node_2 = new TreeNode( 2 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_1 = new TreeNode( 1 );

        root.left = node_3;
        root.right = node_6;
        node_3.left = node_2;
        node_3.right = node_4;
        node_2.left = node_1;

        int smallest = kthSmallestElementInABST.kthSmallest( root, 3 );
        Assert.assertEquals( smallest, 3 );
    }
}
