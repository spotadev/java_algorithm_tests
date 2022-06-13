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
 *     Runtime: 248 ms, faster than 20.84% of Java online submissions for Word Search.
 * 
 *     Memory Usage: 117.3 MB, less than 15.62% of Java online submissions for Word Search.
 * 
 * Given an m x n grid of characters board and a string word, return true if word exists in the 
 * grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
 * are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * Example 1:
 * 
 *     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 *     Output: true
 * 
 * Example 2:
 * 
 *     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 *     Output: true
 * 
 * Example 3:
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
public class WordSearch_JD implements WordSearchApi {

    boolean findWord( int row, int column, String word, char[][] board,
            int numberRows, int numberColumns, boolean[][] usedCoordinates ) {

        if ( usedCoordinates[row][column] ) {

            return false;
        }

        if ( board[row][column] == word.charAt( 0 ) ) {

            // System.out.println(
            //         "Found " + word.substring( 0, 1 ) + " at " + row + " : " + column );

            usedCoordinates[row][column] = true;

            if ( word.length() == 1 ) {

                return true;
            }

            String newWord = word.substring( 1 );
            boolean foundNorth = false, foundSouth = false, foundWest = false, foundEast = false;

            // go north
            if ( row > 0 ) {

                foundNorth = findWord( row - 1, column, newWord, board, numberRows, numberColumns,
                        usedCoordinates );
            }

            // go south
            if ( row < ( numberRows - 1 ) ) {

                foundSouth = findWord( row + 1, column, newWord, board, numberRows, numberColumns,
                        usedCoordinates );
            }

            // go west
            if ( column > 0 ) {

                foundWest =
                        findWord( row, column - 1, newWord, board, numberRows, numberColumns,
                                usedCoordinates );
            }

            // go east
            if ( column < ( numberColumns - 1 ) ) {

                foundEast = findWord( row, column + 1, newWord, board, numberRows, numberColumns,
                        usedCoordinates );
            }

            boolean found = foundNorth || foundSouth || foundWest || foundEast;
            usedCoordinates[row][column] = false;
            return found;
        }

        return false;
    }


    public boolean exist( char[][] board, String word ) {

        int numberRows = board.length;
        int numberColumns = board[0].length;
        boolean[][] usedCoordinates = new boolean[numberRows][numberColumns];

        if ( word == null || word.length() == 0 ) {
            return true;
        }

        for ( int row = 0; row < board.length; row++ ) {

            for ( int column = 0; column < board[0].length; column++ ) {

                // System.out.println( row + " : " + column );

                boolean found =
                        findWord( row, column, word, board, numberRows, numberColumns,
                                usedCoordinates );

                if ( found ) {

                    return true;
                }
            }
        }

        return false;
    }
}
