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
package com.spotadev.algo.blind75.bitmanipulation.easy.number_of_1_bits;

import org.testng.annotations.BeforeClass;

import com.spotadev.algo.blind75.bitmanipulation.easy.number_of_1_bit.NumberOf1Bits;

/**
 * @author John Dickerson - 19 May 2022
 */
public class NumberOf1BitsTest {

    private NumberOf1Bits numberOf1Bits;

    @BeforeClass
    public void setUp() {

        numberOf1Bits = new NumberOf1Bits();
    }


    public void hammingWeightTest() {

        int n = -1;
        int result = numberOf1Bits.hammingWeight( 0 );
    }
}
