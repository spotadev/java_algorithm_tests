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

import org.testng.Assert;

/**
 * @author John Dickerson - 1 May 2022
 */
public class AbstractValidSudokuTest {

    protected ValidSudoku validSudoku;

    void isValidSudokuTest_1() {

        boolean valid = validSudoku.isValidSudoku(
                new char[][] {
                        new char[] { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                        new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
                } );

        Assert.assertTrue( valid );
    }


    void isValidSudokuTest_2() {

        boolean valid = validSudoku.isValidSudoku(
                new char[][] {
                        new char[] { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                        new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
                } );

        Assert.assertFalse( valid );
    }


    void isValidSudokuTest_3() {

        boolean valid = validSudoku.isValidSudoku(
                new char[][] {
                        new char[] { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                        new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
                } );

        Assert.assertFalse( valid );
    }
}
