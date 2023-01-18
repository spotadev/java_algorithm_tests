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
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractMergeIntervalsTest {

    protected MergeIntervalsAPI mergeIntervals;

    void mergeTest() {

        int[][] intervals = new int[][] {};
        int[][] result = mergeIntervals.merge( intervals );
    }
}
