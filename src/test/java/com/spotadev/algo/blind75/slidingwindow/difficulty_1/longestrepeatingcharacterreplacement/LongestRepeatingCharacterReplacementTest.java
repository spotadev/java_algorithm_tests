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
package com.spotadev.algo.blind75.slidingwindow.difficulty_1.longestrepeatingcharacterreplacement;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.slidingwindow.difficulty_1.longestrepeatingcharacterreplacement.LongestRepeatingCharacterReplacement;

/**
 * @author John Dickerson - 3 May 2022
 */
public class LongestRepeatingCharacterReplacementTest {

    private LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement;

    @BeforeClass
    public void setUp() {

        longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
    }


    @Test
    public void characterReplacementTest_1() {

        int longest = longestRepeatingCharacterReplacement.characterReplacement( "ABAB", 2 );
        Assert.assertEquals( longest, 4 );
    }


    @Test
    public void characterReplacementTest_2() {

        int longest = longestRepeatingCharacterReplacement.characterReplacement( "AABABBA", 1 );
        Assert.assertEquals( longest, 4 );
    }
}
