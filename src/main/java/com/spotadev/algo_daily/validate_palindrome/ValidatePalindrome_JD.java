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
package com.spotadev.algo_daily.validate_palindrome;

/**
 * https://algodaily.com/challenges/validate-palindrome
 * 
 * Given a string str, write a method that will return True if is a palindrome and False
 * if it is not a palindrome.
 * 
 * palindrome definition: a word or phrase or sequence that reads the same backward as forward
 *
 * Examples
 * ========
 * 
 *     'racecar' -> True
 *     
 *     'mum' -> True
 * 
 *     'horse' -> False
 *
 * Constraints
 * ===========
 * 
 *     i) Length of the string <= 100000
 * 
 *     ii) The string will consist of ASCII characters (some or all)
 * 
 *     iii) Time complexity: O(n)
 * 
 *     iv) Space complexity: O(!)
 *     
 * @author John Dickerson - 3 Jan 2023
 */
public class ValidatePalindrome_JD implements ValidatePalindromeAPI {

    @Override
    public boolean isPalindrome( char[] str ) {

        int leftIndex = 0;
        int rightIndex = str.length - 1;

        while ( leftIndex <= rightIndex ) {

            if ( str[leftIndex] != str[rightIndex] ) {

                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
