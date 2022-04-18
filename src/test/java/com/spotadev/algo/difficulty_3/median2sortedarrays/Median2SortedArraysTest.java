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
package com.spotadev.algo.difficulty_3.median2sortedarrays;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 5 Feb 2022
 */
public class Median2SortedArraysTest {

    private Median2SortedArrays median2SortedArrays;

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArrays();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        int[] num1 = { 2, 2, 4, 4 };
        int[] num2 = { 2, 2, 4, 4 };
        // int[] merged = { 2, 2, 2, 2, 4, 4, 4, 4 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 3.0 );
    }
}
