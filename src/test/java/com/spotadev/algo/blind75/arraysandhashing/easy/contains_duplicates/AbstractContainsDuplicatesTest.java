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
package com.spotadev.algo.blind75.arraysandhashing.easy.contains_duplicates;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=3OamzN90kPg
 * 
 * https://leetcode.com/problems/contains-duplicate/
 * 
 *     Runtime: 6 ms, faster than 94.83% of Java online submissions for Contains Duplicate.
 *     
 *     Memory Usage: 54.7 MB, less than 88.35% of Java online submissions for Contains Duplicate.
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * 
 * Example 1:
 * 
 *     Input: nums = [1,2,3,1]
 *     Output: true
 * 
 * Example 2:
 * 
 *     Input: nums = [1,2,3,4]
 *     Output: false
 * 
 * Example 3:
 * 
 *     Input: nums = [1,1,1,3,3,4,3,2,4,2]
 *     Output: true
 * 
 * 
 * Constraints:
 * 
 *    1 <= nums.length <= 10^5
 *    -109 <= nums[i] <= 10^9
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractContainsDuplicatesTest {

    protected ContainsDuplicatesAPI containsDuplicates;

    void containsDuplicateTest_1() {

        boolean hasDuplicates =
                containsDuplicates.containsDuplicate( new int[] { 1, 2, 3, 1 } );

        Assert.assertTrue( hasDuplicates );
    }


    void containsDuplicateTest_2() {

        boolean hasDuplicates =
                containsDuplicates.containsDuplicate( new int[] { 1, 2, 3, 4 } );

        Assert.assertFalse( hasDuplicates );
    }


    void containsDuplicateTest_3() {

        boolean hasDuplicates =
                containsDuplicates.containsDuplicate( new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 } );

        Assert.assertTrue( hasDuplicates );
    }
}
