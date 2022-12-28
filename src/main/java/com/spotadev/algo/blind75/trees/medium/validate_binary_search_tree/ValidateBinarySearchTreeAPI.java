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

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=s6ATEkipzow
 * 
 * https://leetcode.com/problems/validate-binary-search-tree/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary 
 *     Search Tree.
 *     
 *     Memory Usage: 41.7 MB, less than 94.36% of Java online submissions for Validate Binary 
 *     Search Tree.
 * 
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * A valid BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * Example 1:
 * 
 *           2
 *         1   3
 * 
 *     Input: root = [2,1,3]
 *     Output: true
 * 
 * Example 2:
 * 
 *         5
 *       1    4  
 *          3   6
 * 
 *     Input: root = [5,1,4,null,null,3,6]
 *     Output: false
 *     Explanation: The root node's value is 5 but its right child's value is 4.
 * 
 * Example 3:
 * 
 *         5
 *      3      7   
 *           4   8
 *          
 *      Input: [5,3,7,null,null,4,8]     
 *      Output: false   
 *      Explanation: 4 should have been more than 5 
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [1, 104].
 *     -231 <= Node.val <= 231 - 1
 * 
 * @author John Dickerson - 13 May 2022
 */
public interface ValidateBinarySearchTreeAPI {

    boolean isValidBST( TreeNode root );

}