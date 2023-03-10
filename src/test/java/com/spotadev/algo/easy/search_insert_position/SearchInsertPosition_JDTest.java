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
package com.spotadev.algo.easy.search_insert_position;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://leetcode.com/problems/search-insert-position/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
 *     Memory Usage: 41.6 MB, less than 93.07% of Java online submissions for Search Insert Position.
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is 
 * found. If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Example 2:
 * 
 *     Input: nums = [1,3,5,6], target = 2
 *     Output: 1
 * 
 * Example 3:
 * 
 *     Input: nums = [1,3,5,6], target = 7
 *     Output: 4
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 104
 *     -104 <= nums[i] <= 104
 *     nums contains distinct values sorted in ascending order.
 *     -104 <= target <= 104
 * 
 * @author John Dickerson - 18 Apr 2022
 */
public class SearchInsertPosition_JDTest extends AbstractSearchInsertPositionTest {

    @BeforeClass
    public void setUp() {

        searchInsertPosition = new SearchInsertPosition_JD();
    }


    @Test
    public void searchInsertTest_1() {

        super.searchInsertTest_1();
    }


    @Test
    public void searchInsertTest_2() {

        super.searchInsertTest_2();
    }


    @Test
    public void searchInsertTest_3() {

        super.searchInsertTest_3();
    }
}
