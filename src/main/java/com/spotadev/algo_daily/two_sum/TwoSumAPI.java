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
package com.spotadev.algo_daily.two_sum;

/**
 * https://algodaily.com/challenges/two-sum
 * 
 * Given an array of integers, return the indices of the two numbers that add up to a specific 
 * given target number.
 * 
 * Given an array e.g. [1, 3, 6, 7, 9] and a target number say 10. Two numbers that add up to ten 
 * in the array and their indices respectively are [1 and 9] at indices 0 and 5.
 *
 * Examples
 * ========
 * 
 *     [2, 3, 4, 5, 5] target = 7 --> numbers: 2 and 5, indices: 0 and 4
 * 
 *     [1, 3, 5, 6, 2] target = 8 --> numbers: 5 and 3, indices: 1 and 2
 * 
 *     [2, 3, 6, 8, 9] target = 9 --> numbers: 6 and 3, indices: 0 and 1
 * 
 *     [9, 2, 4, 5, 6] target = 14 --> numbers: 5 and 9, indices: 0 and 4
 *
 * Constraints
 * ===========
 * 
 *     Length of the array <= 1000000
 * 
 *     Values of the array between -1000000000 and 10000000000
 * 
 *     The array can be empty
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(n)
 *     
 * @author Karema99 - 29 Aug 2022
 */
public interface TwoSumAPI {

    int[] twoSum( int[] arr, int goal );
}
