/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.blind75.greedy.hard.kadane.maximum_subarray;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class MaximumSubarray_JDTest extends AbstractMaximumSubarrayTest {

    @BeforeClass
    public void setUp() {

        maximumSubarray = new MaximumSubarray_JD();
    }


    @Test
    public void maxSubArrayTest_1() {

        super.maxSubArrayTest_1();
    }


    @Test
    public void maxSubArrayTest_2() {

        super.maxSubArrayTest_2();
    }


    @Test
    public void maxSubArrayTest_3() {

        super.maxSubArrayTest_3();
    }


    @Test
    public void maxSubArrayTest_4() {

        super.maxSubArrayTest_4();
    }
}
