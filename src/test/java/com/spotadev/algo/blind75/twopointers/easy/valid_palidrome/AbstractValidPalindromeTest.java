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
package com.spotadev.algo.blind75.twopointers.easy.valid_palidrome;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractValidPalindromeTest {

    protected ValidPalindromeAPI validPalindrome;

    public void isPalindromeTest_1() {

        boolean isPalindrome = validPalindrome.isPalindrome( "A man, a plan, a canal: Panama" );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_2() {

        boolean isPalindrome = validPalindrome.isPalindrome( "race a car" );
        Assert.assertFalse( isPalindrome );
    }


    void isPalindromeTest_3() {

        boolean isPalindrome = validPalindrome.isPalindrome( " " );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_4() {

        boolean isPalindrome = validPalindrome.isPalindrome( ".," );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_5() {

        boolean isPalindrome = validPalindrome.isPalindrome( "0P" );
        Assert.assertFalse( isPalindrome );
    }


    void isPalindromeTest_6() {

        boolean isPalindrome = validPalindrome.isPalindrome( "0z;z   ; 0" );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_7() {

        boolean isPalindrome = validPalindrome.isPalindrome( "!!!::vrTTr::v!!!" );
        Assert.assertTrue( isPalindrome );
    }
}
