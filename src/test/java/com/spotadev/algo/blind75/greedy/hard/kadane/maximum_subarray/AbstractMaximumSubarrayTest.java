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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=5WZl3MMT0Eg
 * 
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
 * I upgraded this from easy to hard as it depends on knowing kadane's algo.
 * 
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
