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

import com.spotadev.algo.blind75.tries.hard.word_search_ii.WordSearchIIAPI;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=asbcE9mZz_U
 * 
 * https://leetcode.com/problems/word-search-ii/
 * 
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * 
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent 
 * cells are horizontally or vertically neighboring. The same letter cell may not be used more 
 * than once in a word.
 * 
 * Example 1:
 * 
 *     Input: 
 *      
 *         o a a n
 *         w t a e
 *         i h k r
 *         i f l v 
 * 
 *         board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], 
 *         words = ["oath","pea","eat","rain"]
 *         
 *     Output: 
 * 
 *         ["eat","oath"]
 * 
 * Example 2:
 *  
 *     Input: 
 *     
 *         a b
 *         c d
 *     
 *         board = [["a","b"],["c","d"]], words = ["abcb"]
 *     
 *     Output: []
 *  
 * Constraints:
 * 
 *     m == board.length
 *     n == board[i].length
 *     1 <= m, n <= 12
 *     board[i][j] is a lowercase English letter.
 *     1 <= words.length <= 3 * 10^4 
 *     1 <= words[i].length <= 10
 *     words[i] consists of lowercase English letters.
 *     All the strings of words are unique.
 * 
 * @author John Dickerson - 8 Jun 2022
 */
public abstract class AbstractWordSearchIITest {

    protected WordSearchIIAPI wordSearchII;

    void findWordsTest_1() {

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


    void findWordsTest_2() {

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


    void findWordsTest_3() {

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


    void findWordsTest_4() {

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
