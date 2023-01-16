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
public class ReverseAlphabetical_JD implements ReverseAlphabeticalAPI {

    private boolean isLetter( char c ) {

        return ( ( c >= 'a' && c <= 'z' ) || ( c >= 'A' && c <= 'Z' ) );
    }


    @Override
    public String reverseOnlyAlphabetical( String input ) {

        char[] chars = input.toCharArray();
        int leftIndex = 0;
        int rightIndex = input.length() - 1;
        int midIndex = input.length() / 2;

        if ( input.length() % 2 == 1 ) {

            midIndex = midIndex + 1;
        }

        while ( rightIndex >= leftIndex ) {

            char leftLetter = chars[leftIndex];
            char rightLetter = chars[rightIndex];
            boolean continueLoop = true;

            if ( !isLetter( leftLetter ) ) {

                leftIndex++;
                continueLoop = false;
            }

            if ( !isLetter( rightLetter ) ) {

                rightIndex--;
                continueLoop = false;
            }

            if ( !continueLoop ) {
                continue;
            }

            char temp = leftLetter;
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }

        return new String( chars );
    }
}
