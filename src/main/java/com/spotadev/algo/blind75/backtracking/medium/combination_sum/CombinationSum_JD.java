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
package com.spotadev.algo.blind75.backtracking.medium.combination_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=GBKI9VSKdGg
 * 
 * https://leetcode.com/problems/combination-sum/
 * 
 * Runtime: 14 ms, faster than 13.16% of Java online submissions for Combination Sum.
 * 
 * Memory Usage: 45.4 MB, less than 25.35% of Java online submissions for Combination Sum.
 * 
 * Given an array of distinct integers candidates and a target integer target, return a list of 
 * all unique combinations of candidates where the chosen numbers sum to target. You may return the 
 * combinations in any order.
 * 
 * The same number may be chosen from candidates an unlimited number of times. Two combinations 
 * are unique if the frequency of at least one of the chosen numbers is different.
 * 
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150 
 * combinations for the given input.
 * 
 * Example 1:
 * 
 *     Input: candidates = [2,3,6,7], target = 7
 *     Output: [[2,2,3],[7]]
 * 
 *     Explanation:
 *         2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 *         7 is a candidate, and 7 = 7.
 *         These are the only two combinations.
 * 
 * Example 2:
 * 
 *     Input: candidates = [2,3,5], target = 8
 *     Output: [[2,2,2,2],[2,3,3],[3,5]]
 * 
 * Example 3:
 * 
 *     Input: candidates = [2], target = 1
 *     Output: []
 * 
 * Constraints:
 * 
 *     1 <= candidates.length <= 30
 *     1 <= candidates[i] <= 200
 *     All elements of candidates are distinct.
 *     1 <= target <= 500
 * 
 * @author John Dickerson - 13 May 2022
 */
public class CombinationSum_JD implements CombinationSumAPI {

    private void dfs( List<Integer> current, int index, int[] candidates, int total, int target,
            List<List<Integer>> result ) {

        if ( total == target ) {

            List<Integer> temp = new ArrayList<>( current );
            Collections.sort( temp );
            result.add( temp );
            return;
        }

        if ( index >= candidates.length || total > target ) {
            return;
        }

        current.add( 0, candidates[index] );
        dfs( current, index, candidates, total + candidates[index], target, result );
        current.remove( 0 );
        dfs( current, ++index, candidates, total, target, result );
    }


    /**
     *                        2
     *                 2,2           []
     *         2,2,2        2,2    3     []
     *   2,2,2,2   2,2,2     
     *          2,2,2,3   2,2,2  
     *   
     */
    public List<List<Integer>> combinationSum( int[] candidates, int target ) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs( current, 0, candidates, 0, target, result );
        return result;
    }
}
