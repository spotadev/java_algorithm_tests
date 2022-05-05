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
package com.spotadev.algo.blind75.arraysandhashing.medium.topkfrequentelements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/top-k-frequent-elements
 * 
 *     Your runtime beats 36.05 % of java submissions
 *     Your memory usage beats 49.81 % of java submissions.
 * 
 * Given an integer array nums and an integer k, return the k most frequent elements. 
 * You may return the answer in any order.
 * 
 *    Your runtime beats 36.05 % of java submissions.
 *    Your memory usage beats 49.81 % of java submissions.
 * 
 * Example 1:
 * 
 *     Input: nums = [1,1,1,2,2,3], k = 2
 *     Output: [1,2]
 * 
 * Example 2:
 * 
 *     Input: nums = [1], k = 1
 *     Output: [1]
 * 
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 10^5
 *     k is in the range [1, the number of unique elements in the array].
 *     It is guaranteed that the answer is unique.
 * 
 * 
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the 
 * array's size.
 * 
 * @author John Dickerson - 30 Apr 2022
 */
public class TopKFrequentElements {

    public int[] topKFrequent( int[] nums, int k ) {

        Map<Integer, Integer> countByNumber = new HashMap<>();

        for ( int num : nums ) {

            Integer count = countByNumber.get( num );

            if ( count == null ) {

                count = 1;
            }
            else {

                count++;
            }

            countByNumber.put( num, count );
        }

        SortedMap<Integer, List<Integer>> valuesByCount = new TreeMap<>(
                new Comparator<Integer>() {

                    @Override
                    public int compare( Integer o1, Integer o2 ) {

                        return -1 * o1.compareTo( o2 );
                    }
                } );

        for ( Entry<Integer, Integer> entry : countByNumber.entrySet() ) {

            int count = entry.getValue();
            int value = entry.getKey();

            List<Integer> values = valuesByCount.get( count );

            if ( values == null ) {

                values = new ArrayList<>();
                valuesByCount.put( count, values );
            }

            values.add( value );
        }

        List<Integer> toReturn = new ArrayList<>();

        for ( List<Integer> values : valuesByCount.values() ) {

            toReturn.addAll( values );
        }

        int[] toReturnArray = new int[k];

        for ( int i = 0; i < k; i++ ) {

            toReturnArray[i] = toReturn.get( i );
        }

        return toReturnArray;
    }
}
