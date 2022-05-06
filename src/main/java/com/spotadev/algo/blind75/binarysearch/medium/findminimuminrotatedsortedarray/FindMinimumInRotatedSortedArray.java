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
package com.spotadev.algo.blind75.binarysearch.medium.findminimuminrotatedsortedarray;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in 
 *     Rotated Sorted Array.
 *     
 *     Memory Usage: 42.9 MB, less than 19.96% of Java online submissions for Find Minimum in 
 *     Rotated Sorted Array.
 * 
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * 
 *     [4,5,6,7,0,1,2] if it was rotated 4 times.
 *     [0,1,2,4,5,6,7] if it was rotated 7 times.
 * 
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array 
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * 
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * Example 1:
 * 
 *     Input: nums = [3,4,5,1,2]
 *     Output: 1
 *     Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 * 
 * Example 2:
 * 
 *     Input: nums = [4,5,6,7,0,1,2]
 *     Output: 0
 *     Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 * 
 * Example 3:
 * 
 *     Input: nums = [11,13,15,17]
 *     Output: 11
 *     Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
 * 
 * Constraints:
 * 
 *     n == nums.length
 *     1 <= n <= 5000
 *     -5000 <= nums[i] <= 5000
 *     All the integers of nums are unique.
 *     nums is sorted and rotated between 1 and n times.
 * 
 * @author John Dickerson - 5 May 2022
 */
public class FindMinimumInRotatedSortedArray {

    public int findMin( int[] nums ) {

        int l = 0, r = nums.length - 1, mid = 0;
        int min = nums[0];

        // 3,4,[5],1,2
        while ( l <= r ) {

            // if true means we are sorted already
            if ( nums[r] > nums[l] ) {

                return Math.min( min, nums[l] );
            }

            mid = ( l + r ) / 2;
            min = Math.min( min, nums[mid] );

            if ( nums[mid] >= nums[l] ) {
                // search right
                l = mid + 1;

            }
            else {
                // search left
                r = mid - 1;
            }
        }

        return min;
    }
}
