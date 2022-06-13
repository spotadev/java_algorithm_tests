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
package com.spotadev.algo.blind75.arraysandhashing.easy.valid_anagram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class ValidAnagram_JDTest extends AbstractValidAnagramTest {

    @BeforeClass
    public void setUp() {

        validAnagram = new ValidAnagram_JD();
    }


    @Test
    public void isAnagramTest_1() {

        super.isAnagramTest_1();
    }


    @Test
    public void isAnagramTest_2() {

        super.isAnagramTest_2();
    }
}
