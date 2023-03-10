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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=5LUXSvjmGCw
 * 
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * 
 *     Runtime: 1 ms, faster than 60.70% of Java online submissions for Kth Smallest Element in a 
 *     BST.
 *     
 *     Memory Usage: 45.7 MB, less than 19.12% of Java online submissions for Kth Smallest Element 
 *     in a BST.
 * 
 * Given the root of a binary search tree, and an integer k, return the kth smallest value 
 * (1-indexed) of all the values of the nodes in the tree.
 * 
 * Example 1:
 * 
 *               3
 *            1     4
 *               2    
 * 
 *     Input: root = [3,1,4,null,2], k = 1
 *     Output: 1
 * 
 * Example 2:
 * 
 *                 5
 *            3         6
 *         2       4
 *     1             
 * 
 *     Input: root = [5,3,6,2,4,null,null,1], k = 3
 *     Output: 3
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is n.
 *     1 <= k <= n <= 10^4
 *     0 <= Node.val <= 10^4
 * 
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and 
 * you need to find the kth smallest frequently, how would you optimize?
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public class ValidateBinarySearchTree_JDTest extends AbstractValidateBinarySearchTreeTest {

    @BeforeClass
    public void setUp() {

        validateBinarySearchTree = new ValidateBinarySearchTree_JD();
    }


    @Test
    public void isValidBSTTest_1() {

        super.isValidBSTTest_1();
    }


    @Test
    public void isValidBSTTest_2() {

        super.isValidBSTTest_2();
    }


    @Test
    public void isValidBSTTest_3() {

        super.isValidBSTTest_3();
    }
}
