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
package com.spotadev.algo.blind75.greedy.hard.kadane.maximum_subarray;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractMaximumSubarrayTest {

    protected MaximumSubarrayAPI maximumSubarray;

    public void maxSubArrayTest_1() {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, 6 );
    }


    void maxSubArrayTest_2() {

        int[] nums = { 1 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, 1 );
    }


    void maxSubArrayTest_3() {

        int[] nums = { 5, 4, -1, 7, 8 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, 23 );
    }


    void maxSubArrayTest_4() {

        int[] nums = { -1 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, -1 );
    }
}
