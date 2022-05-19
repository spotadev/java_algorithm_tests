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

/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 * 
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root 
 * with the same structure and node values of subRoot and false otherwise.
 * 
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's 
 * descendants. The tree tree could also be considered as a subtree of itself. 
 * 
 * Example 1:
 * 
 *     Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 *     Output: true
 * 
 * Example 2:
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
 * @author John Dickerson - 13 May 2022
 */
public class SubtreeOfAnotherTree {

    public boolean isSubtree( TreeNode root, TreeNode subRoot ) {

        return false;
    }
}