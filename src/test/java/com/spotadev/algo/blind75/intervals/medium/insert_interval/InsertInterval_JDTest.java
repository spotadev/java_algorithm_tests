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
 * @author John Dickerson - 15 May 2022
 */
public class InsertInterval_JDTest {

    private InsertIntervalAPI insertInterval;

    @BeforeClass
    public void setUp() {

        insertInterval = new InsertInterval_JD();
    }


    @Test
    public void insertTest() {

        int[][] intervals = {};
        int[] newInterval = {};
        int[][] result = insertInterval.insert( intervals, newInterval );
    }
}
