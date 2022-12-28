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
package com.spotadev.algo.blind75.trees.medium.binary_tree_level_order_traversal;

import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=6ZnyEApgFYg
 * 
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 
 *     Runtime: 1 ms, faster than 84.66% of Java online submissions for Binary Tree Level Order 
 *     Traversal.
 *     
 *     Memory Usage: 43.4 MB, less than 59.56% of Java online submissions for Binary Tree Level 
 *     Order Traversal.
 * 
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., 
 * from left to right, level by level).
 * 
 * Example 1:
 * 
 *          3
 *       9      20
 *           15     7   
 * 
 *     Input: root = [3,9,20,null,null,15,7]
 *     Output: [[3],[9,20],[15,7]]
 * 
 * Example 2:   
 * 
 *     Input: root = [1]
 *     Output: [[1]]
 * 
 * Example 3:
 * 
 *     Input: root = []
 *     Output: []
 *  
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [0, 2000].
 *     -1000 <= Node.val <= 1000
 * 
 * @author John Dickerson - 13 May 2022
 */
public interface BinaryTreeLevelOrderTraversalAPI {

    List<List<Integer>> levelOrder( TreeNode root );

}