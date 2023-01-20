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
public class MissingNumberBitwise_JD implements MissingNumberAPI {

    // The way XOR works is 
    //     (i) if you the XOR the same number together it gives you 0
    //     (ii) If you XOR zero with another number it returns the other number
    //
    // What this means is that if we have the following arrays:
    //     0, 1, 3 
    //     0, 1, 2, 3
    //
    // and we XOR all the numbers together all similar numbers will produce 0 and we XOR a number
    // which has not previously been XOR we get the number itself.  So we end up with then missing
    // number
    @Override
    public int missingNumber( int[] nums ) {

        int result = 0;

        // Here we loop through numbers 0, 1, 2, 3 and XOR them together
        //
        //   0000
        // ^ 0000    0
        //   0000
        //
        //   0000
        // ^ 0001    1
        //   0001
        //
        //   0001
        // ^ 0010    2
        //   0011
        //
        //   0011
        // ^ 0011    3
        //   0000    <== result
        //
        // Our result is 0 but if we had 1 more e.g.0, 1, 2, 3, 4 you can see it would not have 
        // been 0

        for ( int i = 0; i <= nums.length; i++ ) {

            result = result ^ i;
        }

        // We now loop through numbers 0, 1, 3 and XOR them with the result of the first array
        //
        //   0000
        // ^ 0000
        //   0000  0
        //
        //   0000
        // ^ 0001
        //   0001  1
        // 
        //   0001
        // ^ 0011
        //   0010  3   <== result
        //
        // We are left with the result 0010 which is 2 - so we identified the missing number
        for ( int i = 0; i < nums.length; i++ ) {

            result = result ^ nums[i];
        }

        return result;
    }
}
