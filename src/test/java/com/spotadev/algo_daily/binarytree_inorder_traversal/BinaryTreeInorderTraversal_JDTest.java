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
package com.spotadev.algo_daily.binarytree_inorder_traversal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://algodaily.com/challenges/binary-tree-inorder-traversal
 * 
 * Write a function to traverse a binary-tree in-order, and print  out the value of each node
 * as it passes?
 *
 * Example 1
 * =========
 * 
 *      4
 *      \
 *      5
 *      /
 *      6
 *  
 *      output -> [ 4, 6, 5 ]
 *  
 * Example 2
 * =========
 *                4 
 *          2          6  
 *      1      3    5     7
 *      
 *      output -> [ 1, 2, 3, 4, 5, 6, 7 ]
 *
 *
 * Constraints
 * =========== 
 *  
 *     Number of vertices in the tree <= 100000
 * 
 *     The value of vertices in the tree will be between - 10000000 and 1000000000
 * 
 * Time complexity : O(n)
 * Space complexity: O(1)
 * 
 * @author John Dickerson - 2 Jan 2023
 */
public class BinaryTreeInorderTraversal_JDTest extends AbstractBinaryTreeInorderTraversalTest {

    @BeforeClass
    public void setUp() {

        binaryTreeInorderTraversal = new BinaryTreeInorderTraversalJD();
    }


    @Test
    public void inorderTraversal_1_Test() {

        super.inorderTraversal_1_Test();
    }


    @Test
    public void inorderTraversal_2_Test() {

        super.inorderTraversal_2_Test();
    }
}
