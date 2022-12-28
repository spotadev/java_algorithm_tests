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
 * @author John Dickerson - 13 May 2022
 */
public interface LowestCommonAncestorOfABinarySearchTreeAPI {

    TreeNode lowestCommonAncestor( TreeNode root, TreeNode p, TreeNode q );

}