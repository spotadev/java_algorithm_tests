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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class FibonnaciSequence_JDTest extends AbstractFibonnaciSequenceTest {

    @BeforeClass
    public void setUp() {

        fibonnaciSequenceAPI = new FibonnaciSequenceJD();
    }


    @Test
    public void fibonacciSequence_1Test() {

        super.fibonacciSequence_1Test();
    }


    public void fibonacciSequence_2Test() {

        super.fibonacciSequence_2Test();
    }
}
