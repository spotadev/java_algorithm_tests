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
package com.spotadev.algo.blind75.slidingwindow.easy.best_time_to_buy_and_sell_stock;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.slidingwindow.easy.best_time_to_buy_and_sell_stock.BestTimeToBuyAndSellStock_JD;

/**
 * @author John Dickerson - 3 May 2022
 */
public class BestTimeToBuyAndSellStock_JDTest {

    private BestTimeToBuyAndSellStockAPI bestTimeToBuyAndSellStock;

    @BeforeClass
    public void setUp() {

        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock_JD();
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