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
package com.spotadev.algo.blind75.slidingwindow.easy.besttimetobuyandsellstock;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.slidingwindow.easy.besttimetobuyandsellstock.BestTimeToBuyAndSellStock;

/**
 * @author John Dickerson - 3 May 2022
 */
public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeClass
    public void setUp() {

        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }


    @Test
    public void maxProfitTest_1() {

        int profit = bestTimeToBuyAndSellStock.maxProfit( new int[] { 7, 1, 5, 3, 6, 4 } );
        Assert.assertEquals( profit, 5 );
    }


    @Test
    public void maxProfitTest_2() {

        int profit = bestTimeToBuyAndSellStock.maxProfit( new int[] { 7, 6, 4, 3, 1 } );
        Assert.assertEquals( profit, 0 );
    }
}
