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
package com.spotadev.algo.blind75.one_d_dynamic_programming.easy.climbing_stairs;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=Y0lT9Fck7qI
 * 
 * https://leetcode.com/problems/climbing-stairs/
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Example 1:
 * 
 *     Input: n = 2
 *     Output: 2
 * 
 *      Explanation: There are two ways to climb to the top.
 * 
 *          1. 1 step + 1 step
 *          2. 2 steps
 * 
 * Example 2:
 * 
 *     Input: n = 3
 *     Output: 3
 * 
 *     Explanation: There are three ways to climb to the top.
 * 
 *          1. 1 step + 1 step + 1 step
 *          2. 1 step + 2 steps
 *          3. 2 steps + 1 step
 * 
 * 
 * Constraints:
 * 
 *      1 <= n <= 45
 *
 * @author John Dickerson - 13 May 2022
 */
public interface ClimbingStairsAPI {

    int climbStairs( int n );

}