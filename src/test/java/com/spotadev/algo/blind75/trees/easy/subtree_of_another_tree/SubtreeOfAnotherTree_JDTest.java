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
package com.spotadev.algo.blind75.trees.easy.subtree_of_another_tree;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class SubtreeOfAnotherTree_JDTest extends AbstractSubtreeOfAnotherTreeTest {

    @BeforeClass
    public void setUp() {

        subtreeOfAnotherTree = new SubtreeOfAnotherTree_JD();
    }


    @Test
    public void isSubtreeTest_1() {

        super.isSubtreeTest_1();
    }


    @Test
    public void isSubtreeTest_2() {

        super.isSubtreeTest_2();
    }
}
