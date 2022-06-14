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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.decode_ways;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class DecodeWays_JDTest extends AbstractDecodeWaysTest {

    @BeforeClass
    public void setUp() {

        decodeWays = new DecodeWays_JD();
    }


    @Test
    public void numDecodingsTest() {

        String s = null;
        int numberDecodings = decodeWays.numDecodings( s );
    }

}
