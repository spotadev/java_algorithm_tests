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
package com.spotadev.algo.difficulty_0.containsduplicates;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * 
 * Runtime: 6 ms, faster than 94.83% of Java online submissions for Contains Duplicate.
 * Memory Usage: 54.7 MB, less than 88.35% of Java online submissions for Contains Duplicate.
 * 
 * Example 1:
 * 
 *     Input: nums = [1,2,3,1]
 *     Output: true
 * 
 * Example 2:
 * 
 *     Input: nums = [1,2,3,4]
 *     Output: false
 * 
 * Example 3:
 * 
 *     Input: nums = [1,1,1,3,3,4,3,2,4,2]
 *     Output: true
 * 
 * 
 * Constraints:
 * 
 *    1 <= nums.length <= 10^5
 *    -109 <= nums[i] <= 10^9
 * 
 * @author John Dickerson - 30 Apr 2022
 */
public class ContainsDuplicates {

    public boolean containsDuplicate( int[] nums ) {

        Set<Integer> numbers = new HashSet<>();

        for ( int num : nums ) {

            if ( numbers.contains( num ) ) {

                return true;
            }

            numbers.add( num );
        }

        return false;
    }
}
