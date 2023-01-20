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
package com.spotadev.algo.blind75.bitmanipulation.easy.missing_number;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=WnPLSRLSANE
 * 
 * https://leetcode.com/problems/missing-number/
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number 
 * in the range that is missing from the array.
 * 
 * Example 1:
 * 
 *     Input: nums = [3,0,1]
 *     Output: 2
 * 
 *     Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is 
 *     the missing number in the range since it does not appear in nums.
 * 
 * Example 2:
 * 
 *     Input: nums = [0,1]
 *     Output: 2
 * 
 *     Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is 
 *     the missing number in the range since it does not appear in nums.
 * 
 * Example 3:
 * 
 *     Input: nums = [9,6,4,2,3,5,7,0,1]
 *     Output: 8
 * 
 *     Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is 
 *     the missing number in the range since it does not appear in nums.
 *  
 * Constraints:
 * 
 *     n == nums.length
 *     1 <= n <= 10^4
 *     0 <= nums[i] <= n
 *     All the numbers of nums are unique.
 *  
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) 
 * runtime complexity?
 * 
 * @author John Dickerson - 19 May 2022
 */
public abstract class AbstractMissingNumberTest {

    protected MissingNumberAPI missingNumberAPI;

    void missingNumber_1Test() {

        int result = missingNumberAPI.missingNumber( new int[] { 3, 0, 1 } );
        Assert.assertEquals( result, 2 );
    }


    void missingNumber_2Test() {

        int result = missingNumberAPI.missingNumber( new int[] { 0, 1 } );
        Assert.assertEquals( result, 2 );
    }


    void missingNumber_3Test() {

        int result = missingNumberAPI.missingNumber( new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 } );
        Assert.assertEquals( result, 8 );
    }
}
