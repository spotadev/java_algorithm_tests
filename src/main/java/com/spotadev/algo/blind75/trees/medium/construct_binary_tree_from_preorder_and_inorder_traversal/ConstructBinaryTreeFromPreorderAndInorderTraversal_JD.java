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
package com.spotadev.algo.blind75.trees.medium.construct_binary_tree_from_preorder_and_inorder_traversal;

import java.util.Arrays;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=ihj4IQGZ2zc
 * 
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * 
 *     Runtime: 16 ms, faster than 7.80% of Java online submissions for Construct Binary Tree 
 *     from Preorder and Inorder Traversal.
 *     
 *     Memory Usage: 91.9 MB, less than 5.02% of Java online submissions for Construct Binary Tree 
 *     from Preorder and Inorder Traversal.
 * 
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a 
 * binary tree and inorder is the inorder traversal of the same tree, construct and return the 
 * binary tree.
 * 
 * Example 1:
 * 
 *             3
 *          9     20
 *              15    7    
 * 
 *     Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 *     Output: [3,9,20,null,null,15,7]
 * 
 * Example 2:
 * 
 *     Input: preorder = [-1], inorder = [-1]
 *     Output: [-1]
 * 
 * Constraints:
 * 
 *     1 <= preorder.length <= 3000
 *     inorder.length == preorder.length
 *     -3000 <= preorder[i], inorder[i] <= 3000
 *     preorder and inorder consist of unique values.
 *     Each value of inorder also appears in preorder.
 *     preorder is guaranteed to be the preorder traversal of the tree.
 *     inorder is guaranteed to be the inorder traversal of the tree.
 * 
 * @author John Dickerson - 13 May 2022
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_JD implements ConstructBinaryTreeFromPreorderAndInorderTraversalAPI {

    private int getMidIndex( int start, int[] inorder ) {

        for ( int i = 0; i < inorder.length; i++ ) {

            if ( inorder[i] == start ) {

                return i;
            }
        }

        return -1;
    }


    // start is the index 
    // end is one after the index
    private int[] getRange( int[] array, int start, int end ) {

        if ( !( end > start ) ) {

            return new int[] {};
        }

        return Arrays.copyOfRange( array, start, end );
    }


    private void debug( String message, int[] array ) {

        StringBuilder sb = new StringBuilder( message );
        sb.append( " [" );

        for ( int i : array ) {

            sb.append( i + ", " );
        }

        sb.append( "]" );
        System.out.println( sb.toString() );
    }


    @Override
    public TreeNode buildTree( int[] preorder, int[] inorder ) {

        if ( preorder.length == 0 ) {

            return null;
        }

        int start = preorder[0];
        TreeNode node = new TreeNode( start );
        int mid = getMidIndex( start, inorder );

        node.left = buildTree(
                getRange( preorder, 1, mid + 1 ),
                getRange( inorder, 0, mid ) );

        node.right = buildTree(
                getRange( preorder, mid + 1, preorder.length ),
                getRange( inorder, mid + 1, inorder.length ) );

        return node;
    }
}
