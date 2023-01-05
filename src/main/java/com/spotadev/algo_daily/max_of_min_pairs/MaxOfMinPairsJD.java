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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
public class MaxOfMinPairsJD implements MaxOfMinPairsAPI {

    // To get the max of mins we need a pair to have a big number as its minimum.
    // i.e. we need to group big and similar numbers together as much as possible
    // So we could start by sorting the numbers and then pairing them
    @Override
    public int maxOfMinPairs( int[] nums ) {

        // A sort is O(n log n)
        // Then we need to iterate through the pairs and do the calculation

        List<Integer> integers = new ArrayList<>();

        for ( int num : nums ) {

            integers.add( num );
        }

        Collections.sort( integers );
        int sum = 0;

        for ( int i = 0; i < integers.size(); i = i + 2 ) {

            sum = sum + Math.min( integers.get( i ), integers.get( i + 1 ) );
        }

        return sum;
    }
}
