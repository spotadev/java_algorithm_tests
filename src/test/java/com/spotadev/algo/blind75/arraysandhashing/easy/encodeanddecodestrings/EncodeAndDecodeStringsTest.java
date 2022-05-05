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
package com.spotadev.algo.blind75.arraysandhashing.easy.encodeanddecodestrings;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.arraysandhashing.easy.encodeanddecodestrings.EncodeAndDecodeStrings;

/**
 * @author John Dickerson - 1 May 2022
 */
public class EncodeAndDecodeStringsTest {

    private EncodeAndDecodeStrings encodeAndDecodeStrings;

    @BeforeClass
    public void setUp() {

        encodeAndDecodeStrings = new EncodeAndDecodeStrings();
    }


    @Test
    public void encodeDecodeTest() {

        List<String> toEncode = new ArrayList<>();
        toEncode.add( "Hello" );
        toEncode.add( "World" );

        String encoded = encodeAndDecodeStrings.encode( toEncode );
        List<String> decoded = encodeAndDecodeStrings.decode( encoded );

        Assert.assertTrue( toEncode.equals( decoded ) );
    }
}
