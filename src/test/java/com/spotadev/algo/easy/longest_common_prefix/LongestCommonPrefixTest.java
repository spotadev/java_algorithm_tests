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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.easy.longest_common_prefix.LongestCommonPrefix;

/**
 * @author John Dickerson - 17 Apr 2022
 */
public class LongestCommonPrefixTest {

    private Logger logger = LoggerFactory.getLogger( LongestCommonPrefixTest.class );

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeClass
    public void setUp() {

        longestCommonPrefix = new LongestCommonPrefix();
    }


    @Test
    public void longestCommonPrefixTest_1() {

        String[] strs = { "flower", "flow", "flight" };
        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
        logger.info( prefix );
        Assert.assertEquals( prefix, "fl" );
    }


    @Test
    public void longestCommonPrefixTest_2() {

        String[] strs = { "dog", "racecar", "car" };
        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
        logger.info( prefix );
        Assert.assertEquals( prefix, "" );
    }

    //    public void longestCommonPrefixTest_3() {
    //
    //        String[] strs = null;
    //        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
    //        Assert.assertEquals( prefix, "" );
    //    }

}
