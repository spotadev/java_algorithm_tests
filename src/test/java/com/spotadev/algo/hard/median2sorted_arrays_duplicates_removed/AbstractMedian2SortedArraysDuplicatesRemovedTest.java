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

import org.testng.Assert;

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
public class AbstractMedian2SortedArraysDuplicatesRemovedTest {

    protected Median2SortedArraysDuplicatesRemovedAPI median2SortedArrays;

    void findMedianUsingThirdArray_evenLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 4.5 );
    }


    void findMedianUsingThirdArray_oddLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6, 9 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 5.0 );
    }


    void findMedianUsingTreeSet_evenLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8 };

        double median = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        Assert.assertEquals( median, 4.5 );
    }


    void findMedianUsingTreeSet_oddLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6, 9 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        double median = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        Assert.assertEquals( median, 5.0 );
    }


    void findMedianUsingThirdArray_test_O_Notation() {

        int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num4 = { 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };

        for ( int i = 0; i < 10; i++ ) {

            // for warm up
            long nanoStartWarm = System.nanoTime();
            double warmMedium = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
            long nanoEndWarm = System.nanoTime();
            long nanoTest_Warm = nanoEndWarm - nanoStartWarm;
            System.out.println( "WARM: " + i + " " + nanoTest_Warm );
        }

        long nanoStartTest1 = System.nanoTime();
        double mediumTest1 = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        long nanoEndTest1 = System.nanoTime();
        long nanoTest1_Time = nanoEndTest1 - nanoStartTest1;
        System.out.println( nanoTest1_Time );

        long nanoStartTest2 = System.nanoTime();
        double mediumTest2 = median2SortedArrays.findMedianUsingThirdArray( num3, num4 );
        long nanoEndTest2 = System.nanoTime();
        long nanoTest2_Time = nanoEndTest2 - nanoStartTest2;
        System.out.println( nanoTest2_Time );

        Assert.assertEquals( mediumTest1, 8.5 );
        Assert.assertEquals( mediumTest2, 16.5 );
    }


    void findMedianUsingTreeSet_test_O_Notation() {

        int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num4 = { 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };

        for ( int i = 0; i < 10; i++ ) {

            // for warm up
            long nanoStartWarm = System.nanoTime();
            double warmMedium = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
            long nanoEndWarm = System.nanoTime();
            long nanoTest_Warm = nanoEndWarm - nanoStartWarm;
            System.out.println( "WARM: " + i + " " + nanoTest_Warm );
        }

        long nanoStartTest1 = System.nanoTime();
        double mediumTest1 = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        long nanoEndTest1 = System.nanoTime();
        long nanoTest1_Time = nanoEndTest1 - nanoStartTest1;
        System.out.println( nanoTest1_Time );

        long nanoStartTest2 = System.nanoTime();
        double mediumTest2 = median2SortedArrays.findMedianUsingTreeSet( num3, num4 );
        long nanoEndTest2 = System.nanoTime();
        long nanoTest2_Time = nanoEndTest2 - nanoStartTest2;
        System.out.println( nanoTest2_Time );

        Assert.assertEquals( mediumTest1, 8.5 );
        Assert.assertEquals( mediumTest2, 16.5 );
    }
}
