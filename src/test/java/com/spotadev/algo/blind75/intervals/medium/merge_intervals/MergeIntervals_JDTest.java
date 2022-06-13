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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 17 May 2022
 */
public class MergeIntervals_JDTest extends AbstractMergeIntervalsTest {

    @BeforeClass
    public void setUp() {

        mergeIntervals = new MergeIntervals_JD();
    }


    @Test
    public void mergeTest() {

        super.mergeTest();
    }
}
