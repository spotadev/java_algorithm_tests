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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.coin_change;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractCoinChangeTest {

    protected CoinChangeAPI coinChange;

    void coinChange() {

        int[] coins = {};
        int amount = -1;
        int change = coinChange.coinChange( coins, amount );
    }
}
