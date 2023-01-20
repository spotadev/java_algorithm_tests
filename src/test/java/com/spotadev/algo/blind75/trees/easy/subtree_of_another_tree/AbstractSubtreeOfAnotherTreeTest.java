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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=E36O5SWp-LE
 * 
 * https://leetcode.com/problems/subtree-of-another-tree/
 * 
 *     Runtime: 4 ms, faster than 47.03% of Java online submissions for Subtree of Another Tree.
 *     
 *     Memory Usage: 46.6 MB, less than 39.39% of Java online submissions for Subtree of 
 *     Another Tree.
 * 
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root 
 * with the same structure and node values of subRoot and false otherwise.
 * 
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's 
 * descendants. The tree tree could also be considered as a subtree of itself. 
 * 
 * Example 1:
 * 
 *              3
 *           4      5          4
 *        1     2           1     2
 * 
 *     Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 *     Output: true
 * 
 * Example 2:
 * 
 *                3                    4
 *            4       5             1      2
 *         1      2 
 *         
 *             0
 * 
 *     Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 *     Output: false
 * 
 * Constraints:
 * 
 *     The number of nodes in the root tree is in the range [1, 2000].
 *     The number of nodes in the subRoot tree is in the range [1, 1000].
 *     -10^4 <= root.val <= 10^4
 *     -10^4 <= subRoot.val <= 10^4
 * 
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
