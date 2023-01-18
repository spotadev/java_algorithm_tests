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
package com.spotadev.algo.blind75.bitmanipulation.easy.missing_number;

import org.testng.Assert;

/**
 * @author John Dickerson - 18 Jan 2023
 */
public abstract class AbstractMissingNumberTest {

    private MissingNumberAPI missingNumberAPI;

    void missingNumber_1Test() {

        int result = missingNumberAPI.missingNumber( new int[] {} );
        Assert.assertEquals( result, 1 );
    }


    void missingNumber_2Test() {

        int result = missingNumberAPI.missingNumber( new int[] {} );
        Assert.assertEquals( result, 1 );
    }


    void missingNumber_3Test() {

        int result = missingNumberAPI.missingNumber( new int[] {} );
        Assert.assertEquals( result, 1 );
    }
}
