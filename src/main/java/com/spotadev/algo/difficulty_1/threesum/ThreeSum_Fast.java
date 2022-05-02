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
package com.spotadev.algo.difficulty_1.threesum;

import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such 
 * that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * Example 1:
 * 
 *     Input: nums = [-1,0,1,2,-1,-4]
 *     Output: [[-1,-1,2],[-1,0,1]]
 * 
 * Example 2:
 * 
 *     Input: nums = []
 *     Output: []
 * 
 * Example 3:
 * 
 *     Input: nums = [0]
 *     Output: []
 * 
 * Constraints:
 * 
 *     0 <= nums.length <= 3000
 *     -10^5 <= nums[i] <= 10^5
 * 
 * JD Note: 
 * 
 *     Note in order to not use O(n^3) solution which will cause timeout in the tests with
 *     big data, you need an optimised solution of O(n log n + n^2) which can be achieved by 
 *     combining logic from:
 * 
 *      com.spotadev.algo.difficulty_1.twosumsorted.TwoSumSorted
 *      https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * 
 * @author John Dickerson - 2 May 2022
 */
public class ThreeSum_Fast {

    // @todo
    public List<List<Integer>> threeSum( int[] nums ) {

        return null;
    }
}
