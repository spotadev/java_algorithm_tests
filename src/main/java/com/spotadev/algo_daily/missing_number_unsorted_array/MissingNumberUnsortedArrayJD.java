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
public class MissingNumberUnsortedArrayJD implements MissingNumberUnsortedArrayAPI {

    @Override
    public int missingInUnsorted( int[] arr, int lowerBound, int upperBound ) {

        boolean[] cache = new boolean[upperBound - lowerBound];
        int indexDiff = lowerBound;

        for ( int number : arr ) {

            cache[number - indexDiff] = true;
        }

        // Even though this is strictly O(2n), Big O is such that O(2n) is considered O(n)
        for ( int i = 0; i < cache.length; i++ ) {

            if ( !cache[i] ) {

                return i + indexDiff;
            }
        }

        // this should not happen
        return -1;
    }
}
