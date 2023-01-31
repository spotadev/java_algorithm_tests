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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
public class MergeIntervals_JD implements MergeIntervalsAPI {

    private Interval mergePrevious( Interval previous, Interval current ) {

        int minStart = Math.min( previous.start, current.start );
        int maxEnd = Math.max( previous.end, current.end );
        return new Interval( minStart, maxEnd );
    }


    private List<Interval> getIntervalList( int[][] intervals ) {

        List<Interval> intervalsToReturn = new ArrayList<>();

        for ( int[] interval : intervals ) {

            intervalsToReturn.add( new Interval( interval[0], interval[1] ) );
        }

        return intervalsToReturn;
    }


    private void sort( List<Interval> intervals ) {

        Collections.sort( intervals,
                new Comparator<Interval>() {

                    @Override
                    public int compare( Interval o1, Interval o2 ) {

                        if ( o1.start > o2.start ) {

                            return 1;
                        }
                        else if ( o1.start < o2.start ) {

                            return -1;
                        }

                        return 0;
                    }
                } );
    }


    private int[][] getMergedArray( List<Interval> intervalsToReturn ) {

        int[][] merged = new int[intervalsToReturn.size()][];
        int i = 0;

        for ( Interval interval : intervalsToReturn ) {

            merged[i] = new int[] { interval.start, interval.end };
            i++;
        }

        return merged;
    }


    @Override
    public int[][] merge( int[][] intervals ) {

        List<Interval> intervalList = getIntervalList( intervals );
        List<Interval> intervalsToReturn = new ArrayList<>();
        sort( intervalList );

        Interval previous = new Interval( intervals[0][0], intervals[0][1] );

        for ( int i = 1; i < intervalList.size(); i++ ) {

            Interval current = intervalList.get( i );

            if ( current.start > previous.end ) {
                intervalsToReturn.add( previous );
                previous = current;
            }
            else {
                previous = mergePrevious( previous, current );
            }
        }

        intervalsToReturn.add( previous );
        int[][] mergedArray = getMergedArray( intervalsToReturn );
        return mergedArray;
    }
}
