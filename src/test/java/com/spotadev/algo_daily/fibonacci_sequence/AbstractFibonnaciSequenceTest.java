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
package com.spotadev.algo_daily.fibonacci_sequence;

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractFibonnaciSequenceTest {

    protected FibonnaciSequenceAPI fibonnaciSequenceAPI;

    void fibonacciSequence_1Test() {

        int n = 5;
        int result = fibonnaciSequenceAPI.fibonacciSequence( n );
        Assert.assertEquals( result, 5 );
    }


    void fibonacciSequence_2Test() {

        int n = 6;
        int result = fibonnaciSequenceAPI.fibonacciSequence( n );
        Assert.assertEquals( result, 8 );
    }
}
