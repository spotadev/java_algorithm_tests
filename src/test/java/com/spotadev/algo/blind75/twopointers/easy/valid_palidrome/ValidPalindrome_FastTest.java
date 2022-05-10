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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.twopointers.easy.valid_palidrome.ValidPalindrome_Fast;

/**
 * @author John Dickerson - 2 May 2022
 */
public class ValidPalindrome_FastTest {

    private ValidPalindrome_Fast validPalindrome;

    @BeforeClass
    public void setUp() {

        validPalindrome = new ValidPalindrome_Fast();
    }


    @Test
    public void isPalindromeTest_1() {

        boolean isPalindrome = validPalindrome.isPalindrome( "A man, a plan, a canal: Panama" );
        Assert.assertTrue( isPalindrome );
    }


    @Test
    public void isPalindromeTest_2() {

        boolean isPalindrome = validPalindrome.isPalindrome( "race a car" );
        Assert.assertFalse( isPalindrome );
    }


    @Test
    public void isPalindromeTest_3() {

        boolean isPalindrome = validPalindrome.isPalindrome( " " );
        Assert.assertTrue( isPalindrome );
    }


    @Test
    public void isPalindromeTest_4() {

        boolean isPalindrome = validPalindrome.isPalindrome( ".," );
        Assert.assertTrue( isPalindrome );
    }


    @Test
    public void isPalindromeTest_5() {

        boolean isPalindrome = validPalindrome.isPalindrome( "0P" );
        Assert.assertFalse( isPalindrome );
    }


    @Test
    public void isPalindromeTest_6() {

        boolean isPalindrome = validPalindrome.isPalindrome( "0z;z   ; 0" );
        Assert.assertTrue( isPalindrome );
    }


    @Test
    public void isPalindromeTest_7() {

        boolean isPalindrome = validPalindrome.isPalindrome( "!!!::vrTTr::v!!!" );
        Assert.assertTrue( isPalindrome );
    }
}
