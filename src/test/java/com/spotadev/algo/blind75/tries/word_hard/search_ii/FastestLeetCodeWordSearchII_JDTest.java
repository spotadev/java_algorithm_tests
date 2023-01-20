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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.tries.hard.word_search_ii.WordSearchII_FastestLeetCode;

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
@Test
public class FastestLeetCodeWordSearchII_JDTest extends AbstractWordSearchIITest {

    @BeforeClass
    public void setUp() {

        wordSearchII = new WordSearchII_FastestLeetCode();
    }


    @Test
    public void findWordsTest_1() {

        super.findWordsTest_1();
    }


    @Test
    public void findWordsTest_2() {

        super.findWordsTest_2();
    }


    @Test
    public void findWordsTest_3() {

        super.findWordsTest_3();
    }


    @Test
    public void findWordsTest_4() {

        super.findWordsTest_4();
    }
}
