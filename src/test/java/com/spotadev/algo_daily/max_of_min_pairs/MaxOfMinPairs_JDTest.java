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
package com.spotadev.algo_daily.max_of_min_pairs;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class MaxOfMinPairs_JDTest extends AbstractMaxOfMinPairsTest {

    @BeforeClass
    public void setUp() {

        maxOfMinPairs = new MaxOfMinPairsJD();
    }


    @Test
    public void smallArrayTest() {

        super.smallArrayTest();
    }


    @Test
    public void largeArrayTest() {

        super.largeArrayTest();
    }
}
