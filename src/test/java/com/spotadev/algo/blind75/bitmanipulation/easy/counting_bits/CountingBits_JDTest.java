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
package com.spotadev.algo.blind75.bitmanipulation.easy.counting_bits;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 19 May 2022
 */
public class CountingBits_JDTest extends AbstractCountingBitsTest {

    @BeforeClass
    public void setUp() {

        countingBits = new CountingBits_JD();
    }


    @Test
    public void countBits_2Test() {

        super.countBits_2Test();
    }


    @Test
    public void countBits_5Test() {

        super.countBits_5Test();
    }
}
