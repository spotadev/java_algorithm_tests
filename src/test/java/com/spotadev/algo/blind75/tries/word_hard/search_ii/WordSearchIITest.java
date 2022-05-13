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
package com.spotadev.algo.blind75.tries.word_hard.search_ii;

import java.util.List;

import org.testng.annotations.Test;

import com.spotadev.algo.blind75.tries.hard.word_search_ii.WordSearchII;

/**
 * @author John Dickerson - 13 May 2022
 */
public class WordSearchIITest {

    private WordSearchII wordSearchII;

    public void setUp() {

        wordSearchII = new WordSearchII();
    }


    @Test
    public void findWordsTest() {

        char[][] board = new char[][] {};
        String[] words = new String[] {};
        List<String> searchWords = wordSearchII.findWords( board, words );
    }
}
