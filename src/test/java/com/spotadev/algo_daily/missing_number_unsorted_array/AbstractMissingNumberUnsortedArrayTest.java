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

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractMissingNumberUnsortedArrayTest {

    protected MissingNumberUnsortedArrayAPI missingNumberUnsortedArray;

    public void missingInUnsortedTest() {

        int[] numbers = { 2, 5, 1, 4, 9, 6, 3, 7 };
        int lowerBound = 1;
        int upperBound = 9;

        int missing =
                missingNumberUnsortedArray.missingInUnsorted( numbers, lowerBound, upperBound );

        Assert.assertEquals( missing, 8 );
    }
}
