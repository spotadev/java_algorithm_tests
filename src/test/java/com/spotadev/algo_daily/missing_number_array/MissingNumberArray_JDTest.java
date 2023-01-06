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
package com.spotadev.algo_daily.missing_number_array;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class MissingNumberArray_JDTest extends AbstractMissingNumberArrayTest {

    @BeforeClass
    public void setUp() {

        missingNumberArray = new MissingNumberArrayJD();
    }


    @Test
    public void missingNumber_1Test() {

        super.missingNumber_1Test();
        ;
    }
}
