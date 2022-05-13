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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.word_break;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 14 May 2022
 */
public class WordBreakTest {

    private WordBreak wordBreak;

    @BeforeClass
    public void setUp() {

        wordBreak = new WordBreak();
    }


    @Test
    public void wordBreakTest() {

        String s = null;
        List<String> wordDic = null;
        boolean resuly = wordBreak.wordBreak( s, wordDic );
    }
}
