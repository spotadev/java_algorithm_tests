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
 * @author John Dickerson - 17 May 2022
 */
public interface MergeIntervalsAPI {

    int[][] merge( int[][] intervals );

}