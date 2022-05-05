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
package com.spotadev.algo.blind75.arraysandhashing.difficulty_1.productofarrayexceptself;

/**
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
 *     Runtime: 2 ms, faster than 77.22% of Java online submissions for Product of Array Except Self.
 *     
 *     Memory Usage: 51.1 MB, less than 74.86% of Java online submissions for Product of Array 
 *     Except Self.
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
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf( int[] nums ) {

        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];

        int product = 1;
        int countZero = 0;

        for ( int i = 0; i < nums.length; i++ ) {

            leftArray[i] = product * nums[i];
            product = leftArray[i];

            if ( nums[i] == 0 ) {

                countZero++;
            }
        }

        if ( countZero > 1 ) {

            return new int[nums.length];
        }

        product = 1;

        for ( int j = nums.length - 1; j >= 0; j-- ) {

            rightArray[j] = product * nums[j];
            product = rightArray[j];
        }

        int[] arrayToReturn = new int[nums.length];

        for ( int i = 0; i < nums.length; i++ ) {

            int rightSum = 1;
            int leftSum = 1;

            if ( ( i + 1 ) < nums.length ) {

                rightSum = rightArray[i + 1];
            }

            if ( ( i - 1 ) >= 0 ) {

                leftSum = leftArray[i - 1];
            }

            arrayToReturn[i] = rightSum * leftSum;
        }

        return arrayToReturn;
    }
}