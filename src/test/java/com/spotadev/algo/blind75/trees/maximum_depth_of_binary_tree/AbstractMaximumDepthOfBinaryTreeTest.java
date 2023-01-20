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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=hTM3phVI6YQ&lc=UgxUajmaDDsmZ5Tp0U54AaABAg
 * 
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary 
 *     Tree.
 * 
 *     Memory Usage: 42.7 MB, less than 66.76% of Java online submissions for Maximum Depth of 
 *     Binary Tree.
 * 
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path from the root 
 * node down to the farthest leaf node. 
 * 
 * Example 1:
 * 
 *                  3
 *             9         20
 *                    15      7
 * 
 *     Input: root = [3,9,20,null,null,15,7]
 *     Output: 3
 * 
 * Example 2:
 * 
 *                  1
 *                       2
 * 
 *     Input: root = [1,null,2]
 *     Output: 2
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [0, 104].
 *     -100 <= Node.val <= 100
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractMaximumDepthOfBinaryTreeTest {

    protected MaximumDepthOfBinaryTree_RecursiveUsingMax_JD maximumDepthOfBinaryTree;

    void maxDepthTest_1() {

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


    void maxDepthTest_2() {

        TreeNode node_1 = new TreeNode( 1 );

        TreeNode node_2 = new TreeNode( 2 );
        node_1.right = node_2;

        int maxDepth = maximumDepthOfBinaryTree.maxDepth( node_1 );
        Assert.assertEquals( maxDepth, 2 );
    }
}
