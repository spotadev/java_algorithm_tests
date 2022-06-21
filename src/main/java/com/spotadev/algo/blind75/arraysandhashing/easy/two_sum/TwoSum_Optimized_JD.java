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
package com.spotadev.algo.blind75.arraysandhashing.easy.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=KLlXCFG5TnA
 * 
 * https://leetcode.com/problems/two-sum/
 * 
 *     Runtime: 3 ms, faster than 89.16% of Java online submissions for Two Sum.
 *     Memory Usage: 45.8 MB, less than 33.51% of Java online submissions for Two Sum.
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such 
 * that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same 
 * element twice.
 *
 * You can return the answer in any order.
 * 
 * Example 1:
 *
 *    Input: nums = [2,7,11,15], target = 9
 *    Output: [0,1]
 *    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 *
 *    Input: nums = [3,2,4], target = 6
 *    Output: [1,2]
 *
 * Example 3:
 *
 *    Input: nums = [3,3], target = 6
 *    Output: [0,1]
 *    
 * Constraints:
 * 
 *    2 <= nums.length <= 10^4
 *    -109 <= nums[i] <= 10^9
 *    -109 <= target <= 10^9
 *
 * Only one valid answer exists.
 *  
 * 
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 * 
 * @author John Dickerson - 16 Apr 2022
 */
public class TwoSum_Optimized_JD implements TwoSumAPI {

    /**
     * Time:  
     * 
     *      O(n)
     *      
     *      Here we have only one for loop, so it is linear.
     *      
     * Space: 
     * 
     *      O(n)
     *      
     *      We have input array, a map and and output array:  O(3n) ==> O(n)
     *      
     *      Space requirements are proportional to n (linear).
     */
    @Override
    public int[] twoSum( int[] nums, int target ) {

        Map<Integer, Integer> indexByValue = new HashMap<>();

        for ( int i = 0; i < nums.length; i++ ) {

            int number1 = nums[i];
            Integer index2 = indexByValue.get( target - number1 );

            if ( index2 != null ) {

                return new int[] { i, index2 };
            }

            indexByValue.put( number1, i );
        }

        // should never happen
        return new int[] {};
    }
}
