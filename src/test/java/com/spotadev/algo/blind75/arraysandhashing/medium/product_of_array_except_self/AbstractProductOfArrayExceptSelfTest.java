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
package com.spotadev.algo.blind75.arraysandhashing.medium.product_of_array_except_self;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=bNvIQI2wAjk
 * 
 * https://leetcode.com/problems/product-of-array-except-self
 * 
 *     Your runtime beats 77.22 % of java submissions.
 *     Your memory usage beats 74.86 % of java submissions.
 * 
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product 
 * of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * Example 1:
 * 
 *     Input: nums = [1,2,3,4]
 *     Output: [24,12,8,6]
 * 
 * Example 2:
 * 
 *     Input: nums = [-1,1,0,-3,3]
 *     Output: [0,0,9,0,0]
 *  
 * Constraints:
 * 
 *    2 <= nums.length <= 10^5
 *    -30 <= nums[i] <= 30
 *    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * @author John Dickerson - 1 May 2022
 */
public class AbstractProductOfArrayExceptSelfTest {

    protected ProductOfArrayExceptSelfAPI productOfArrayExceptSelf;

    void productExceptSelfTest_1() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { 1, 2, 3, 4 } );
        Assert.assertEquals( result, new int[] { 24, 12, 8, 6 } );
    }


    void productExceptSelfTest_2() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { -1, 1, 0, -3, 3 } );
        Assert.assertEquals( result, new int[] { 0, 0, 9, 0, 0 } );
    }


    void productExceptSelfTest_3() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { 1, 1, 0, -3, 3 } );
        Assert.assertEquals( result, new int[] { 0, 0, -9, 0, 0 } );
    }


    void productExceptSelfTest_4() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { 9, 0, -2 } );
        Assert.assertEquals( result, new int[] { 0, -18, 0 } );
    }
}
