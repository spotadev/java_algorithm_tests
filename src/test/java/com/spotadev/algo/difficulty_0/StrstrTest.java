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
package com.spotadev.algo.difficulty_0;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.difficulty_0.strstr.Strstr;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class StrstrTest {

    private Strstr strstr;

    @BeforeClass
    public void setUp() {

        strstr = new Strstr();
    }


    @Test
    public void strStrTest_1() {

        String haystack = "hello";
        String needle = "ll";
        int index = strstr.strStr( haystack, needle );
        Assert.assertEquals( index, 2 );
    }


    @Test
    public void strStrTest_2() {

        String haystack = "aaa";
        String needle = "aaaa";
        int index = strstr.strStr( haystack, needle );
        Assert.assertEquals( index, -1 );
    }


    @Test
    public void strStrTest_3() {

        String haystack = "mississippi";
        String needle = "issipi";
        int index = strstr.strStr( haystack, needle );
        Assert.assertEquals( index, -1 );
    }
}
