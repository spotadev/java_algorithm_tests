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
package com.spotadev.algo.blind75.intervals.medium.non_overlapping_intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=nONCGxWoUfM
 * 
 * https://leetcode.com/problems/non-overlapping-intervals/
 * 
 * Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum 
 * number of intervals you need to remove to make the rest of the intervals non-overlapping.
 * 
 * Example 1:
 * 
 *     Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
 *     Output: 1
 *     Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
 * 
 * Example 2:
 * 
 *     Input: intervals = [[1,2],[1,2],[1,2]]
 *     Output: 2
 *     Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
 * 
 * Example 3:
 * 
 *     Input: intervals = [[1,2],[2,3]]
 *     Output: 0
 *     Explanation: You don't need to remove any of the intervals since they're already 
 *     non-overlapping.
 * 
 * Constraints:
 * 
 *     1 <= intervals.length <= 10^5
 *     intervals[i].length == 2
 *     -5 * 104 <= starti < endi <= 5 * 10^4
 * 
 * @author John Dickerson - 17 May 2022
 */
public class NonOverlappingIntervals_JD implements NonOverlappingIntervalsAPI {

    @Override
    public int eraseOverlapIntervals( int[][] intervals ) {

        Arrays.sort( intervals, Comparator.comparingInt( a -> a[0] ) );

        int[] previous = intervals[0];
        int count = 0;

        for ( int i = 1; i < intervals.length; i++ ) {

            if ( intervals[i][0] < previous[1] ) {

                // keep one that has the least end

                if ( intervals[i][1] < previous[1] ) {

                    previous = intervals[i];
                }

                count++;
            }
        }

        return count;
    }
}
