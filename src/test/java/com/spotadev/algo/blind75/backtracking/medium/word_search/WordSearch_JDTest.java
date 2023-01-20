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
package com.spotadev.algo.blind75.backtracking.medium.word_search;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=pfiQ_PS1g8E
 * 
 * https://leetcode.com/problems/word-search/
 * 
 *     Runtime: 1 ms, faster than 100.00% of Java online submissions for Word Search.
 *     Memory Usage: 42 MB, less than 64.62% of Java online submissions for Word Search.
 * 
 * Given an m x n grid of characters board and a string word, return true if word exists in the 
 * grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
 * are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * Example 1:
 *     
 *     ["A","B","C","E"]
 *     ["S","F","C","S"]
 *     ["A","D","E","E"]             
 * 
 *     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 *     Output: true
 * 
 * Example 2:
 * 
 *     ["A","B","C","E"]
 *     ["S","F","C","S"]
 *     ["S","F","C","S"]
 *     ["A","D","E","E"]
 *     
 *     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 *     Output: true
 * 
 * Example 3:
 * 
 *     ["A","B","C","E"],
 *     ["S","F","C","S"]
 *     ["A","D","E","E"]
 *     
 *     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 *     Output: false
 * 
 * Constraints:
 * 
 *     m == board.length
 *     n = board[i].length
 *     1 <= m, n <= 6
 *     1 <= word.length <= 15
 *     board and word consists of only lowercase and uppercase English letters.
 * 
 *  Follow up: Could you use search pruning to make your solution faster with a larger board?
 *    
 * @author John Dickerson - 9 Jun 2022
 */
public class WordSearch_JDTest extends AbstractWordSearchTest {

    @BeforeClass
    public void setUp() {

        wordSearch = new WordSearch_JD();
    }


    @Test
    public void existTest_1() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCCED";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }


    @Test
    public void existTest_2() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "SEE";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }


    @Test
    public void existTest_3() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCB";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertFalse( exist );
    }


    @Test
    public void existTest_4() {

        char[][] board = new char[][] {

                { 'A', 'B' },
                { 'C', 'D' }
        };

        String word = "CDBA";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }


    @Test
    public void existTest_5() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'E', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCESEEEFS";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }
}
