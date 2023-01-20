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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=Hr5cWUld4vU
 * 
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * 
 *     Runtime: 1 ms, faster than 93.99% of Java online submissions for Binary Tree Maximum Path 
 *     Sum.
 *     
 *     Memory Usage: 46.8 MB, less than 69.68% of Java online submissions for Binary Tree Maximum 
 *     Path Sum.
 * 
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence 
 * has an edge connecting them. A node can only appear in the sequence at most once. Note that the 
 * path does not need to pass through the root.
 * 
 * The path sum of a path is the sum of the node's values in the path.
 * 
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * 
 * Example 1:
 *             1
 *          2     3
 * 
 *     Input: root = [1,2,3]
 *     Output: 6
 *     Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * 
 * Example 2:
 * 
 *            -10
 *       9           20
 *               15       7 
 * 
 *     Input: root = [-10,9,20,null,null,15,7]
 *     Output: 42
 *     Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 *  
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [1, 3 * 10^4].
 *     -1000 <= Node.val <= 1000
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public class BinaryTreeMaximumPathSum_JDTest extends AbstractBinaryTreeMaximumPathSumTest {

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
