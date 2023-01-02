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
 *  @author Karema99 - 29 Aug 2022
 */
public interface FirstNonRepeatingCharacterAPI {

    char firstNonRepeat( String str );
}
