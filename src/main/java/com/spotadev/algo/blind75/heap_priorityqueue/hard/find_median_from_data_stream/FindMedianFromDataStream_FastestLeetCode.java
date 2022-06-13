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
package com.spotadev.algo.blind75.heap_priorityqueue.hard.find_median_from_data_stream;

import java.util.PriorityQueue;

/**
 * @author John Dickerson - 10 Jun 2022
 */
public class FindMedianFromDataStream_FastestLeetCode implements FindMedianFromDataStreamAPI {

    PriorityQueue<Integer> lower;
    PriorityQueue<Integer> higher;

    public FindMedianFromDataStream_FastestLeetCode() {

        lower = new PriorityQueue<>( ( a, b ) -> b - a );
        higher = new PriorityQueue<>();
    }


    public void addNum( int num ) {

        if ( lower.isEmpty() || num <= lower.peek() ) {
            lower.add( num );
        }
        else {
            higher.add( num );
        }
        balance();
    }


    private void balance() {

        if ( lower.size() > higher.size() ) {
            while ( lower.size() - higher.size() >= 2 ) {
                higher.add( lower.poll() );
            }
        }
        else if ( lower.size() < higher.size() ) {
            while ( higher.size() - lower.size() >= 2 ) {
                lower.add( higher.poll() );
            }
        }
    }


    public double findMedian() {

        if ( lower.size() == higher.size() ) {
            return ( lower.peek() + higher.peek() ) / 2.0;
        }
        if ( lower.size() > higher.size() ) {
            return lower.peek() / 1.0;
        }
        return higher.peek() / 1.0;
    }
}
