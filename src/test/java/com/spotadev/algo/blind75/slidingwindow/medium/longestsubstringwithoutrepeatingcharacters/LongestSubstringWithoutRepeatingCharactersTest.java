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
package com.spotadev.algo.blind75.slidingwindow.medium.longestsubstringwithoutrepeatingcharacters;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.slidingwindow.medium.longestsubstringwithoutrepeatingcharacters.LongestSubstringWithoutRepeatingCharacters;

/**
 * @author John Dickerson - 3 May 2022
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeClass
    public void setUp() {

        longestSubstringWithoutRepeatingCharacters =
                new LongestSubstringWithoutRepeatingCharacters();
    }


    @Test
    public void lengthOfLongestSubstringTest_1() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "abcabcbb" );

        Assert.assertEquals( longest, 3 );
    }


    @Test
    public void lengthOfLongestSubstringTest_2() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "bbbbb" );

        Assert.assertEquals( longest, 1 );
    }


    @Test
    public void lengthOfLongestSubstringTest_3() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "pwwkew" );

        Assert.assertEquals( longest, 3 );
    }
}
