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
package com.spotadev.algo.blind75.trees.medium.validate_binary_search_tree;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class ValidateBinarySearchTreeTest {

    private ValidateBinarySearchTree validateBinarySearchTree;

    @BeforeClass
    public void setUp() {

        validateBinarySearchTree = new ValidateBinarySearchTree();
    }


    @Test
    public void isValidBSTTest_1() {

        TreeNode root = new TreeNode( 2 );
        TreeNode node_1 = new TreeNode( 1 );
        TreeNode node_3 = new TreeNode( 3 );
        root.left = node_1;
        root.right = node_3;

        boolean valid = validateBinarySearchTree.isValidBST( root );
        Assert.assertTrue( valid );
    }


    @Test
    public void isValidBSTTest_2() {

        TreeNode root = new TreeNode( 5 );
        TreeNode node_1 = new TreeNode( 1 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_3 = new TreeNode( 3 );
        TreeNode node_6 = new TreeNode( 6 );
        root.left = node_1;
        root.right = node_4;
        node_4.left = node_3;
        node_4.right = node_6;

        boolean valid = validateBinarySearchTree.isValidBST( root );
        Assert.assertFalse( valid );
    }


    @Test
    public void isValidBSTTest_3() {

        TreeNode root = new TreeNode( 5 );
        TreeNode node_3 = new TreeNode( 3 );
        TreeNode node_7 = new TreeNode( 7 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_8 = new TreeNode( 8 );
        root.left = node_3;
        root.right = node_7;
        node_7.left = node_4;
        node_7.right = node_8;

        boolean valid = validateBinarySearchTree.isValidBST( root );
        Assert.assertFalse( valid );
    }
}
