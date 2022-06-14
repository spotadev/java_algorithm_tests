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
package com.spotadev.algo.blind75.trees.medium.binary_tree_level_order_traversal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 
 * @author John Dickerson - 13 May 2022
 */
public class BinaryTreeLevelOrderTraversal_JDTest extends
        AbstractBinaryTreeLevelOrderTraversalTest {

    @BeforeClass
    public void setUp() {

        binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal_JD();
    }


    @Test
    public void levelOrderTest_1() {

        super.levelOrderTest_1();
    }


    @Test
    public void levelOrderTest_2() {

        super.levelOrderTest_2();
    }
}
