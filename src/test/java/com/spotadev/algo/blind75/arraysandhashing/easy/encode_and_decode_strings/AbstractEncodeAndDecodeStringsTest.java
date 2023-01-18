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
package com.spotadev.algo.blind75.arraysandhashing.easy.encode_and_decode_strings;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractEncodeAndDecodeStringsTest {

    protected EncodeAndDecodeStringsAPI encodeAndDecodeStrings;

    void encodeDecodeTest() {

        List<String> toEncode = new ArrayList<>();
        toEncode.add( "Hello" );
        toEncode.add( "World" );

        String encoded = encodeAndDecodeStrings.encode( toEncode );
        List<String> decoded = encodeAndDecodeStrings.decode( encoded );

        Assert.assertTrue( toEncode.equals( decoded ) );
    }
}
