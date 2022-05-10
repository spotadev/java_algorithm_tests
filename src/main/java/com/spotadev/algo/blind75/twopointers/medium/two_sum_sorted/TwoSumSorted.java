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
package com.spotadev.algo.blind75.twopointers.medium.two_sum_sorted;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 *     Runtime: 3 ms, faster than 30.22% of Java online submissions for 
 *     Two Sum II - Input Array Is Sorted.
 *     
 *     Memory Usage: 49.7 MB, less than 62.77% of Java online submissions for 
 *     Two Sum II - Input Array Is Sorted.
 * 
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. Let these two numbers be 
 * numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * 
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array 
 * [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution. You may not use the same 
 * element twice.
 * 
 * Your solution must use only constant extra space.
 * 
 * Example 1:
 * 
 *     Input: numbers = [2,7,11,15], target = 9
 *     Output: [1,2]
 *     Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * 
 * Example 2:
 * 
 *     Input: numbers = [2,3,4], target = 6
 *     Output: [1,3]
 *     Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * 
 * Example 3:
 * 
 *     Input: numbers = [-1,0], target = -1
 *     Output: [1,2]
 *     Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 * 
 * Constraints:
 * 
 *     2 <= numbers.length <= 3 * 10^4
 *     -1000 <= numbers[i] <= 1000
 *     numbers is sorted in non-decreasing order.
 *     -1000 <= target <= 1000
 *     The tests are generated such that there is exactly one solution.
 *     
 * JD Note: 
 * 
 *    This problem introduces the concept that you can can move from O(n2) to O(n) with 
 *    combinations by sorting a list first and using left and right pointers for generating 
 *    combinations that depend on the data.
 * 
 *    Knowledge of this solution is required to convert Three Sum problem from O(n3) to O(n2)
 *    See:
 * 
 *       https://leetcode.com/problems/3sum/
 *       com.spotadev.algo.difficulty_1.threesum.ThreeSum_Fast
 * 
 * @author John Dickerson - 16 Apr 2022
 */
public class TwoSumSorted {

    public int[] twoSum( int[] numbers, int target ) {

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while ( leftIndex < rightIndex ) {

            int sum = numbers[leftIndex] + numbers[rightIndex];

            if ( sum > target ) {

                rightIndex--;
            }
            else if ( sum < target ) {

                leftIndex++;
            }
            else {

                return new int[] { ++leftIndex, ++rightIndex };
            }
        }

        return new int[] {};
    }
}
