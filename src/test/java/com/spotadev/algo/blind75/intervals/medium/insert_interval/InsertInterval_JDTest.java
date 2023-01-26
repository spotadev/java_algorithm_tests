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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class InsertInterval_JDTest extends AbstractInsertIntervalTest {

    @BeforeClass
    public void setUp() {

        insertInterval = new InsertInterval_JD();
    }


    @Test
    public void insert_1Test() {

        super.insert_1Test();
    }


    @Test
    public void insert_2Test() {

        super.insert_2Test();
    }
}
