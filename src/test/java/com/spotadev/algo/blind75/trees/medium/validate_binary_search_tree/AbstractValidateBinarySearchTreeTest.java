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

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=5LUXSvjmGCw
 * 
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * 
 *     Runtime: 1 ms, faster than 60.70% of Java online submissions for Kth Smallest Element in a 
 *     BST.
 *     
 *     Memory Usage: 45.7 MB, less than 19.12% of Java online submissions for Kth Smallest Element 
 *     in a BST.
 * 
 * Given the root of a binary search tree, and an integer k, return the kth smallest value 
 * (1-indexed) of all the values of the nodes in the tree.
 * 
 * Example 1:
 * 
 *               3
 *            1     4
 *               2    
 * 
 *     Input: root = [3,1,4,null,2], k = 1
 *     Output: 1
 * 
 * Example 2:
 * 
 *                 5
 *            3         6
 *         2       4
 *     1             
 * 
 *     Input: root = [5,3,6,2,4,null,null,1], k = 3
 *     Output: 3
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is n.
 *     1 <= k <= n <= 10^4
 *     0 <= Node.val <= 10^4
 * 
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and 
 * you need to find the kth smallest frequently, how would you optimize?
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractValidateBinarySearchTreeTest {

    protected ValidateBinarySearchTreeAPI validateBinarySearchTree;

    void isValidBSTTest_1() {

        TreeNode root = new TreeNode( 2 );
        TreeNode node_1 = new TreeNode( 1 );
        TreeNode node_3 = new TreeNode( 3 );
        root.left = node_1;
        root.right = node_3;

        boolean valid = validateBinarySearchTree.isValidBST( root );
        Assert.assertTrue( valid );
    }


    void isValidBSTTest_2() {

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


    void isValidBSTTest_3() {

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
