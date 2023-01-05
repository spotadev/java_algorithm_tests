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

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractLeastMissingPositiveNumberTest {

    protected LeastMissingPositiveNumberAPI leastMissingPositiveNumber;

    public void leastMissingPositive_1Test() {

        int[] numbers = { 0, 3, -1, -2, 1 };
        int leastMissingPositiveNum = leastMissingPositiveNumber.leastMissingPositive( numbers );
        Assert.assertEquals( leastMissingPositiveNum, 2 );
    }


    // empty array
    public void leastMissingPositive_2Test() {

        int[] numbers = {};
        int leastMissingPositiveNum = leastMissingPositiveNumber.leastMissingPositive( numbers );
        Assert.assertEquals( leastMissingPositiveNum, 0 );
    }


    // no positives
    public void leastMissingPositive_3Test() {

        int[] numbers = { -1, -4, -5 };
        int leastMissingPositiveNum = leastMissingPositiveNumber.leastMissingPositive( numbers );
        Assert.assertEquals( leastMissingPositiveNum, 0 );
    }
}
