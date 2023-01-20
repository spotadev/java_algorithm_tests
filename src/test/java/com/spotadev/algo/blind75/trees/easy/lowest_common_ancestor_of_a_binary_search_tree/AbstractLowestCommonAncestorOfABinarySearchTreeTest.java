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

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=gs2LMfuOR9k
 * 
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 
 *    Runtime: 5 ms, faster than 78.72% of Java online submissions for Lowest Common Ancestor of 
 *    a Binary Search Tree.
 *    
 *    Memory Usage: 50.7 MB, less than 6.67% of Java online submissions for Lowest Common Ancestor 
 *    of a Binary Search Tree.
 * 
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes 
 * in the BST.
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between 
 * two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a 
 * node to be a descendant of itself).”
 * 
 * Example 1: 
 * 
 *            6
 *        2       8
 *      0   4    7    9
 *         3  5    
 * 
 *     Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 *     Output: 6
 *     Explanation: The LCA of nodes 2 and 8 is 6.
 *
 * Example 2:
 * 
 *              6
 *          2         8
 *       0    4    7     9
 *          3    5    
 *
 *     Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 *     Output: 2
 *     Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself 
 *     according to the LCA definition.
 * 
 * Example 3:
 *
 *     Input: root = [2,1], p = 2, q = 1
 *     Output: 2 
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [2, 105].
 *     -10^9 <= Node.val <= 10^9
 *     All Node.val are unique.
 *     p != q
 *     p and q will exist in the BST.
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractLowestCommonAncestorOfABinarySearchTreeTest {

    protected LowestCommonAncestorOfABinarySearchTreeAPI lowestCommonAncestorOfABinarySearchTree;

    void lowestCommonAncestorTest_1() {

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


    void lowestCommonAncestorTest_2() {

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
