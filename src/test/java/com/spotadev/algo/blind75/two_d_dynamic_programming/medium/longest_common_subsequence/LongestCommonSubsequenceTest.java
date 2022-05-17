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
package com.spotadev.algo.blind75.two_d_dynamic_programming.medium.longest_common_subsequence;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 15 May 2022
 */
public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;

    @BeforeClass
    public void setUp() {

        longestCommonSubsequence = new LongestCommonSubsequence();
    }


    @Test
    public void longestCommonSubsequenceTest() {

        String text1 = null;
        String text2 = null;
        int result = longestCommonSubsequence.longestCommonSubsequence( text1, text2 );
        Assert.assertEquals( result, -1 );
    }
}
