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
package com.spotadev.algo.easy.longest_common_prefix;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LongestCommonPrefix_JDTest extends AbstractLongestCommonPrefixTest {

    @BeforeClass
    public void setUp() {

        longestCommonPrefix = new LongestCommonPrefix_JD();
    }


    @Test
    public void longestCommonPrefixTest_1() {

        super.longestCommonPrefixTest_1();
    }


    @Test
    public void longestCommonPrefixTest_2() {

        super.longestCommonPrefixTest_2();
    }

    //    public void longestCommonPrefixTest_3() {
    //
    //        String[] strs = null;
    //        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
    //        Assert.assertEquals( prefix, "" );
    //    }
}
