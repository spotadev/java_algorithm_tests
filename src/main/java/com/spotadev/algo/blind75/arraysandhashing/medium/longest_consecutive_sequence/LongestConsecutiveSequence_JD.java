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
package com.spotadev.algo.blind75.arraysandhashing.medium.longest_consecutive_sequence;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=P6RZZMu_maU
 * 
 * https://leetcode.com/problems/longest-consecutive-sequence
 * 
 *     Runtime: 76 ms, faster than 43.04% of Java online submissions for Longest Consecutive 
 *     Sequence.
 *     
 *     Memory Usage: 60.8 MB, less than 63.70% of Java online submissions for Longest Consecutive 
 *     Sequence.
 * 
 * Given an unsorted array of integers nums, return the length of the longest consecutive 
 * elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 *
 *    Input: nums = [ 100, 4, 200, 1, 3, 2]
 *    Output: 4
 *    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length 
 *    is 4.
 *
 * Example 2:
 *
 *    Input: nums = [ 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 ]
 *    Output: 9
 *
 * Constraints:
 * 
 *     0 <= nums.length <= 10^5
 *     -10^9 <= nums[i] <= 10^9
 *     
 * @author John Dickerson - 1 May 2022
 */
public class LongestConsecutiveSequence_JD implements LongestConsecutiveSequenceAPI {

    @Override
    public int longestConsecutive( int[] nums ) {

        if ( nums.length == 0 ) {

            return 0;
        }

        SortedSet<Integer> sequence = new TreeSet<>();

        for ( int num : nums ) {

            sequence.add( num );
        }

        int lastStart = Integer.MIN_VALUE;
        int previousEnd = Integer.MIN_VALUE;
        int currentEnd;
        int maxLength = -1;

        Iterator<Integer> iterator = sequence.iterator();

        while ( iterator.hasNext() ) {

            currentEnd = iterator.next();

            if ( currentEnd != ( previousEnd + 1 ) ) {

                int length = previousEnd - lastStart + 1;
                lastStart = currentEnd;

                if ( length > maxLength ) {

                    maxLength = length;
                }
            }

            previousEnd = currentEnd;
        }

        int length = previousEnd - lastStart + 1;

        if ( length > maxLength ) {

            maxLength = length;
        }

        return maxLength;
    }
}
