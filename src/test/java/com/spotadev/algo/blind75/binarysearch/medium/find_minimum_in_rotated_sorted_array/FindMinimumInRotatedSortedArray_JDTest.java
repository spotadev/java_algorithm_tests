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
package com.spotadev.algo.blind75.binarysearch.medium.find_minimum_in_rotated_sorted_array;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 5 May 2022
 */
public class FindMinimumInRotatedSortedArray_JDTest extends
        AbstractFindMinimumInRotatedSortedArrayTest {

    @BeforeClass
    public void setup() {

        findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray_JD();
    }


    @Test
    public void findMinTest_1() {

        super.findMinTest_1();
    }


    @Test
    public void findMinTest_2() {

        super.findMinTest_2();
    }


    @Test
    public void findMinTest_3() {

        super.findMinTest_3();
    }


    @Test
    public void findMinTest_4() {

        super.findMinTest_4();
    }
}
