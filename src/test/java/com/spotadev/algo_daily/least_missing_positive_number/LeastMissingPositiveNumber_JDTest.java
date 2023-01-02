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
package com.spotadev.algo_daily.least_missing_positive_number;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class LeastMissingPositiveNumber_JDTest extends AbstractLeastMissingPositiveNumberTest {

    @BeforeClass
    public void setUp() {

        leastMissingPositiveNumber = new LeastMissingPositiveNumberJD();
    }


    @Test
    public void leastMissingPositiveTest() {

        super.leastMissingPositiveTest();
    }
}
