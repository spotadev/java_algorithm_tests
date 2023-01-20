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
 * https://algodaily.com/challenges/two-sum
 * 
 * Given an array of integers, return the indices of the two numbers that add up to a specific 
 * given target number.
 * 
 * Given an array e.g. [ 1, 9, 13, 20, 47] and a target number say 10. Two numbers that add up to 
 * ten in the array and their indices respectively are [0 and 1]
 * 
 * You may assume that each input would have exactly one solution. Additionally, you may not use 
 * the same element twice towards the sum. 
 *
 * Examples
 * ========
 * 
 *     1, 9, 13, 20, 47 add up to 10 => indexes: 0 and 1
 *     [3, 2, 4, 1, 9  add up to 12  => indexes: 1 and 4
 *
 * Constraints
 * ===========
 * 
 *     Length of the array <= 1000000
 * 
 *     Values of the array between -1000000000 and 10000000000
 * 
 *     The array can be empty
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(n)
 *     
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
