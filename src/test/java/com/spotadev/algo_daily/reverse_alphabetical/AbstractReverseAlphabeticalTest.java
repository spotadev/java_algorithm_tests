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
package com.spotadev.algo_daily.reverse_alphabetical;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractReverseAlphabeticalTest {

    protected ReverseAlphabeticalAPI reverseAlphabetical;

    public void reverseOnlyAlphabeticalTest() {

        String input = "sea!$hells3";
        String reversed = reverseAlphabetical.reverseOnlyAlphabetical( input );
        String expected = "sll!$ehaes3";
        Assert.assertEquals( reversed, expected );
    }
}
