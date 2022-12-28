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
package com.spotadev.algo_daily.sum_all_primes;

/**
 * https://algodaily.com/challenges/sum-all-primes
 * 
 * Given a number n, write a method, sumOfAllPrimes that  finds prime numbers smaller than or 
 * equal to n, and returns the sum of them.
 *
 * Examples
 * 
 *     11 -> [2, 3, 5, 7, 11] --> output --> 28
 * 
 *     15 -> [2, 3, 5, 11, 13] --> output --> 41
 * 
 *     17 -> [2, 3, 5, 7, 11, 13, 17] --> output --> 58
 *
 * Constraints
 * 
 *     n is always a non-zero positive integer
 * 
 *     Time Complexity: O(n log n)
 * 
 *     Space Complexity: O(n)
 *     
 * @author Karema99 - 29 Aug 2022
 */

public interface SumAllPrimesAPI {

    int sumOfAllPrimes( int n );
}
