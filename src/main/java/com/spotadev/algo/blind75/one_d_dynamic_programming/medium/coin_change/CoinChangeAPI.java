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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=H9bfqozjoqs
 * 
 * https://leetcode.com/problems/coin-change/
 * 
 * You are given an integer array coins representing coins of different denominations and an 
 * integer amount representing a total amount of money.
 * 
 * Return the fewest number of coins that you need to make up that amount. If that amount of 
 * money cannot be made up by any combination of the coins, return -1.
 * 
 * You may assume that you have an infinite number of each kind of coin.
 * 
 * Example 1:
 * 
 *     Input: coins = [1,2,5], amount = 11
 *     Output: 3
 *     Explanation: 11 = 5 + 5 + 1
 * 
 * Example 2:
 * 
 *     Input: coins = [2], amount = 3
 *     Output: -1
 * 
 * Example 3:
 * 
 *     Input: coins = [1], amount = 0
 *     Output: 0
 *  
 * Constraints:
 * 
 *     1 <= coins.length <= 12
 *     1 <= coins[i] <= 231 - 1
 *     0 <= amount <= 104
 * 
 * @author John Dickerson - 13 May 2022
 */
public interface CoinChangeAPI {

    int coinChange( int[] coins, int amount );

}