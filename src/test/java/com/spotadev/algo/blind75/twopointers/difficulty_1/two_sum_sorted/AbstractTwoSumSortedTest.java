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
package com.spotadev.algo.blind75.twopointers.difficulty_1.two_sum_sorted;

import org.testng.Assert;

import com.spotadev.algo.blind75.twopointers.medium.two_sum_sorted.TwoSumSortedAPI;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractTwoSumSortedTest {

    protected TwoSumSortedAPI twoSumSorted;

    public void twoSumTest_1() {

        int[] indexes = twoSumSorted.twoSum( new int[] { 2, 7, 11, 15 }, 9 );
        Assert.assertEquals( indexes, new int[] { 1, 2 } );
    }


    public void twoSumTest_2() {

        int[] indexes = twoSumSorted.twoSum( new int[] { 2, 3, 4 }, 6 );
        Assert.assertEquals( indexes, new int[] { 1, 3 } );
    }


    public void twoSumTest_3() {

        int[] indexes = twoSumSorted.twoSum( new int[] { -1, 0 }, -1 );
        Assert.assertEquals( indexes, new int[] { 1, 2 } );
    }
}
