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
package com.spotadev.algo.blind75.slidingwindow.medium.longest_repeating_character_replacement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 May 2022
 */
public class LongestRepeatingCharacterReplacement_JDTest extends
        AbstractLongestRepeatingCharacterReplacementTest {

    @BeforeClass
    public void setUp() {

        longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement_JD();
    }


    @Test
    public void characterReplacementTest_1() {

        super.characterReplacementTest_1();
    }


    @Test
    public void characterReplacementTest_2() {

        super.characterReplacementTest_2();
    }
}
