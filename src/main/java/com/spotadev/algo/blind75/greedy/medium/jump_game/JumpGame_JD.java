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
package com.spotadev.algo.blind75.greedy.medium.jump_game;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=Yan0cv2cLy8
 * 
 * https://leetcode.com/problems/jump-game/
 * 
 * You are given an integer array nums. You are initially positioned at the array's first index, 
 * and each element in the array represents your maximum jump length at that position.
 * 
 * Return true if you can reach the last index, or false otherwise.
 * 
 * Example 1:
 * 
 *     Input: nums = [2,3,1,1,4]
 *     Output: true
 *     
 *     Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * Example 2:
 * 
 *     Input: nums = [3,2,1,0,4]
 *     Output: false
 *     
 *     Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, 
 *     which makes it impossible to reach the last index.
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 104
 *     0 <= nums[i] <= 105
 * @author John Dickerson - 15 May 2022
 */
public class JumpGame_JD implements JumpGameAPI {

    @Override
    public boolean canJump( int[] nums ) {

        // We start at right of the array and work backwards. 
        // We create a goal index and set it at the last index of the array.
        // Then we work backwards from the goalIndex and see if we can reach the goalIndex.
        // If we can reach the goal index we shift the goalIndex back.
        int goalIndex = nums.length - 1;

        for ( int i = nums.length - 2; i >= 0; i-- ) {

            if ( i + nums[i] >= goalIndex ) {

                goalIndex = i;
            }
        }

        if ( goalIndex == 0 ) {

            return true;
        }

        return false;
    }
}
