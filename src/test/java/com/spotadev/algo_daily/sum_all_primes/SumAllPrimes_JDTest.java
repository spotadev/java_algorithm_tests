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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class SumAllPrimes_JDTest extends AbstractSumAllPrimesTest {

    @BeforeClass
    public void setUp() {

        sumAllPrimes = new SumAllPrimes_JD();
    }


    @Test
    public void sumOfAllPrimes_1Test() {

        super.sumOfAllPrimes_1Test();
    }


    @Test
    public void sumOfAllPrimes_2Test() {

        super.sumOfAllPrimes_2Test();
    }


    @Test
    public void sumOfAllPrimes_3Test() {

        super.sumOfAllPrimes_3Test();
    }
}
