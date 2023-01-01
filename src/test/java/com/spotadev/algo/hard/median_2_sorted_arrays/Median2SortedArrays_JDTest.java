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
package com.spotadev.algo.hard.median_2_sorted_arrays;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author johndickerson - 30 Dec 2022
 */
public class Median2SortedArrays_JDTest extends AbstractMedian2SortedArraysTest {

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArrays_JD();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        super.findMedianUsingThirdArray_evenLengthMergedTest();
    }
}
