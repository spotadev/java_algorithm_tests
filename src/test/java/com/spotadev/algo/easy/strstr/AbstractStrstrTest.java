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
package com.spotadev.algo.easy.strstr;

import org.testng.Assert;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class AbstractStrstrTest {

    protected StrstrAPI strstr;

    void strStrTest_1() {

        String haystack = "hello";
        String needle = "ll";
        int index = strstr.strStr( haystack, needle );
        Assert.assertEquals( index, 2 );
    }


    void strStrTest_2() {

        String haystack = "aaa";
        String needle = "aaaa";
        int index = strstr.strStr( haystack, needle );
        Assert.assertEquals( index, -1 );
    }


    void strStrTest_3() {

        String haystack = "mississippi";
        String needle = "issipi";
        int index = strstr.strStr( haystack, needle );
        Assert.assertEquals( index, -1 );
    }
}
