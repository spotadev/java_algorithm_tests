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

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractLongestRepeatingCharacterReplacementTest {

    protected LongestRepeatingCharacterReplacementAPI longestRepeatingCharacterReplacement;

    void characterReplacementTest_1() {

        int longest = longestRepeatingCharacterReplacement.characterReplacement( "ABAB", 2 );
        Assert.assertEquals( longest, 4 );
    }


    void characterReplacementTest_2() {

        int longest = longestRepeatingCharacterReplacement.characterReplacement( "AABABBA", 1 );
        Assert.assertEquals( longest, 4 );
    }
}
