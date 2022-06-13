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
package com.spotadev.algo.blind75.bitmanipulation.medium.sum_of_two_integers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 19 May 2022
 */
public class SumOfTwoIntegers_JDTest {

    private SumOfTwoIntegersAPI sumOfTwoIntegers;

    @BeforeClass
    public void setUp() {

        sumOfTwoIntegers = new SumOfTwoIntegers_JD();
    }


    @Test
    public void getSumTest() {

        int a = -1;
        int b = -1;
        int result = sumOfTwoIntegers.getSum( a, b );
    }
}