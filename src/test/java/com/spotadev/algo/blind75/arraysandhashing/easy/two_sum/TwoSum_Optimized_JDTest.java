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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=KLlXCFG5TnA
 * 
 * https://leetcode.com/problems/two-sum/
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
 * @author John Dickerson - 13 Jun 2022
 */
public class TwoSum_Optimized_JDTest extends AbstractedTwoSumTest {

    @BeforeClass
    public void setUp() {

        twoSum = new TwoSum_Optimized_JD();
    }


    @Test
    public void twoSumTest_1() {

        super.twoSumTest_1();
    }


    @Test
    public void twoSumTest_2() {

        super.twoSumTest_2();
    }
}
