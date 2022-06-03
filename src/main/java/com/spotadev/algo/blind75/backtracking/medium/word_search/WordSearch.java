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

import java.util.HashSet;
import java.util.Set;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=pfiQ_PS1g8E
 * 
 * https://leetcode.com/problems/word-search/
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
public class WordSearch {

    class Coordinate {

        private int row;
        private int column;

        Coordinate( int row, int column ) {

            this.row = row;
            this.column = column;
        }


        @Override
        public String toString() {

            return "Coordinate [row=" + row + ", column=" + column + "]";
        }


        @Override
        public int hashCode() {

            final int prime = 31;
            int result = 1;
            result = prime * result + column;
            result = prime * result + row;
            return result;
        }


        @Override
        public boolean equals( Object obj ) {

            if ( this == obj )
                return true;
            if ( obj == null )
                return false;
            if ( getClass() != obj.getClass() )
                return false;
            Coordinate other = ( Coordinate )obj;
            if ( column != other.column )
                return false;
            if ( row != other.row )
                return false;
            return true;
        }
    }

    boolean findWord( int row, int column, String word, char[][] board,
            int numberRows, int numberColumns, Set<Coordinate> usedCoordinates ) {

        Coordinate coordinate = new Coordinate( row, column );

        if ( usedCoordinates.contains( coordinate ) ) {

            return false;
        }

        usedCoordinates.add( coordinate );

        if ( board[row][column] == word.charAt( 0 ) ) {

            if ( word.length() == 1 ) {

                return true;
            }

            String newWord = word.substring( 1 );

            // go north
            if ( row > 0 ) {

                boolean foundNorth = findWord( row - 1, column, newWord, board,
                        numberRows, numberColumns, usedCoordinates );

                if ( foundNorth )
                    return true;
            }

            // go south
            if ( row < ( numberRows - 1 ) ) {

                boolean foundSouth = findWord( row + 1, column, newWord, board,
                        numberRows, numberColumns, usedCoordinates );

                if ( foundSouth )
                    return true;
            }

            // go west
            if ( column > 0 ) {

                boolean foundWest =
                        findWord( row, column - 1, newWord, board,
                                numberRows, numberColumns, usedCoordinates );

                if ( foundWest )
                    return true;
            }

            // go east
            if ( column < ( numberColumns - 1 ) ) {

                boolean foundEast = findWord( row, column + 1, newWord, board,
                        numberRows, numberColumns, usedCoordinates );

                if ( foundEast )
                    return true;
            }
        }

        return false;
    }


    public boolean exist( char[][] board, String word ) {

        int numberRows = board.length;
        int numberColumns = board[0].length;
        Set<Coordinate> usedCoordinates = new HashSet<>();

        if ( word == null || word.length() == 0 ) {
            return true;
        }

        for ( int row = 0; row < board.length; row++ ) {

            for ( int column = 0; column < board[0].length; column++ ) {

                usedCoordinates.clear();

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
