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
package com.spotadev.algo.easy.roman_to_integer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author johndickerson - 30 Dec 2022
 */
public class RomanToInteger_JDTest extends AbstractRomanToIntegerTest {

    @BeforeClass
    public void setUp() {

        romanToInteger = new RomanToIntegerJD();
    }


    @Test
    public void romanToIntTest_1() {

        super.romanToIntTest_1();
    }


    @Test
    public void romanToIntTest_2() {

        super.romanToIntTest_2();
    }


    @Test
    public void romanToIntTest_3() {

        super.romanToIntTest_3();
    }
}
