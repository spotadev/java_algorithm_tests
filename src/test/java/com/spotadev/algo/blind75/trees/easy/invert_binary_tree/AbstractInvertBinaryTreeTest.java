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
package com.spotadev.algo.blind75.trees.easy.invert_binary_tree;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractInvertBinaryTreeTest {

    protected InvertBinaryTreeAPI invertBinaryTree;

    /**
    *                 4
    *             2        7
    *         1      3  6     9
    *            
    * 
    *     Input: root = [4,2,7,1,3,6,9]
    *     
    *                 4
    *             7        2
    *         9     6   3    1
    *     
    *     Output: [4,7,2,9,6,3,1]
    */
    void invertTreeTreeTest_1() {

        TreeNode node_4_in = new TreeNode( 4 );

        TreeNode node_2_in = new TreeNode( 2 );
        node_4_in.left = node_2_in;

        TreeNode node_1_in = new TreeNode( 1 );
        node_2_in.left = node_1_in;

        TreeNode node_3_in = new TreeNode( 3 );
        node_2_in.right = node_3_in;

        TreeNode node_7_in = new TreeNode( 7 );
        node_4_in.right = node_7_in;

        TreeNode node_6_in = new TreeNode( 6 );
        node_7_in.left = node_6_in;

        TreeNode node_9_in = new TreeNode( 9 );
        node_7_in.right = node_9_in;

        TreeNode result = invertBinaryTree.invertTree( node_4_in );
        Assert.assertEquals( result.val, 4 );

        TreeNode node_7_out = result.left;
        Assert.assertEquals( node_7_out.val, 7 );

        TreeNode node_2_out = result.right;
        Assert.assertEquals( node_2_out.val, 2 );

        TreeNode node_9_out = node_7_out.left;
        Assert.assertEquals( node_9_out.val, 9 );

        TreeNode node_6_out = node_7_out.right;
        Assert.assertEquals( node_6_out.val, 6 );

        TreeNode node_3_out = node_2_out.left;
        Assert.assertEquals( node_3_out.val, 3 );

        TreeNode node_1_out = node_2_out.right;
        Assert.assertEquals( node_1_out.val, 1 );
    }


    void invertTreeTreeTest_2() {

        TreeNode node_2_in = new TreeNode( 2 );

        TreeNode node_1_in = new TreeNode( 1 );
        node_2_in.left = node_1_in;

        TreeNode node_3_in = new TreeNode( 3 );
        node_2_in.right = node_3_in;

        TreeNode result = invertBinaryTree.invertTree( node_2_in );
        Assert.assertEquals( result.val, 2 );

        TreeNode node_3_out = result.left;
        Assert.assertEquals( node_3_out.val, 3 );

        TreeNode node_1_out = result.right;
        Assert.assertEquals( node_1_out.val, 1 );
    }


    void invertTreeTreeTest_3() {

        TreeNode root_in = null;
        TreeNode result = invertBinaryTree.invertTree( root_in );
        Assert.assertNull( result );
    }
}
