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
package com.spotadev.algo.medium.search.binary;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author johndickerson - 30 Dec 2022
 */
public class BinarySearch_JDTest extends AbstractBinarySearchTest {

    @BeforeClass
    public void setUp() {

        binarySearch = new BinarySearch_JD();
    }


    @Test
    public void binarySearchTest() {

        super.binarySearchTest();
    }
}