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
public class OptimisedWordSearch_JD implements WordSearchAPI {

    // this is called pruning - it is reducing data that needs traversing
    private boolean failedEasyCases( int[] freqCountBoard, int[] freqCountWord,
            int numberRows, int numberColumns, char[][] board, String word ) {

        for ( int row = 0; row < numberRows; row++ ) {

            for ( int column = 0; column < numberColumns; column++ ) {

                char c = board[row][column];
                freqCountBoard[c - 'A']++;
            }
        }

        for ( char c : word.toCharArray() ) {

            freqCountWord[c - 'A']++;
        }

        for ( int c : word.toCharArray() ) {

            if ( freqCountBoard[c - 'A'] < freqCountWord[c - 'A'] ) {

                return true;
            }
        }

        return false;
    }


    // this is an optimisation - it could be easier to read the word backwards - also a form of 
    // pruning
    private String rotateWordIfMakesSense(
            String word, int[] freqCountBoard, int[] freqCountWord ) {

        int startChar = word.charAt( 0 );
        int endChar = word.charAt( word.length() - 1 );

        if ( freqCountBoard[endChar - 'A'] < freqCountBoard[startChar - 'A'] ) {
            char[] chars = word.toCharArray();

            char temp;
            int startIndex = 0;
            int endIndex = word.length() - 1;

            while ( startIndex < endIndex ) {

                temp = chars[startIndex];
                chars[startIndex] = chars[endIndex];
                chars[endIndex] = temp;
                startIndex++;
                endIndex--;
            }

            return new String( chars );
        }

        return word;
    }


    private boolean depthFirstSearch( int row, int column, String word, char[][] board,
            int numberRows, int numberColumns ) {

        if ( row < 0 || row == numberRows || column < 0 || column == numberColumns )
            return false;

        if ( board[row][column] == '$' ) {

            return false;
        }

        if ( board[row][column] == word.charAt( 0 ) ) {

            char c = board[row][column];
            board[row][column] = '$';

            if ( word.length() == 1 ) {

                return true;
            }

            String newWord = word.substring( 1 );

            boolean foundNorth =
                    depthFirstSearch( row - 1, column, newWord, board, numberRows, numberColumns );

            boolean foundSouth =
                    depthFirstSearch( row + 1, column, newWord, board, numberRows, numberColumns );

            boolean foundWest =
                    depthFirstSearch( row, column - 1, newWord, board, numberRows, numberColumns );

            boolean foundEast =
                    depthFirstSearch( row, column + 1, newWord, board, numberRows, numberColumns );

            boolean found = foundNorth || foundSouth || foundWest || foundEast;

            board[row][column] = c;

            if ( found )
                return true;

        }

        return false;
    }


    public boolean exist( char[][] board, String word ) {

        int numberRows = board.length;
        int numberColumns = board[0].length;

        if ( word == null || word.length() == 0 ) {

            return true;
        }

        int numberSlots = ( int )'z' - ( int )'A';
        int[] freqCountBoard = new int[numberSlots + 1];
        int[] freqCountWord = new int[numberSlots + 1];

        if ( failedEasyCases( freqCountBoard, freqCountWord, numberRows, numberColumns, board,
                word ) )
            return false;

        word = rotateWordIfMakesSense( word, freqCountBoard, freqCountWord );

        for ( int row = 0; row < numberRows; row++ ) {

            for ( int column = 0; column < numberColumns; column++ ) {

                // System.out.println( row + " : " + column );

                boolean found = depthFirstSearch(
                        row, column, word, board, numberRows, numberColumns );

                if ( found )
                    return true;
            }
        }

        return false;
    }


    /**
     * a 97
     * z 122
     * A 65
     * Z 90
     */
    public static void main( String[] args ) {

        System.out.println( "a " + ( int )'a' );
        System.out.println( "z " + ( int )'z' );
        System.out.println( "A " + ( int )'A' );
        System.out.println( "Z " + ( int )'Z' );
    }
}
