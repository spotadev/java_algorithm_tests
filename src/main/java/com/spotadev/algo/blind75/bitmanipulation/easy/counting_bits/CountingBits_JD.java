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
package com.spotadev.algo.blind75.bitmanipulation.easy.counting_bits;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=RyBM56RIWrM
 * 
 * https://leetcode.com/problems/counting-bits/
 * 
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
 * ans[i] is the number of 1's in the binary representation of i.
 * 
 * Example 1:
 * 
 *     Input: n = 2
 *     Output: [0,1,1]
 * 
 *     Explanation:
 *         0 --> 0
 *         1 --> 1
 *         2 --> 10
 *
 * Example 2:
 * 
 *     Input: n = 5
 *     Output: [0,1,1,2,1,2]
 * 
 *     Explanation:
 *         0 --> 0
 *         1 --> 1
 *         2 --> 10
 *         3 --> 11
 *         4 --> 100
 *         5 --> 101
 * 
 * Constraints:
 * 
 *      0 <= n <= 105
 *  
 * Follow up:
 * 
 *      It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in 
 *      linear time O(n) and possibly in a single pass?
 *      
 *      Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 * 
 * @author John Dickerson - 19 May 2022
 */
public class CountingBits_JD implements CountingBitsAPI {

    @Override
    public int[] countBits( int n ) {

        return new int[] {};
    }
}
