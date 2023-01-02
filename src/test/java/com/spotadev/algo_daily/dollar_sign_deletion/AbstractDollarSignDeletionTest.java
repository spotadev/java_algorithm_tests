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
package com.spotadev.algo_daily.dollar_sign_deletion;

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractDollarSignDeletionTest {

    protected DollarSignDeletionAPI dollarSignDeletionAPI;

    public void isDollarDeleteEqual_1Test() {

        String[] array = { "f$st", "st" };
        boolean dollarDeleteEqual = dollarSignDeletionAPI.isDollarDeleteEqual( array );
        Assert.assertTrue( dollarDeleteEqual );
    }


    public void getFinalStr_1Test() {

        String string = "f$st";
        String finalString = dollarSignDeletionAPI.getFinalStr( string );
        Assert.assertEquals( finalString, "st" );
    }
}
