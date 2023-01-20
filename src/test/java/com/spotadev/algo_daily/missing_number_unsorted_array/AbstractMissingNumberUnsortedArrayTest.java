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
package com.spotadev.algo_daily.missing_number_unsorted_array;

import org.testng.Assert;

/**
 * https://algodaily.com/challenges/missing-number-in-unsorted
 * 
 * Assume we're given an unsorted array of numbers such as this:
 * 
 *    [ 2, 5, 1, 4, 9, 6, 3, 7 ]
 * 
 * We are told that when this array is sorted, there is a series of n consecutive numbers. You are 
 * given a lower bound and an upper bound for this sequence.
 * 
 * There is one consecutive number missing, and we need to find it.
 * 
 * As an example, look at the below example. We're told that the lower bound is 1 and the upper 
 * bound is 9. The number that's missing in the unsorted series bounded by these two number is 8.
 * 
 *     const arr = [ 2, 5, 1, 4, 9, 6, 3, 7 ];
 *     const lowerBound = 1;
 *     const upperBound = 9;
 * 
 * missingInUnsorted(arr, lowerBound, upperBound) = 8
 * 
 * Here's the challenge-- can you find the missing number in O(n) time? Can you do it WITHOUT 
 * sorting?
 * 
 * Constraints
 *  
 *     Length of the array <= 10000
 *     
 *     The upper bound <= 10000
 *     
 *     The lower bound >= -10000
 *     
 *     Expected time complexity : O(n)
 *     
 *     Expected space complexity : O(1)
 * 
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractMissingNumberUnsortedArrayTest {

    protected MissingNumberUnsortedArrayAPI missingNumberUnsortedArray;

    void missingInUnsortedTest() {

        int[] numbers = { 2, 5, 1, 4, 9, 6, 3, 7 };
        int lowerBound = 1;
        int upperBound = 9;

        int missing =
                missingNumberUnsortedArray.missingInUnsorted( numbers, lowerBound, upperBound );

        Assert.assertEquals( missing, 8 );
    }
}
