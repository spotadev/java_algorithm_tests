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
package com.spotadev.algo.blind75.heap_priorityqueue.find_median_from_data_stream;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.heap_priorityqueue.hard.find_median_from_data_stream.FindMedianFromDataStream_JD;

/**
 * @author John Dickerson - 13 May 2022
 */
public class FindMedianFromDataStreamTest extends AbstractFindMedianFromDataStreamTest {

    @BeforeClass
    public void setUp() {

        medianFinder = new FindMedianFromDataStream_JD();
    }


    @Test
    public void testingTest() {

        super.testingTest();
    }
}
