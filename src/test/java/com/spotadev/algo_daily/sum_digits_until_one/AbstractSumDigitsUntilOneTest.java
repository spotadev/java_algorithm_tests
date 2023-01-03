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
package com.spotadev.algo_daily.sum_digits_until_one;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class AbstractSumDigitsUntilOneTest {

    protected SumDigitsUntilOneAPI sumDigitsUntilOne;

    public void sumDigits_1Test() {

        int input = 49;
        int output = sumDigitsUntilOne.sumDigits( input );
        Assert.assertEquals( output, 4 );
    }


    public void sumDigits_2Test() {

        int input = 56;
        int output = sumDigitsUntilOne.sumDigits( input );
        Assert.assertEquals( output, 2 );
    }
}
