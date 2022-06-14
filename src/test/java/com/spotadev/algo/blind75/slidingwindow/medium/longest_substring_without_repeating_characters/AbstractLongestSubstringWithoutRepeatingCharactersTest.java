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
package com.spotadev.algo.blind75.slidingwindow.medium.longest_substring_without_repeating_characters;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractLongestSubstringWithoutRepeatingCharactersTest {

    protected LongestSubstringWithoutRepeatingCharactersAPI longestSubstringWithoutRepeatingCharacters;

    public void lengthOfLongestSubstringTest_1() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "abcabcbb" );

        Assert.assertEquals( longest, 3 );
    }


    public void lengthOfLongestSubstringTest_2() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "bbbbb" );

        Assert.assertEquals( longest, 1 );
    }


    public void lengthOfLongestSubstringTest_3() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "pwwkew" );

        Assert.assertEquals( longest, 3 );
    }

}