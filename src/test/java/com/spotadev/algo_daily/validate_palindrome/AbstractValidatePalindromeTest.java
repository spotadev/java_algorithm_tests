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

import org.testng.Assert;

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
public class AbstractValidatePalindromeTest {

    protected ValidatePalindromeAPI validatePalindrome;

    void isPalindrome_1Test() {

        char[] input = "racecar".toCharArray();
        boolean isPalidrome = validatePalindrome.isPalindrome( input );
        Assert.assertTrue( isPalidrome );
    }


    void isPalindrome_2Test() {

        char[] input = "mum".toCharArray();
        boolean isPalidrome = validatePalindrome.isPalindrome( input );
        Assert.assertTrue( isPalidrome );
    }


    void isPalindrome_3Test() {

        char[] input = "horse".toCharArray();
        boolean isPalidrome = validatePalindrome.isPalindrome( input );
        Assert.assertFalse( isPalidrome );
    }
}
