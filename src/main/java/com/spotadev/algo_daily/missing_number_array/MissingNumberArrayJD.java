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
package com.spotadev.algo_daily.missing_number_array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://algodaily.com/challenges/find-missing-number-in-array
 * 
 * Given an array of continuous numbers that should increment sequentially by 1, 
 * 
 *      e.g. [1, 2, 3, 4, 5, 6]
 * 
 * However there are some missing numbers.
 * 
 *      [1, 2, 4, 6, 7]
 * 
 * Write a method missingNumbers that takes an array of continuous variables and returns the 
 * missing integers
 *
 * Example 1
 * =========
 * 
 *     input: [1, 2, 4, 6, 8] --> output: [3, 5, 7]
 *
 * Constraints
 * ===========
 * 
 *      Length of the array <= 100000
 * 
 *      Array will always contain non-negative integers excluding zero
 * 
 *      Time Complexity: O(n)
 * 
 *      Space Complexity: O(1)
 *      
 * @author John Dickerson - 3 Jan 2023
 */
public class MissingNumberArrayJD implements MissingNumberArrayAPI {

    @Override
    public List<Integer> missingNumber( int[] nums ) {

        List<Integer> missingNumbers = new ArrayList<>();
        int lastNumber = nums[0];

        for ( int i = 1; i < nums.length; i++ ) {

            int currentNumber = nums[i];

            for ( int j = lastNumber + 1; j < currentNumber; j++ ) {

                missingNumbers.add( j );
            }

            lastNumber = currentNumber;
        }

        return missingNumbers;
    }
}
