/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_3.median2sortedarrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

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
public class Median2SortedArrays {

    public double findMedianUsingThirdArray( int[] nums1, int[] nums2 ) {

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int mergedLength = nums1Length + nums2Length;
        int[] merged = new int[mergedLength];
        int i = 0, j = 0, k = 0;

        while ( i < nums1Length && j < nums2Length ) {

            if ( nums1[i] < nums2[j] ) {

                merged[k++] = nums1[i++];
            }
            else {

                merged[k++] = nums2[j++];
            }
        }

        // Store remaining elements of first array
        while ( i < nums1Length ) {

            merged[k++] = nums1[i++];
        }

        // Store remaining elements of second array
        while ( j < nums2Length ) {

            merged[k++] = nums2[j++];

        }

        // work out median
        int lengthInt = k / 2;
        double lengthDouble = k / 2.0;
        double median;

        if ( lengthDouble == lengthInt ) {

            double firstValue = merged[lengthInt - 1];
            double secondValue = merged[lengthInt];
            median = ( firstValue + secondValue ) / 2;
        }
        else {

            median = merged[lengthInt];
        }

        return median;
    }


    public double findMedianUsingTreeSet( int[] nums1, int[] nums2 ) {

        Integer[] integers = new Integer[nums1.length + nums2.length];
        int i = 0;

        for ( int num : nums1 ) {

            integers[i++] = num;
        }

        for ( int num : nums2 ) {

            integers[i++] = num;
        }

        SortedSet<Integer> mergedSet = new TreeSet<>( Arrays.asList( integers ) );

        Integer[] merged = mergedSet.toArray( new Integer[mergedSet.size()] );

        int sizeMerged = merged.length;
        double median;

        if ( sizeMerged % 2 == 0 ) {

            double firstNumber = merged[( sizeMerged / 2 ) - 1];
            double secondNumber = merged[sizeMerged / 2];
            median = ( firstNumber + secondNumber ) / 2;
        }
        else {

            median = merged[sizeMerged / 2];
        }

        return median;
    }
}