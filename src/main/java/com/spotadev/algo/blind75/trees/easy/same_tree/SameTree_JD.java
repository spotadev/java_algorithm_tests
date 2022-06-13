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
package com.spotadev.algo.blind75.trees.easy.same_tree;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=vRbbcKXCxOw
 * 
 * https://leetcode.com/problems/same-tree/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
 *     Memory Usage: 41.8 MB, less than 27.81% of Java online submissions for Same Tree.
 * 
 * Given the roots of two binary trees p and q, write a function to check if they are the same or 
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical, and the nodes have 
 * the same value.
 * 
 * Example 1:
 * 
 *     Input: p = [1,2,3], q = [1,2,3]
 *     Output: true
 * 
 * Example 2:
 * 
 *     Input: p = [1,2], q = [1,null,2]
 *     Output: false
 * 
 * Example 3:
 * 
 *     Input: p = [1,2,1], q = [1,1,2]
 *     Output: false
 * 
 * Constraints:
 * 
 *     The number of nodes in both trees is in the range [0, 100].
 *     -104 <= Node.val <= 104
 * 
 * @author John Dickerson - 13 May 2022
 */
public class SameTree_JD implements SameTreeAPI {

    @Override
    public boolean isSameTree( TreeNode p, TreeNode q ) {

        if ( p == null && q == null ) {

            return true;
        }

        if ( ( p == null || q == null ) || ( p.val != q.val ) ) {

            return false;
        }

        return isSameTree( p.left, q.left ) && isSameTree( p.right, q.right );
    }
}
