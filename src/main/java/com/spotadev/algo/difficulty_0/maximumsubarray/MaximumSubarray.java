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
package com.spotadev.algo.difficulty_0.maximumsubarray;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * 
 *     Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
 *     Memory Usage: 51.7 MB, less than 87.00% of Java online submissions for Maximum Subarray.
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * Example 1:
 * 
 *     Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 *     Output: 6
 * 
 *     Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * Example 2:
 * 
 *     Input: nums = [1]
 *     Output: 1
 * 
 * Example 3:
 * 
 *     Input: nums = [5,4,-1,7,8]
 *     Output: 23
 * 
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 10^5
 *     -104 <= nums[i] <= 10^4
 * 
 * 
 * @author John Dickerson - 18 Apr 2022
 */
public class MaximumSubarray {

    // See https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d
    public int maxSubArray( int[] nums ) {

        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for ( int i = 0; i < nums.length; i++ ) {

            localMax = Math.max( nums[i], nums[i] + localMax );

            if ( localMax > globalMax ) {

                globalMax = localMax;
            }
        }

        return globalMax;
    }
}
