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
package com.spotadev.algo.blind75.twopointers.medium.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=jzZsG8n2R9A
 * 
 * https://leetcode.com/problems/3sum/
 * 
 *     Runtime: 601 ms, faster than 16.21% of Java online submissions for 3Sum.
 *     Memory Usage: 47.2 MB, less than 73.48% of Java online submissions for 3Sum.
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such 
 * that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * Example 1:
 * 
 *     Input: nums = [-1,0,1,2,-1,-4]
 *     Output: [[-1,-1,2],[-1,0,1]]
 * 
 * Example 2:
 * 
 *     Input: nums = []
 *     Output: []
 * 
 * Example 3:
 * 
 *     Input: nums = [0]
 *     Output: []
 * 
 * Constraints:
 * 
 *     0 <= nums.length <= 3000
 *     -10^5 <= nums[i] <= 10^5
 * 
 * JD Note: 
 * 
 *     Note in order to not use O(n^3) solution which will cause timeout in the tests with
 *     big data, you need an optimised solution of O(n log n + n^2) which can be achieved by 
 *     combining logic from:
 * 
 *      com.spotadev.algo.difficulty_1.twosumsorted.TwoSumSorted
 *      https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * Note this solution can be improved on:
 * 
 *     When we are reducing the rightIndex or increasing the leftIndex we are not checking if the
 *     value at the nextIndex is the same or not - if it is we should skip past it for we have done
 *     it already.
 *     
 *     Also it may be faster to create a hash of the list to put in the SortedSet instead of
 *     adding the whole list to the Set.
 *     
 *     In the interests of making the solution more readable and capturing the essence it was 
 *     not improved upon.
 * 
 * @author John Dickerson - 2 May 2022
 */
public class ThreeSum_Fast {

    public List<List<Integer>> threeSum( int[] nums ) {

        SortedSet<List<Integer>> lists = new TreeSet<List<Integer>>(
                new Comparator<List<Integer>>() {

                    @Override
                    public int compare( List<Integer> o1, List<Integer> o2 ) {

                        for ( int i = 0; i < 3; i++ ) {

                            if ( o1.get( i ) > o2.get( i ) ) {

                                return 1;
                            }
                            else if ( o1.get( i ) < o2.get( i ) ) {

                                return -1;
                            }
                        }

                        return 0;
                    }

                } );

        Arrays.sort( nums );
        int target = 0;

        for ( int i = 0; i < nums.length; i++ ) {

            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;

            while ( leftIndex < rightIndex ) {

                int sum = nums[i] + nums[leftIndex] + nums[rightIndex];

                if ( sum > target ) {

                    rightIndex--;
                }
                else if ( sum < target ) {

                    leftIndex++;
                }
                else {

                    List<Integer> list = new ArrayList<>();
                    list.add( nums[i] );
                    list.add( nums[leftIndex] );
                    list.add( nums[rightIndex] );
                    lists.add( list );
                    leftIndex++;
                }
            }
        }

        return new ArrayList<List<Integer>>( lists );
    }
}
