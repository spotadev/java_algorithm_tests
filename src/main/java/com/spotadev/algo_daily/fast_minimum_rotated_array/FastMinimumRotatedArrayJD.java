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
public class FastMinimumRotatedArrayJD implements FastMinimumRotatedArrayAPI {

    private int getMinimum( int[] nums, int leftIndex, int rightIndex ) {

        if ( nums[rightIndex] > nums[leftIndex] ) {

            return nums[leftIndex];
        }

        if ( nums.length == 1 ) {

            return nums[0];
        }

        int midIndex = leftIndex + ( rightIndex - leftIndex ) / 2;
        int midIndexMinusOne = midIndex - 1;

        // 8, [1], 2  
        if ( midIndexMinusOne > 0 && nums[midIndex] < nums[midIndexMinusOne] ) {

            return nums[midIndex];
        }

        // 1, [2], 3
        if ( midIndexMinusOne > 0 && nums[midIndex] > nums[midIndexMinusOne] ) {

            return getMinimum( nums, 0, midIndexMinusOne );
        }

        // 7. [8] 1
        int midIndexPlusOne = midIndex + 1;

        return getMinimum( nums, midIndexPlusOne, rightIndex );
    }


    @Override
    public int getMinimum( int[] nums ) {

        return getMinimum( nums, 0, nums.length - 1 );
    }
}
