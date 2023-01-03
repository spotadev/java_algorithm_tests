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
package com.spotadev.algo_daily.single_lonely_number;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractSingleLonelyNumberTest {

    protected SingleLonelyNumberAPI singleLonelyNumber;

    public void lonelyNumber_1Test() {

        int[] arr = { 1, 4, 7, 9, 4, 7, 1 };
        int result = singleLonelyNumber.lonelyNumber( arr );
        int expected = 9;
        Assert.assertEquals( result, expected );
    }


    public void lonelyNumber_2Test() {

        int[] arr = { 4, 4, 6, 1, 3, 1, 3 };
        int result = singleLonelyNumber.lonelyNumber( arr );
        int expected = 6;
        Assert.assertEquals( result, expected );
    }


    public void lonelyNumber_3Test() {

        int[] arr = { 3, 3, 9 };
        int result = singleLonelyNumber.lonelyNumber( arr );
        int expected = 9;
        Assert.assertEquals( result, expected );
    }
}
