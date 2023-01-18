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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.palindromic_substrings;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractPalindromicSubstringsTest {

    protected PalindromicSubstringsAPI palindromicSubstrings;

    void countSubstringsTest() {

        String s = null;
        int count = palindromicSubstrings.countSubstrings( null );
    }
}
