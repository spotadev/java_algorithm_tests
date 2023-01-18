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
package com.spotadev.algo_daily.fizz_buzz;

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractFizzBuzzTest {

    protected FizzBuzzAPI fizzBuzz;

    void fizzBuzzTest() {

        Integer num = 15;
        String result = fizzBuzz.fizzBuzz( num );
        Assert.assertEquals( result, "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz" );
    }
}
