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
package com.spotadev.algo_daily.missing_number_unsorted_array;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class MissingNumberUnsortedArray_JDTest extends AbstractMissingNumberUnsortedArrayTest {

    @BeforeClass
    public void setUp() {

        missingNumberUnsortedArray = new MissingNumberUnsortedArrayJD();
    }


    @Test
    public void missingInUnsortedTest() {

        super.missingInUnsortedTest();
    }
}
