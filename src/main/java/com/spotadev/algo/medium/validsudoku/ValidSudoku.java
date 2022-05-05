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
package com.spotadev.algo.medium.validsudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 * 
 *     Runtime: 8 ms, faster than 43.02% of Java online submissions for Valid Sudoku.
 *     Memory Usage: 48.7 MB, less than 10.11% of Java online submissions for Valid Sudoku.
 * 
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according 
 * to the following rules:
 * 
 *     Each row must contain the digits 1-9 without repetition.
 *     Each column must contain the digits 1-9 without repetition.
 *     Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * 
 * Note:
 * 
 *     A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 *     Only the filled cells need to be validated according to the mentioned rules.
 *     
 * Example 1:
 * 
 * Input: board = 
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: board = 
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * 
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. 
 * Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 *  
 * Constraints:
 * 
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 * 
 * @author John Dickerson - 1 May 2022
 */
public class ValidSudoku {

    private static Set<Character> validCharacters = new HashSet<>();

    static {
        validCharacters.add( '1' );
        validCharacters.add( '2' );
        validCharacters.add( '3' );
        validCharacters.add( '4' );
        validCharacters.add( '5' );
        validCharacters.add( '6' );
        validCharacters.add( '7' );
        validCharacters.add( '8' );
        validCharacters.add( '9' );
    }

    private boolean validCharacter( char character, Set<Character> set ) {

        if ( character == '.' ) {

            return true;
        }

        if ( !validCharacters.contains( character ) ) {

            return false;
        }

        boolean contains = set.contains( character );

        if ( contains ) {

            return false;
        }
        else {

            set.add( character );
        }

        return true;
    }


    private boolean validRow( int rowIndex, int colIndex, char[][] board,
            List<Set<Character>> rows ) {

        return validCharacter( board[rowIndex][colIndex], rows.get( rowIndex ) );
    }


    private boolean validColumn( int rowIndex, int colIndex, char[][] board,
            List<Set<Character>> columns ) {

        return validCharacter( board[rowIndex][colIndex], columns.get( colIndex ) );
    }


    private boolean validSquare( int rowIndex, int colIndex, char[][] board, List<Set<
            Character>> squares ) {

        if ( rowIndex < 3 ) {

            if ( colIndex < 3 ) {

                return validCharacter( board[rowIndex][colIndex], squares.get( 0 ) );
            }
            else if ( colIndex < 6 ) {

                return validCharacter( board[rowIndex][colIndex], squares.get( 1 ) );
            }
            else {

                return validCharacter( board[rowIndex][colIndex], squares.get( 2 ) );
            }
        }
        else if ( rowIndex < 6 ) {

            if ( colIndex < 3 ) {

                return validCharacter( board[rowIndex][colIndex], squares.get( 3 ) );
            }
            else if ( colIndex < 6 ) {

                return validCharacter( board[rowIndex][colIndex], squares.get( 4 ) );
            }
            else {

                return validCharacter( board[rowIndex][colIndex], squares.get( 5 ) );
            }
        }
        else {

            if ( colIndex < 3 ) {

                return validCharacter( board[rowIndex][colIndex], squares.get( 6 ) );
            }
            else if ( colIndex < 6 ) {

                return validCharacter( board[rowIndex][colIndex], squares.get( 7 ) );
            }
            else {

                return validCharacter( board[rowIndex][colIndex], squares.get( 8 ) );
            }
        }
    }


    public boolean isValidSudoku( char[][] board ) {

        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> columns = new ArrayList<>();
        List<Set<Character>> squares = new ArrayList<>();

        for ( int i = 0; i < 9; i++ ) {

            rows.add( new HashSet<>() );
            columns.add( new HashSet<>() );
            squares.add( new HashSet<>() );
        }

        for ( int rowIndex = 0; rowIndex < 9; rowIndex++ ) {

            for ( int colIndex = 0; colIndex < 9; colIndex++ ) {

                if ( !validRow( rowIndex, colIndex, board, rows ) ) {

                    return false;
                }

                if ( !validColumn( rowIndex, colIndex, board, columns ) ) {

                    return false;
                }

                if ( !validSquare( rowIndex, colIndex, board, squares ) ) {

                    return false;
                }
            }
        }

        return true;
    }
}
