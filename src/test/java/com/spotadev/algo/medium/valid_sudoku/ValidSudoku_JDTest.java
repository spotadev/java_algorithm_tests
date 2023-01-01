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
 * @author johndickerson - 30 Dec 2022
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
