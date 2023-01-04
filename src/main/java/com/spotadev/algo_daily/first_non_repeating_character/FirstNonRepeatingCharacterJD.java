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
package com.spotadev.algo_daily.first_non_repeating_character;

/**
 * https://algodaily.com/challenges/find-first-non-repeating-character
 * 
 * Given a string of random alphanumeric characters with a length between 0 and 1000.
 * 
 * Write a method to return the first character in the string that does not repeat itself later on.
 *
 * Example
 * =======
 * 
 *     {asdfsadfadsfjdfsasfnnunl} --> 'j'
 *
 * Constraints
 * ===========
 * 
 *     The given string cao be empty.
 * 
 *     The string will only contain lowercase/uppercase alphabets and numerals
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(A) where A is the number of ASCII characters
 * 
 *  @author John Dickerson - 2 Jan 2023
 */
public class FirstNonRepeatingCharacterJD implements FirstNonRepeatingCharacterAPI {

    @Override
    public char firstNonRepeat( String str ) {

        char[] characters = str.toCharArray();

        boolean[] cache = new boolean[128];
        int indexLastCharacterVisitedOnce = -1;

        for ( int i = characters.length - 1; i >= 0; i-- ) {

            int code = characters[i];
            boolean cacheInt = cache[code];

            if ( !cacheInt ) {

                indexLastCharacterVisitedOnce = i;
            }

            cache[code] = true;
        }

        return characters[indexLastCharacterVisitedOnce];
    }
}
