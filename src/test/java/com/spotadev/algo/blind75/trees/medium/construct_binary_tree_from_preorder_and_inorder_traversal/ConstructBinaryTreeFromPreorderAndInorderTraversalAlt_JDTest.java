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
package com.spotadev.algo.blind75.trees.medium.construct_binary_tree_from_preorder_and_inorder_traversal;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalAlt_JDTest {

    private ConstructBinaryTreeFromPreorderAndInorderTraversalAlt_JD constructBinaryTreeFromPreorderAndInorderTraversal;

    @BeforeClass
    public void setUp() {

        constructBinaryTreeFromPreorderAndInorderTraversal =
                new ConstructBinaryTreeFromPreorderAndInorderTraversalAlt_JD();
    }


    /**
     *             3
     *          9     20
     *              15    7  
     */
    @Test
    public void buildTreeTest() {

        int[] preorder = new int[] { 3, 9, 20, 15, 7 };
        int[] inorder = new int[] { 9, 3, 15, 20, 7 };

        TreeNode node =
                constructBinaryTreeFromPreorderAndInorderTraversal.buildTree( preorder, inorder );

        Assert.assertEquals( node.val, 3 );
        TreeNode node_9 = node.left;
        Assert.assertEquals( node_9.val, 9 );
        TreeNode node_20 = node.right;
        Assert.assertEquals( node_20.val, 20 );
        TreeNode node_15 = node_20.left;
        Assert.assertEquals( node_15.val, 15 );
        TreeNode node_7 = node_20.right;
        Assert.assertEquals( node_7.val, 7 );
    }
}
