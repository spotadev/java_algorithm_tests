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
package com.spotadev.algo.difficulty_1.threesum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/3sum/
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
 *     big data, you need an optimised solution of O(n2) which can be achived by combining logic 
 *     from:
 * 
 *      com.spotadev.algo.difficulty_1.twosumsorted
 *      https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * 
 * @author John Dickerson - 2 May 2022
 */
public class ThreeSum_Slow {

    private String getStringRep( List<Integer> list ) {

        StringBuilder sb = new StringBuilder();

        for ( Integer integer : list ) {

            sb.append( integer ).append( "  " );
        }

        return sb.toString().trim();
    }


    public List<List<Integer>> threeSum( int[] nums ) {

        List<List<Integer>> lists = new ArrayList<>();

        if ( nums.length < 3 ) {

            return lists;
        }

        Set<String> stringReps = new HashSet<>();

        for ( int i = 0; i < nums.length; i++ ) {

            for ( int j = i + 1; j < nums.length; j++ ) {

                for ( int k = j + 1; k < nums.length; k++ ) {

                    int num1 = nums[i];
                    int num2 = nums[j];
                    int num3 = nums[k];

                    if ( num1 + num2 + num3 == 0 ) {

                        List<Integer> list = new ArrayList<>();
                        list.add( num1 );
                        list.add( num2 );
                        list.add( num3 );
                        Collections.sort( list );
                        String rep = getStringRep( list );

                        if ( !stringReps.contains( rep ) ) {

                            lists.add( list );
                            System.out.println( nums[i] + " " + nums[j] + " " + nums[k] );
                        }

                        stringReps.add( rep );
                    }
                }
            }
        }

        return lists;
    }


    // This shows how we generate combinations of 3 elements from a set
    // I did this first to work out how to generate combinations
    public static void main( String[] args ) {

        int n[] = { 1, 2, 3, 4, 5, 6 };

        for ( int i = 0; i < n.length; i++ ) {

            for ( int j = i + 1; j < n.length; j++ ) {

                for ( int k = j + 1; k < n.length; k++ ) {

                    System.out.println( n[i] + " " + n[j] + " " + n[k] );
                }
            }
        }
    }
}
