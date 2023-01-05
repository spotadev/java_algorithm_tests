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
 **/
public class IsAnagramJD implements IsAnagramAPI {

    /**
     *    n    log n     n log n
     *    #    #####     #######
     *    1    0         0
     *    2    0.3       0.6
     *    3    0.47      1.4
     *    4    0.6       2.4
     *    10   1         10
     *    50   1.69      84
     *    100  2         200
     *    1000 3         3000
     *    
     *    This solution is faster than O(n log n).  It is O(n)
     */
    @Override
    public boolean isAnagram( String str1, String str2 ) {

        int lengthStr1 = str1.length();
        int lengthStr2 = str2.length();

        if ( lengthStr1 != lengthStr2 ) {

            return false;
        }

        if ( str1.equalsIgnoreCase( str2 ) ) {

            return false;
        }

        short[] cache = new short[128];
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        int countMatched = 0;

        for ( int i = 0; i < str1Char.length; i++ ) {

            char c1 = Character.toLowerCase( str1Char[i] );
            int i1 = c1;
            char c2 = Character.toLowerCase( str2Char[i] );
            int i2 = c2;

            if ( cache[i1] % 2 == 1 ) {

                countMatched++;
            }

            cache[i1]++;

            if ( cache[i2] % 2 == 1 ) {

                countMatched++;
            }

            cache[i2]++;
        }

        if ( countMatched == lengthStr1 ) {

            return true;
        }

        return false;
    }
}
