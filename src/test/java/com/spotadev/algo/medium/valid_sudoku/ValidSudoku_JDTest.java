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
package com.spotadev.algo.medium.valid_sudoku;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class ValidSudoku_JDTest extends AbstractValidSudokuTest {

    @BeforeClass
    public void setUp() {

        validSudoku = new ValidSudoku();
    }


    @Test
    public void isValidSudokuTest_1() {

        super.isValidSudokuTest_1();
    }


    @Test
    public void isValidSudokuTest_2() {

        super.isValidSudokuTest_2();
    }


    @Test
    public void isValidSudokuTest_3() {

        super.isValidSudokuTest_3();
    }
}
