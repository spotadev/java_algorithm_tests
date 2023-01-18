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

import java.util.Arrays;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractCountingBitsTest {

    protected CountingBitsAPI countingBits;

    void countBits_2Test() {

        int n = 2;
        int[] result = countingBits.countBits( n );

        Assert.assertTrue( Arrays.equals( result,
                new int[] {
                        0, 1, 1

                } ) );
    }


    void countBits_5Test() {

        int n = 5;
        int[] result = countingBits.countBits( n );

        Assert.assertTrue( Arrays.equals( result,
                new int[] {
                        0, 1, 1, 2, 1, 2
                } ) );
    }
}
