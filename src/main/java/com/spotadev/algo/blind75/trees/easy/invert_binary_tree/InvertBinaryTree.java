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
package com.spotadev.algo.blind75.trees.easy.invert_binary_tree;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=OnSn2XEQ4MY
 * 
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 *     Memory Usage: 42.7 MB, less than 7.25% of Java online submissions for Invert Binary Tree.
 * 
 * Given the root of a binary tree, invert the tree, and return its root.
 * 
 * Example 1:
 * 
 * 
 *                 4
 *             2        7
 *         1      3  6     9
 *            
 * 
 *     Input: root = [4,2,7,1,3,6,9]
 *     
 *                 4
 *             7        2
 *         9     6   3    1
 *     
 *     Output: [4,7,2,9,6,3,1]
 * 
 * Example 2:
 * 
 *              2
 *           1     3   
 * 
 *     Input: root = [2,1,3]
 *     
 *              2
 *           3      1   
 *     
 *     Output: [2,3,1]
 * 
 * Example 3:
 * 
 *     Input: root = []
 *     Output: []
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [0, 100].
 *     -100 <= Node.val <= 100
 * 
 * @author John Dickerson - 13 May 2022
 */
public class InvertBinaryTree {

    private void swap( TreeNode node ) {

        if ( node != null ) {

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            swap( node.left );
            swap( node.right );
        }
    }


    public TreeNode invertTree( TreeNode root ) {

        swap( root );
        return root;
    }
}
