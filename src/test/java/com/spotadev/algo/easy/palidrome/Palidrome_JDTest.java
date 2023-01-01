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
package com.spotadev.algo.easy.palidrome;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Palidrome_JDTest extends AbstractPalidromeTest {

    @BeforeClass
    public void setUp() {

        palidrome = new Palidrome_JD();
    }


    @Test
    public void isPalindromeTest_1() {

        super.isPalindromeTest_1();
    }


    @Test
    public void isPalindromeTest_2() {

        super.isPalindromeTest_2();
    }


    @Test
    public void isPalindromeTest_3() {

        super.isPalindromeTest_3();
    }
}
