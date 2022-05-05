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
package com.spotadev.algo.easy.lengthoflastword;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.easy.lengthoflastword.LengthOfLastWord;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class LenghOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord;

    @BeforeClass
    public void setUp() {

        lengthOfLastWord = new LengthOfLastWord();
    }


    @Test
    public void lengthOfLastWordTest_1() {

        String s = "Hello World";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 5 );
    }


    @Test
    public void lengthOfLastWordTest_2() {

        String s = "   fly me   to   the moon  ";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 4 );
    }


    @Test
    public void lengthOfLastWordTest_3() {

        String s = "luffy is still joyboy";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 6 );
    }


    @Test
    public void lengthOfLastWordTest_4() {

        String s = "b";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 1 );
    }

}
