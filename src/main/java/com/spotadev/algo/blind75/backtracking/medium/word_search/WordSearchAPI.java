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
 * @author John Dickerson - 13 May 2022
 */
public interface WordSearchAPI {

    boolean exist( char[][] board, String word );
}
