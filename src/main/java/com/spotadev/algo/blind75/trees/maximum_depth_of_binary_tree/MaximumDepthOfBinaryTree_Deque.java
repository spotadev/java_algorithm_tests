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

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=hTM3phVI6YQ&lc=UgxUajmaDDsmZ5Tp0U54AaABAg
 * 
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 *     Runtime: 1 ms, faster than 21.36% of Java online submissions for Maximum Depth of 
 *     Binary Tree.
 *     
 *     Memory Usage: 43.6 MB, less than 16.71% of Java online submissions for Maximum Depth of 
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
 *     Input: root = [1,null,2]
 *     Output: 2
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [0, 104].
 *     -100 <= Node.val <= 100
 * 
 * @author John Dickerson - 13 May 2022
 */
public class MaximumDepthOfBinaryTree_Deque {

    public int maxDepth( TreeNode root ) {

        if ( root == null ) {

            return 0;
        }

        int depth = 0;
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add( root );

        while ( !queue.isEmpty() ) {

            depth++;

            int size = queue.size();

            for ( int i = 0; i < size; i++ ) {

                TreeNode node = queue.poll();

                if ( node.left != null ) {

                    queue.addLast( node.left );
                }

                if ( node.right != null ) {

                    queue.addLast( node.right );
                }
            }
        }

        return depth;
    }
}
