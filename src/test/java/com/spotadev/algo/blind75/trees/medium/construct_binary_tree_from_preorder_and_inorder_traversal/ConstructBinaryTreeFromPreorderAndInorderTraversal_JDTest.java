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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
 * @author John Dickerson - 14 Jun 2022
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_JDTest extends
        AbstractConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @BeforeClass
    public void setUp() {

        constructBinaryTreeFromPreorderAndInorderTraversal =
                new ConstructBinaryTreeFromPreorderAndInorderTraversal_JD();
    }


    /**
     *             3
     *          9     20
     *              15    7  
     */
    @Test
    public void buildTreeTest() {

        super.buildTreeTest();
    }
}
