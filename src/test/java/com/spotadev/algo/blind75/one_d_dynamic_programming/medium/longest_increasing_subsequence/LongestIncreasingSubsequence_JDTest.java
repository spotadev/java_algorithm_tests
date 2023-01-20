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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.longest_increasing_subsequence;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=cjWnW0hdF1Y
 * 
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * 
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * 
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements 
 * without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of 
 * the array [0,3,1,6,2,2,7].
 * 
 * Example 1:
 * 
 *     Input: nums = [10,9,2,5,3,7,101,18]
 *     Output: 4
 *     Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * 
 * Example 2:
 * 
 *     Input: nums = [0,1,0,3,2,3]
 *     Output: 4
 * 
 * Example 3:
 * 
 *     Input: nums = [7,7,7,7,7,7,7]
 *     Output: 1
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 2500
 *     -10^4 <= nums[i] <= 10^4
 *  
 * Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class LongestIncreasingSubsequence_JDTest extends AbstractLongestIncreasingSubsequenceTest {

    @BeforeClass
    public void setUp() {

        longestIncreasingSubsequence = new LongestIncreasingSubsequence_JD();
    }


    @Test
    public void lengthOfLISTest() {

        super.lengthOfLISTest();
    }
}
