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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=hTM3phVI6YQ&lc=UgxUajmaDDsmZ5Tp0U54AaABAg
 * 
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary 
 *     Tree.
 * 
 *     Memory Usage: 42.7 MB, less than 66.76% of Java online submissions for Maximum Depth of 
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
 *                  1
 *                       2
 * 
 *     Input: root = [1,null,2]
 *     Output: 2
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [0, 104].
 *     -100 <= Node.val <= 100
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public class MaximumDepthOfBinaryTree_RecursiveUsingMax_JDTest extends
        AbstractMaximumDepthOfBinaryTreeTest {

    @BeforeClass
    public void setUp() {

        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree_RecursiveUsingMax_JD();
    }


    @Test
    public void maxDepthTest_1() {

        super.maxDepthTest_1();
    }


    @Test
    public void maxDepthTest_2() {

        super.maxDepthTest_2();
    }
}
