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
package com.spotadev.algo.easy.palidrome;

import org.testng.Assert;

/**
 * @author John Dickerson - 16 Apr 2022
 */
public abstract class AbstractPalidromeTest {

    protected PalidromeAPI palidrome;

    public void isPalindromeTest_1() {

        boolean isPalidrome = palidrome.isPalindrome( 121 );
        Assert.assertTrue( isPalidrome );
    }


    public void isPalindromeTest_2() {

        boolean isPalidrome = palidrome.isPalindrome( -121 );
        Assert.assertFalse( isPalidrome );
    }


    public void isPalindromeTest_3() {

        boolean isPalidrome = palidrome.isPalindrome( 10 );
        Assert.assertFalse( isPalidrome );
    }
}
