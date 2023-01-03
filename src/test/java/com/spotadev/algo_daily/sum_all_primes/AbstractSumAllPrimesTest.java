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
package com.spotadev.algo_daily.sum_all_primes;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractSumAllPrimesTest {

    protected SumAllPrimesAPI sumAllPrimes;

    /**
     * 11 -> [2, 3, 5, 7, 11] --> output --> 28
     */
    public void sumOfAllPrimes_1Test() {

        int n = 11;
        int expected = 28;
        int sum = sumAllPrimes.sumOfAllPrimes( n );
        Assert.assertEquals( sum, expected );
    }


    /**
     * 15 -> [2, 3, 5, 11, 13] --> output --> 41
     */
    public void sumOfAllPrimes_2Test() {

        int n = 15;
        int expected = 41;
        int sum = sumAllPrimes.sumOfAllPrimes( n );
        Assert.assertEquals( sum, expected );
    }


    /**
     * 17 -> [2, 3, 5, 7, 11, 13, 17] --> output --> 58
     */
    public void sumOfAllPrimes_3Test() {

        int n = 17;
        int expected = 58;
        int sum = sumAllPrimes.sumOfAllPrimes( n );
        Assert.assertEquals( sum, expected );
    }
}
