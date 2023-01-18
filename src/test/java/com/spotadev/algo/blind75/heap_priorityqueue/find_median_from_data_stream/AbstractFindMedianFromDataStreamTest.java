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

import org.testng.Assert;

import com.spotadev.algo.blind75.heap_priorityqueue.hard.find_median_from_data_stream.FindMedianFromDataStreamAPI;
import com.spotadev.algo.blind75.heap_priorityqueue.hard.find_median_from_data_stream.FindMedianFromDataStream_JD;

/**
 * @author John Dickerson - 10 Jun 2022
 */
public abstract class AbstractFindMedianFromDataStreamTest {

    protected FindMedianFromDataStreamAPI medianFinder;

    void testingTest() {

        String[] commands =
                { "MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian" };

        Integer[] input = { null, 1, 2, null, 3, null };
        Double[] expected = { null, null, null, 1.5, null, 2.0 };
        int i = 0;

        for ( String command : commands ) {

            switch ( command ) {

                case "MedianFinder":
                    medianFinder = new FindMedianFromDataStream_JD();
                    break;

                case "addNum":
                    medianFinder.addNum( input[i] );
                    break;

                case "findMedian":
                    double actual = medianFinder.findMedian();
                    Assert.assertEquals( actual, expected[i].doubleValue() );
                    break;
            }

            i++;
        }
    }
}
