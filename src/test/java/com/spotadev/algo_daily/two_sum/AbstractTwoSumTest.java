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
package com.spotadev.algo_daily.two_sum;

import java.util.Arrays;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class AbstractTwoSumTest {

    protected TwoSumAPI twoSum;

    /**
     *     [2, 3, 4, 5, 5] target = 7 --> numbers: 2 and 5, indices: 0 and 4
     */
    void twoSum_1Test() {

        int[] arr = { 2, 3, 4, 5, 5 };
        int goal = 7;
        int[] sum = twoSum.twoSum( arr, goal );
        int[] expected = { 0, 4 };
        Assert.assertTrue( Arrays.equals( sum, expected ) );
    }


    /**
     *     [1, 3, 5, 6, 2] target = 8 --> numbers: 5 and 3, indices: 1 and 2   
     **/
    void twoSum_2Test() {

        int[] arr = { 1, 3, 5, 6, 2 };
        int goal = 8;
        int[] sum = twoSum.twoSum( arr, goal );
        int[] expected = { 1, 2 };
        Assert.assertTrue( Arrays.equals( sum, expected ) );
    }


    /**
     *     [2, 3, 6, 8, 9] target = 9 --> numbers: 6 and 3, indices: 0 and 1
     **/
    void twoSum_3Test() {

        int[] arr = { 2, 3, 6, 8, 9 };
        int goal = 9;
        int[] sum = twoSum.twoSum( arr, goal );
        int[] expected = { 0, 1 };
        Assert.assertTrue( Arrays.equals( sum, expected ) );
    }


    /**
     *     [9, 2, 4, 5, 6] target = 14 --> numbers: 5 and 9, indices: 0 and 4
     **/
    void twoSum_4Test() {

        int[] arr = { 9, 2, 4, 5, 6 };
        int goal = 14;
        int[] sum = twoSum.twoSum( arr, goal );
        int[] expected = { 0, 4 };
        Assert.assertTrue( Arrays.equals( sum, expected ) );
    }
}
