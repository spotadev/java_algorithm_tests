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
 * @author John Dickerson - 3 Jan 2023
 */
public class AbstractValidatePalindromeTest {

    protected ValidatePalindromeAPI validatePalindrome;

    public void isPalindrome_1Test() {

        char[] input = "racecar".toCharArray();
        boolean isPalidrome = validatePalindrome.isPalindrome( input );
        Assert.assertTrue( isPalidrome );
    }


    public void isPalindrome_2Test() {

        char[] input = "mum".toCharArray();
        boolean isPalidrome = validatePalindrome.isPalindrome( input );
        Assert.assertTrue( isPalidrome );
    }


    public void isPalindrome_3Test() {

        char[] input = "horse".toCharArray();
        boolean isPalidrome = validatePalindrome.isPalindrome( input );
        Assert.assertFalse( isPalidrome );
    }
}
