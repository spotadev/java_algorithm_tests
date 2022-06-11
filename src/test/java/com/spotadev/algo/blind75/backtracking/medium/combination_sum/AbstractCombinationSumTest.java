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

import org.testng.Assert;

/**
 * @author John Dickerson - 11 Jun 2022
 */
public abstract class AbstractCombinationSumTest {

    protected CombinationSumAPI combinationSum;

    public void combinationSumTest_1() {

        int[] candidates = new int[] { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> sum = combinationSum.combinationSum( candidates, target );
        Assert.assertEquals( sum.get( 0 ).get( 0 ).intValue(), 2 );
        Assert.assertEquals( sum.get( 0 ).get( 1 ).intValue(), 2 );
        Assert.assertEquals( sum.get( 0 ).get( 2 ).intValue(), 3 );
        Assert.assertEquals( sum.get( 1 ).get( 0 ).intValue(), 7 );

    }


    public void combinationSumTest_2() {

        int[] candidates = new int[] { 2, 3, 5 };
        int target = 8;
        List<List<Integer>> sum = combinationSum.combinationSum( candidates, target );
        Assert.assertEquals( sum.get( 0 ).get( 0 ).intValue(), 2 );
        Assert.assertEquals( sum.get( 0 ).get( 1 ).intValue(), 2 );
        Assert.assertEquals( sum.get( 0 ).get( 2 ).intValue(), 2 );
        Assert.assertEquals( sum.get( 0 ).get( 3 ).intValue(), 2 );

        Assert.assertEquals( sum.get( 1 ).get( 0 ).intValue(), 2 );
        Assert.assertEquals( sum.get( 1 ).get( 1 ).intValue(), 3 );
        Assert.assertEquals( sum.get( 1 ).get( 2 ).intValue(), 3 );

        Assert.assertEquals( sum.get( 2 ).get( 0 ).intValue(), 3 );
        Assert.assertEquals( sum.get( 2 ).get( 1 ).intValue(), 5 );
    }


    public void combinationSumTest_3() {

        int[] candidates = new int[] { 2 };
        int target = 1;
        List<List<Integer>> sum = combinationSum.combinationSum( candidates, target );
        Assert.assertEquals( sum.size(), 0 );
    }

}
