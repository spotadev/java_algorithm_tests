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

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class CombinationSumTest {

    private CombinationSum combinationSum;

    @BeforeClass
    public void setUp() {

        combinationSum = new CombinationSum();
    }


    @Test
    public void combinationSumTest() {

        int[] candidates = new int[] {};
        int target = -1;
        List<List<Integer>> sum = combinationSum.combinationSum( candidates, 0 );
    }
}
