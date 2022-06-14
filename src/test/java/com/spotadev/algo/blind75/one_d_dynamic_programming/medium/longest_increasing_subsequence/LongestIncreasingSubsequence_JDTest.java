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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.longest_increasing_subsequence;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 14 May 2022
 */
public class LongestIncreasingSubsequence_JDTest extends AbstractLongestIncreasingSubsequenceTest {

    @BeforeClass
    public void setUp() {

        longestIncreasingSubsequence = new LongestIncreasingSubsequence_JD();
    }


    @Test
    public void lengthOfLISTest() {

        super.lengthOfLISTest();
    }
}
