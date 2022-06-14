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
 * @author John Dickerson - 13 May 2022
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
