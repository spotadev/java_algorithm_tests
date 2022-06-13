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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.arraysandhashing.easy.encode_and_decode_strings.EncodeAndDecodeStrings_JD;

/**
 * @author John Dickerson - 1 May 2022
 */
public class EncodeAndDecodeStrings_JDTest {

    private EncodeAndDecodeStringsAPI encodeAndDecodeStrings;

    @BeforeClass
    public void setUp() {

        encodeAndDecodeStrings = new EncodeAndDecodeStrings_JD();
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