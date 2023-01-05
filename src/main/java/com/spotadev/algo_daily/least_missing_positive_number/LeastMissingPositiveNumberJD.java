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
 * Constraints
 * 
 *     Length of the array <= 100000
 *     
 *     The array can be empty
 *     
 *     The array will contain values between -100000 and 100000
 *     
 *     The final answer will always fit in the integer range
 *     
 *     Expected time complexity : O(n)
 *     
 *     Expected space complexity : O(1)
 *
 * @author John Dickerson - 2 Jan 2023
 */
public class LeastMissingPositiveNumberJD implements LeastMissingPositiveNumberAPI {

    private void swap( int[] nums, int index, int index2 ) {

        int temp = nums[index];
        nums[index] = nums[index2];
        nums[index2] = temp;
    }


    // We cannot use an array of size n as space complexity is O(1).  This means we need to reuse
    // the array and shuffle numbers about.
    @Override
    public int leastMissingPositive( int[] nums ) {

        for ( int i = 0; i < nums.length; i++ ) {

            int value = nums[i];

            if ( value > -1 ) {

                if ( nums[value] != value ) {

                    swap( nums, i, value );
                }
            }
        }

        int indexLastPositiveNumber = Integer.MAX_VALUE;
        int indexFirstNegativeNumber = Integer.MIN_VALUE;

        for ( int i = nums.length - 1; i >= 0; i-- ) {

            if ( nums[i] > -1 && indexLastPositiveNumber == Integer.MAX_VALUE ) {

                indexLastPositiveNumber = i;
            }

            if ( indexLastPositiveNumber != Integer.MAX_VALUE && nums[i] < 0 ) {

                indexFirstNegativeNumber = i;
            }
        }

        // means no positive numbers - next positive number
        if ( indexLastPositiveNumber == Integer.MAX_VALUE ) {

            // this assmumes it wants us to return 0 instead of 1
            return 0;
        }

        if ( indexFirstNegativeNumber != Integer.MAX_VALUE ) {

            return indexFirstNegativeNumber;
        }

        return 0;
    }

}
