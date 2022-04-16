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
package com.spotadev.algo.difficulty_0.twosum;

/**
 * https://leetcode.com/problems/two-sum/submissions/
 * 
 *     Runtime: 84 ms, faster than 21.12% of Java online submissions for Two Sum.
 *     Memory Usage: 42.2 MB, less than 93.00% of Java online submissions for Two Sum.
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
public class TwoSum {

    public int[] twoSum( int[] nums, int target ) {

        for ( int i = 0; i < nums.length; i++ ) {

            for ( int j = i + 1; j <= nums.length - 1; j++ ) {

                if ( nums[i] + nums[j] == target ) {

                    return new int[] { i, j };
                }
            }
        }

        return null;
    }
}
