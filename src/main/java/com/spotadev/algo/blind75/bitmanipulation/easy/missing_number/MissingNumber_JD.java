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
public class MissingNumber_JD implements MissingNumberAPI {

    @Override
    public int missingNumber( int[] nums ) {

        // 1, 2, 3, 4, 5 = 15 = ( n(n+1) ) / 2

        // we know number 1 number is missing so the array would ordinarily be 1 bigger
        int n = nums.length + 1;

        // we work out sum of the sequence using the formula.  This saves us going through
        // the loop twice
        int sum = ( n * ( n + 1 ) ) / 2;
        int maxNumber = -1;

        for ( int i = 0; i < nums.length; i++ ) {

            // The idea is the remaining sum will be the missing number
            sum = sum - nums[i];

            // we are finding out maxNumber for case Example 2 above
            if ( nums[i] > maxNumber ) {

                maxNumber = nums[i];
            }
        }

        // This logic is for Example 2 above
        if ( sum == 0 ) {

            return maxNumber + 1;
        }

        return sum;
    }
}
