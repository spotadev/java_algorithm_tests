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
 * @author John Dickerson - 13 May 2022
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
