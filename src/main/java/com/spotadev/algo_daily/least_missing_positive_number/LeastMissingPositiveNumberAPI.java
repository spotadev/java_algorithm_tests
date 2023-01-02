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
package com.spotadev.algo_daily.least_missing_positive_number;

/**
 * https://algodaily.com/challenges/least-missing-positive-number/info-screen-A1NXHBmDNI4
 * 
 * Given an unsorted array of integers, 
 * 
 *     e.g. [0, 3, -1, -2, 1], 
 *
 * Find the least missing positive number.
 * 
 *     [0, 3, -1, -2, 1] => [-2, -1, 0, 1, 3]
 *     
 * We can see that the positive numbers are 0, 1, 3 and that the least missing positive number is 2
 *
 * @author Karema99 - 29 Aug 2022
 */
public interface LeastMissingPositiveNumberAPI {

    int leastMissingPositive( int[] nums );
}
