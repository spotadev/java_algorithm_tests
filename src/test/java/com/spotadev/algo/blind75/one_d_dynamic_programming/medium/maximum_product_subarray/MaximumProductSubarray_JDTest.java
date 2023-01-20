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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.maximum_product_subarray;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=lXVy6YWFcRM
 * 
 * https://leetcode.com/problems/maximum-product-subarray/
 * 
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has 
 * the largest product, and return the product.
 * 
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * Example 1:
 * 
 *     Input: nums = [2,3,-2,4]
 *     Output: 6
 *     Explanation: [2,3] has the largest product 6.
 * 
 * Example 2:
 * 
 *     Input: nums = [-2,0,-1]
 *     Output: 0
 *     Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 2 * 10^4
 *     -10 <= nums[i] <= 10
 *     The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public class MaximumProductSubarray_JDTest extends AbstractMaximumProductSubarrayTest {

    @BeforeClass
    public void setUp() {

        maximumProductSubarray = new MaximumProductSubarray_JD();
    }


    @Test
    public void maxProductTest() {

        super.maxProductTest();
    }
}
