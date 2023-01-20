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
package com.spotadev.algo.blind75.arraysandhashing.medium.top_k_frequent_elements;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=YPTqKIgVk-k
 * 
 * https://leetcode.com/problems/top-k-frequent-elements
 * 
 *     Your runtime beats 36.05 % of java submissions
 *     Your memory usage beats 49.81 % of java submissions.
 * 
 * Given an integer array nums and an integer k, return the k most frequent elements. 
 * You may return the answer in any order.
 * 
 *    Your runtime beats 36.05 % of java submissions.
 *    Your memory usage beats 49.81 % of java submissions.
 * 
 * Example 1:
 * 
 *     Input: nums = [1,1,1,2,2,3], k = 2
 *     Output: [1,2]
 * 
 * Example 2:
 * 
 *     Input: nums = [1], k = 1
 *     Output: [1]
 * 
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 10^5
 *     k is in the range [1, the number of unique elements in the array].
 *     It is guaranteed that the answer is unique.
 * 
 * 
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the 
 * array's size.
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class TopKFrequentElements_JDTest extends AbstractTopKFrequentElementsTest {

    @BeforeClass
    public void setUp() {

        topKFrequentElements = new TopKFrequentElements_JD();
    }


    @Test
    public void topKFrequentTest_1() {

        super.topKFrequentTest_1();
    }


    @Test
    public void topKFrequentTest_2() {

        super.topKFrequentTest_2();
    }
}
