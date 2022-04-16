/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_0.palidrome;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 16 Apr 2022
 */
public class PalidromeTest {

    private Palidrome palidrome;

    @BeforeClass
    public void setUp() {

        palidrome = new Palidrome();
    }


    @Test
    public void isPalindromeTest_1() {

        boolean isPalidrome = palidrome.isPalindrome( 121 );
        Assert.assertTrue( isPalidrome );
    }


    @Test
    public void isPalindromeTest_2() {

        boolean isPalidrome = palidrome.isPalindrome( -121 );
        Assert.assertFalse( isPalidrome );
    }


    @Test
    public void isPalindromeTest_3() {

        boolean isPalidrome = palidrome.isPalindrome( 10 );
        Assert.assertFalse( isPalidrome );
    }
}
