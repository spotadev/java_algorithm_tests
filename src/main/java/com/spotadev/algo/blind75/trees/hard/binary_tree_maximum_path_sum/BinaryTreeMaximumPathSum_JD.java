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
 * @author John Dickerson - 13 May 2022
 */
public class BinaryTreeMaximumPathSum_JD implements BinaryTreeMaximumPathSumAPI {

    /**
     *            -10
     *       9           20
     *               15       7 
     *               
     *   Consider that when we start with -10 the max is max of left and max of right:
     *   
     *        9 => -10 => 20 => 15
     *        
     *   The method returns the max of it can achieve from by going left or right
     *   
     *   However the max count is updated internally
     *   
     *   We are using an array for a single value to path by reference. We could have used 
     *   AtomicInteger but that would have involved getters and setters.
     */
    @Override
    public int maxPathSum( TreeNode node, int[] max ) {

        if ( node == null ) {

            return 0;
        }

        int leftMax = maxPathSum( node.left, max );
        int rightMax = maxPathSum( node.right, max );
        leftMax = Math.max( leftMax, 0 );
        rightMax = Math.max( rightMax, 0 );
        max[0] = Math.max( max[0], node.val + leftMax + rightMax );
        return node.val + Math.max( leftMax, rightMax );
    }


    @Override
    public int maxPathSum( TreeNode root ) {

        int[] max = new int[] { root.val };
        maxPathSum( root, max );
        return max[0];
    }
}
