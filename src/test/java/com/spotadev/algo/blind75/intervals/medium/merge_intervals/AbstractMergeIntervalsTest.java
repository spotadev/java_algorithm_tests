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
package com.spotadev.algo.blind75.intervals.medium.merge_intervals;

import java.util.Arrays;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=44H3cEC2fFM
 * 
 * https://leetcode.com/problems/merge-intervals/
 * 
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * 
 * Example 1:
 * 
 *     Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 *     Output: [[1,6],[8,10],[15,18]]
 *     Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * 
 * Example 2:
 * 
 *     Input: intervals = [[1,4],[4,5]]
 *     Output: [[1,5]]
 *     Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * Constraints:
 * 
 *     1 <= intervals.length <= 104
 *     intervals[i].length == 2
 *     0 <= starti <= endi <= 104
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractMergeIntervalsTest {

    protected MergeIntervalsAPI mergeIntervals;

    void merge_1Test() {

        int[][] intervals = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] result = mergeIntervals.merge( intervals );

        Assert.assertTrue( result.length == 3 );
        Assert.assertTrue( Arrays.equals( result[0], new int[] { 1, 6 } ) );
        Assert.assertTrue( Arrays.equals( result[1], new int[] { 8, 10 } ) );
        Assert.assertTrue( Arrays.equals( result[2], new int[] { 15, 18 } ) );
    }


    void merge_2Test() {

        int[][] intervals = new int[][] { { 1, 4 }, { 4, 5 } };
        int[][] result = mergeIntervals.merge( intervals );

        Assert.assertTrue( result.length == 1 );
        Assert.assertTrue( Arrays.equals( result[0], new int[] { 1, 5 } ) );
    }
}
