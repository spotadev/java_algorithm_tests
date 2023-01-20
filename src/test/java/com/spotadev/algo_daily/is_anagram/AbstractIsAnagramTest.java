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
package com.spotadev.algo_daily.is_anagram;

import static org.testng.Assert.assertEquals;

/**
 * https://algodaily.com/challenges/is-an-anagram
 *
 * Anagram definition: word or phrase formed by rearranging the letters of another,
 * for instance, cinema is formed from  iceman.
 * 
 * Given 2 string like 'cinema' and 'iceman' as inputs.
 * 
 * Write a method isAnagram(str1, str2) that will return true or false, depending on whether the 
 * strings are anagrmas of each other.
 * 
 * Constraints
 * ===========
 * 
 *     i)   Length of both string <=100000
 *     
 *     ii)  The strings contain alphanumeric characters (a-z, A-Z, 0-9)
 *     
 *     iii) The strings can be empty
 *     
 *     iV)  Time complexity: O(n log n)
 *     
 *     v)   Space complexity: O(n)
 *     
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractIsAnagramTest {

    protected IsAnagramAPI isAnagram;

    // deals with case of mixed case
    void firstTest() {

        assertEquals( isAnagram.isAnagram( "Mary", "Army" ), true );
    }


    void secondTest() {

        assertEquals( isAnagram.isAnagram( "cinema", "iceman" ), true );
    }


    void thirdTest() {

        assertEquals( isAnagram.isAnagram( "jake", "jay" ), false );
    }


    // Deals with case of duplicate letters
    void fourthTest() {

        assertEquals( isAnagram.isAnagram( "Naan", "Anna" ), true );
    }


    // Deals with case of identical strings - identical strings are not an anagram
    void fifthTest() {

        assertEquals( isAnagram.isAnagram( "Anna", "Anna" ), false );
    }
}
