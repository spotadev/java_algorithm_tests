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

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=1pkOgXD63yU
 * 
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 *     Runtime: 2 ms, faster than 84.21% of Java online submissions for Best Time to Buy and Sell 
 *     Stock.
 *     
 *     Memory Usage: 59.3 MB, less than 75.41% of Java online submissions for Best Time to Buy and 
 *     Sell Stock.
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a 
 * different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any 
 * profit, return 0.
 * 
 * Example 1:
 * 
 *     Input: prices = [7,1,5,3,6,4]
 *     Output: 5
 *     Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *     Note that buying on day 2 and selling on day 1 is not allowed because you must buy before 
 *     you sell.
 * 
 * Example 2:
 * 
 *     Input: prices = [7,6,4,3,1]
 *     Output: 0
 *     Explanation: In this case, no transactions are done and the max profit = 0.
 *  
 * Constraints:
 * 
 *     1 <= prices.length <= 10^5
 *     0 <= prices[i] <= 10^4
 *     
 * JD Note:  
 * 
 *     See Video:
 *     
 *         https://www.youtube.com/watch?v=1pkOgXD63yU
 * 
 * @author John Dickerson - 3 May 2022
 */
public interface BestTimeToBuyAndSellStockAPI {

    int maxProfit( int[] prices );

}