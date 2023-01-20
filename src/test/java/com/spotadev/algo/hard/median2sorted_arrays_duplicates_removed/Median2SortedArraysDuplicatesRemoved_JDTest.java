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
package com.spotadev.algo.hard.median2sorted_arrays_duplicates_removed;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * VARIANT of:
 * 
 *      https://leetcode.com/problems/median-of-two-sorted-arrays/
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * 
 * When you add the arrays together, remove duplicates.
 *
 * ( The variant is that the merged array has no duplicates )
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
public class Median2SortedArraysDuplicatesRemoved_JDTest extends
        AbstractMedian2SortedArraysDuplicatesRemovedTest {

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArraysDuplicatesRemoved_JD();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        super.findMedianUsingThirdArray_evenLengthMergedTest();
    }


    @Test
    public void findMedianUsingThirdArray_oddLengthMergedTest() {

        super.findMedianUsingTreeSet_oddLengthMergedTest();
    }


    @Test
    public void findMedianUsingTreeSet_evenLengthMergedTest() {

        super.findMedianUsingTreeSet_evenLengthMergedTest();
    }


    @Test
    public void findMedianUsingTreeSet_oddLengthMergedTest() {

        super.findMedianUsingTreeSet_oddLengthMergedTest();
    }


    @Test
    public void findMedianUsingThirdArray_test_O_Notation() {

        super.findMedianUsingThirdArray_test_O_Notation();
    }


    @Test
    public void findMedianUsingTreeSet_test_O_Notation() {

        super.findMedianUsingTreeSet_test_O_Notation();
    }
}
