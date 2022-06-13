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
package com.spotadev.algo.blind75.arraysandhashing.medium.longest_consecutive_sequence;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 May 2022
 */
public class LongestConsecutiveSequence_JDTest extends AbstractLongestConsecutiveSequenceTest {

    @BeforeClass
    public void setUp() {

        longestConsecutiveSequence = new LongestConsecutiveSequence_JD();
    }


    @Test
    public void longestConsecutiveTest_1() {

        super.longestConsecutiveTest_1();
    }


    @Test
    public void longestConsecutiveTest_2() {

        super.longestConsecutiveTest_2();
    }


    @Test
    public void longestConsecutiveTest_3() {

        super.longestConsecutiveTest_3();
    }
}
