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
package com.spotadev.algo.easy.length_of_last_word;

import org.testng.Assert;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public abstract class AbstractLenghOfLastWordTest {

    protected LengthOflastWordAPI lengthOfLastWord;

    public void lengthOfLastWordTest_1() {

        String s = "Hello World";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 5 );
    }


    public void lengthOfLastWordTest_2() {

        String s = "   fly me   to   the moon  ";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 4 );
    }


    public void lengthOfLastWordTest_3() {

        String s = "luffy is still joyboy";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 6 );
    }


    public void lengthOfLastWordTest_4() {

        String s = "b";
        int length = lengthOfLastWord.lengthOfLastWord( s );
        Assert.assertEquals( length, 1 );
    }
}
