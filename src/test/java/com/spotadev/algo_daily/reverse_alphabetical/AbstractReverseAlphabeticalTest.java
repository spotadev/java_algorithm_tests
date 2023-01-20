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
package com.spotadev.algo_daily.reverse_alphabetical;

import org.testng.Assert;

/**
 * https://algodaily.com/challenges/reverse-only-alphabetical
 * 
 * You are given a string that contains alphabetical characters (a-z, A-Z) and some other 
 * characters ($, !, etc.)
 * 
 * Can you reverse ONLY the alphabetical characters
 *
 * Example
 * =======
 * 
 *      'sea!$hells3' becomes 'sll!$ehaes3'
 *
 * Constraints
 * ===========
 * 
 *     i) The length of a given string <= 10000.
 * 
 *     ii) The string comprises of ASCII characters.
 * 
 *     iii) Time Complexity : O(n).
 * 
 *     iv) Expected space complexity: O(n).
 *     
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractReverseAlphabeticalTest {

    protected ReverseAlphabeticalAPI reverseAlphabetical;

    void reverseOnlyAlphabeticalTest() {

        String input = "sea!$hells3";
        String reversed = reverseAlphabetical.reverseOnlyAlphabetical( input );
        String expected = "sll!$ehaes3";
        Assert.assertEquals( reversed, expected );
    }
}
