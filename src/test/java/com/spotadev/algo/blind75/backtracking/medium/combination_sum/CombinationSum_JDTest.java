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
package com.spotadev.algo.blind75.backtracking.medium.combination_sum;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class CombinationSum_JDTest extends AbstractCombinationSumTest {

    @BeforeClass
    public void setUp() {

        combinationSum = new CombinationSum_JD();
    }


    @Test
    public void combinationSumTest_1() {

        super.combinationSumTest_1();

    }


    @Test
    public void combinationSumTest_2() {

        super.combinationSumTest_2();
    }


    @Test
    public void combinationSumTest_3() {

        super.combinationSumTest_3();
    }
}
