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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class ValidatePalindrome_JDTest extends AbstractValidatePalindromeTest {

    @BeforeClass
    public void setUp() {

        validatePalindrome = new ValidatePalindrome_JD();
    }


    @Test
    public void isPalindrome_1Test() {

        super.isPalindrome_1Test();
    }


    @Test
    public void isPalindrome_2Test() {

        super.isPalindrome_2Test();
    }


    @Test
    public void isPalindrome_3Test() {

        super.isPalindrome_3Test();
    }
}
