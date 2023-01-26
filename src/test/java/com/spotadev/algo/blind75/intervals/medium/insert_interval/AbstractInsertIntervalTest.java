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
package com.spotadev.algo.blind75.intervals.medium.insert_interval;

import java.util.Arrays;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=A8NUOmlwOlM&feature=youtu.be
 * 
 * https://leetcode.com/problems/insert-interval/
 * 
 * You are given an array of non-overlapping intervals intervals where 
 * 
 *     intervals[i] = [starti, endi] 
 *     
 * represent the start and the end of the ith interval and intervals is sorted in ascending 
 * order by starti. You are also given an interval newInterval = [start, end] that represents 
 * the start and end of another interval.
 * 
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by 
 * starti and intervals still does not have any overlapping intervals (merge overlapping intervals 
 * if necessary).
 * 
 * Return intervals after the insertion.
 * 
 * Example 1:
 * 
 *     Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 *     Output: [[1,5],[6,9]]
 * 
 * Example 2:
 * 
 *     Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 *     Output: [[1,2],[3,10],[12,16]]
 *     Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 * 
 * Constraints:
 * 
 *     0 <= intervals.length <= 10^4
 *     intervals[i].length == 2
 *     0 <= starti <= endi <= 10^5
 *     intervals is sorted by starti in ascending order.
 *     newInterval.length == 2
 *     0 <= start <= end <= 10^5
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractInsertIntervalTest {

    protected InsertIntervalAPI insertInterval;

    private String debug( int[][] array ) {

        StringBuilder sb = new StringBuilder( "[ " );

        for ( int i = 0; i < array.length; i++ ) {

            int[] child = array[i];
            sb.append( "[ " );
            sb.append( child[0] );
            sb.append( ", " );
            sb.append( child[1] );
            sb.append( " ]" );
        }

        sb.append( " ]" );

        return sb.toString();
    }


    void compare( int[][] actual, int[][] expected ) {

        String actualStr = debug( actual );
        String expectedStr = debug( expected );
        String message = "Expected: " + expectedStr + " but got: " + actualStr;

        if ( actual.length != expected.length ) {

            Assert.fail( message );
        }

        for ( int i = 0; i < expected.length; i++ ) {

            int[] expectedChild = expected[i];
            int[] actualChild = actual[i];
            Assert.assertTrue( Arrays.equals( actualChild, expectedChild ), message );
        }
    }


    void insert_1Test() {

        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        int[][] results = insertInterval.insert( intervals, newInterval );
        int[][] expected = { { 1, 5 }, { 6, 9 } };
        compare( results, expected );
    }


    void insert_2Test() {

        int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int[] newInterval = { 4, 8 };
        int[][] results = insertInterval.insert( intervals, newInterval );
        int[][] expected = { { 1, 2 }, { 3, 10 }, { 12, 16 } };
        compare( results, expected );
    }
}
