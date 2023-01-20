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
package com.spotadev.algo_daily.max_of_min_pairs;

import static org.testng.Assert.assertEquals;

/**
 * https://algodaily.com/challenges/max-of-min-pairs
 * 
 * Given an array of length 2*n (even length), that consists of random numbers,
 * 
 *     e.g [1, 3, 2, 6, 5, 4]
 * 
 * Create pairs out of these integers e.g. --> [[1, 3], [2, 6], [5, 4]]
 *
 * Divide the pairs such that the sum of the smaller integers is maximized?
 *
 *
 * Example
 * =======
 * 
 *     Input [3, 4, 2, 5] --> 6
 *     maximum sum of pairs is 6 = min(2, 3) + min(4, 5)
 *     
 *     min(3,4) + min(2,5) = 3 + 2 = 5 which is less than 6 so we do above instead.
 *     
 *     min(3,5) + min(4,2) = 3 + 2 = 5 which is less than 6 so we do above instead.
 *
 * Negative numbers may also be included
 *
 * Constraints
 * ===========
 * 
 *     Length of array <= 1000000
 * 
 *     Values range between -1000 and 1000
 *  
 *     Final answer will always be an integer value
 *
 *     Time Complexity: O (n log n)
 *  
 *     Space Complexity: O(1
 *      
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractMaxOfMinPairsTest {

    protected MaxOfMinPairsAPI maxOfMinPairs;

    void smallArrayTest() {

        int[] numbers = { 3, 4, 2, 5 };
        int result = maxOfMinPairs.maxOfMinPairs( numbers );

        // min(2,3 ) + min( 4, 5 ) = 2 + 4 = 6
        assertEquals( result, 6 );
    }


    void largeArrayTest() {

        int[] numbers = { 1, 3, 2, 6, 5, 4 };
        int result = maxOfMinPairs.maxOfMinPairs( numbers );

        // min( 1, 2 ) + min( 3, 4 ) + min( 5, 6 ) = 1 + 3 + 5 = 9
        assertEquals( result, 9 );
    }
}
