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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;

import com.spotadev.algo.blind75.tries.hard.word_search_ii.WordSearchIIApi;

/**
 * @author John Dickerson - 8 Jun 2022
 */
public abstract class AbstractWordSearchIITest {

    protected WordSearchIIApi wordSearchII;

    public void findWordsTest_1() {

        char[][] board = new char[][] {
                { 'o', 'a', 'a', 'n' },
                { 'e', 't', 'a', 'e' },
                { 'i', 'h', 'k', 'r' },
                { 'i', 'f', 'l', 'v' } };

        String[] words = new String[] { "oath", "pea", "eat", "rain" };
        String[] expectedFoundWords = { "eat", "oath" };
        List<String> searchWords = wordSearchII.findWords( board, words );
        Assert.assertEquals( searchWords.size(), expectedFoundWords.length );

        Set<String> actual = new HashSet<>( searchWords );

        for ( String expectedWord : expectedFoundWords ) {

            if ( !actual.contains( expectedWord ) ) {

                Assert.fail( "Could not find " + expectedWord + " in actual" );
            }
        }
    }


    public void findWordsTest_2() {

        char[][] board = new char[][] {
                { 'a', 'b' },
                { 'c', 'd' }
        };

        String[] words = new String[] { "abcb" };
        String[] expectedFoundWords = {};
        List<String> searchWords = wordSearchII.findWords( board, words );
        Assert.assertEquals( searchWords.size(), expectedFoundWords.length );

        Set<String> actual = new HashSet<>( searchWords );

        for ( String expectedWord : expectedFoundWords ) {

            if ( !actual.contains( expectedWord ) ) {

                Assert.fail( "Could not find " + expectedWord + " in actual" );
            }
        }
    }


    public void findWordsTest_3() {

        char[][] board = new char[][] {
                { 'a' }
        };

        String[] words = new String[] { "a", };
        String[] expectedFoundWords = { "a" };
        List<String> searchWords = wordSearchII.findWords( board, words );
        Assert.assertEquals( searchWords.size(), expectedFoundWords.length );

        Set<String> actual = new HashSet<>( searchWords );

        for ( String expectedWord : expectedFoundWords ) {

            if ( !actual.contains( expectedWord ) ) {

                Assert.fail( "Could not find " + expectedWord + " in actual" );
            }
        }
    }


    public void findWordsTest_4() {

        char[][] board = new char[][] {
                { 'o', 'a', 'b', 'n' },
                { 'o', 't', 'a', 'e' },
                { 'a', 'h', 'k', 'r' },
                { 'a', 'f', 'l', 'v' }
        };

        String[] words = new String[] { "oa", "oaa" };
        String[] expectedFoundWords = { "oa", "oaa" };
        List<String> searchWords = wordSearchII.findWords( board, words );
        Assert.assertEquals( searchWords.size(), expectedFoundWords.length );

        Set<String> actual = new HashSet<>( searchWords );

        for ( String expectedWord : expectedFoundWords ) {

            if ( !actual.contains( expectedWord ) ) {

                Assert.fail( "Could not find " + expectedWord + " in actual" );
            }
        }
    }
}
