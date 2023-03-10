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
package com.spotadev.algo.blind75.slidingwindow.hard.minimum_window_substring;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * See MimimumWindowSubstring for the question.  
 * 
 * This was the fastest solution from leetcode.  The performance was 1 ms which was 32 times 
 * faster than my solution in MimimumWindowSubstring.
 * 
 * The main performance enhancement he has is not using a map.  As char can be cast to int,
 * wherever you want to use a Map where the key is a Character you can instead use an array
 * where the index of the array is the Character.  This can speed up performance 32 times
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public class MinimumWindowSubstringFastest_JDTest extends AbstractMinimumWindowSubstringTest {

    @BeforeClass
    public void setUp() {

        minimumWindowSubstring = new MinimumWindowSubstringFastest_JD();
    }


    @Test
    public void minWindowTest_1() {

        super.minWindowTest_1();
    }


    @Test
    public void minWindowTest_2() {

        super.minWindowTest_2();
    }


    @Test
    public void minWindowTest_3() {

        super.minWindowTest_3();
    }


    @Test
    public void minWindowTest_4() {

        String minWindow = minimumWindowSubstring.minWindow( "aa", "aa" );
        Assert.assertEquals( minWindow, "aa" );
    }


    @Test
    public void minWindowTest_5() {

        super.minWindowTest_5();
    }


    @Test
    public void minWindowTest_6() {

        super.minWindowTest_6();
    }


    @Test
    public void minWindowTest_7() {

        super.minWindowTest_7();
    }


    @Test
    public void minWindowTest_8() {

        super.minWindowTest_8();
    }


    @Test
    public void minWindowTest_9() {

        super.minWindowTest_9();
    }


    @Test
    public void minWindowTest_10() {

        super.minWindowTest_10();
    }


    @Test
    public void minWindowTest_11() {

        super.minWindowTest_11();
    }
}