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
package com.spotadev.algo.hard.median_2_sorted_arrays;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * See:
 * 
 *      https://leetcode.com/problems/median-of-two-sorted-arrays/
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 *
 *    Input: nums1 = [1,3], nums2 = [2]
 *    Output: 2.00000
 *    Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 *
 *     Input: nums1 = [1,2], nums2 = [3,4]
 *     Output: 2.50000
 *     Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 *
 * Constraints:
 *
 *     nums1.length == m
 *     nums2.length == n
 *     0 <= m <= 1000
 *     0 <= n <= 1000
 *     1 <= m + n <= 2000
 *     -106 <= nums1[i], nums2[i] <= 106
 * 
 * @author John Dickerson - 4 Feb 2022
 */
public class Median2SortedArrays_JDTest extends AbstractMedian2SortedArraysTest {

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArrays_JD();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        super.findMedianUsingThirdArray_evenLengthMergedTest();
    }
}
