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
package com.spotadev.algo_daily.fast_minimum_rotated_array;

import org.testng.Assert;

/** 
 * https://algodaily.com/challenges/fast-minimum-in-rotated-array
 * 
 * Given an array of integers , e.g. [0, 1, 2, 3, 4, 5, 6, 7, 8]
 * 
 * Imagine this is an assembly line, the decision is made to shift some workers around.
 * 
 * This is achieved by rotating the array at a random pivot so that the section after the pivot
 * comes before.
 * 
 * Example
 * =======
 * 
 *     Given an array of integers , e.g. [0, 1, 2, 3, 4, 5, 6, 7, 8]
 * 
 *     A pivot between 5 and 6 would give:
 * 
 *          [6, 7, 8, 0, 1, 2, 3, 4, 5]
 * 
 * Find the smallest element in O(n log n), assuming there are no repeating numbers
 *
 *
 * CONSTRAINTS:
 * ============
 * 
 *     Length of array <= 100000
 * 
 *     Values of the array will be between -1000000000 and 1000000000
 * 
 *     Time Complexity: O (log n)
 * 
 *     Space Complexity: O (1)
 *
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractFastMinimumRotatedArrayTest {

    protected FastMinimumRotatedArrayAPI fastMinimumRotatedArrayAPI;

    void getMinimum_1Test() {

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int minimum = fastMinimumRotatedArrayAPI.getMinimum( numbers );
        Assert.assertEquals( minimum, 0 );
    }


    void getMinimum_2Test() {

        int[] numbers = { 4, 5, 1, 2, 3 };
        int minimum = fastMinimumRotatedArrayAPI.getMinimum( numbers );
        Assert.assertEquals( minimum, 1 );
    }


    void getMinimum_3Test() {

        int[] numbers = { 5, 6, 7, 0, 1, 2, 3 };
        int minimum = fastMinimumRotatedArrayAPI.getMinimum( numbers );
        Assert.assertEquals( minimum, 0 );
    }
}
