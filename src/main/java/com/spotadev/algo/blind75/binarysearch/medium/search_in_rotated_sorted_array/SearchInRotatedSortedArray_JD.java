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
package com.spotadev.algo.blind75.binarysearch.medium.search_in_rotated_sorted_array;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=U8XENwh8Oy8
 * 
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 
 *     Runtime: 1 ms, faster than 61.49% of Java online submissions for Search in Rotated Sorted Array.
 *     Memory Usage: 42.4 MB, less than 57.41% of Java online submissions for Search in Rotated Sorted Array.
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).
 * 
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
 * index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
 * nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
 * might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target, return the index of 
 * target if it is in nums, or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * 
 *     Input: nums = [4,5,6,7,0,1,2], target = 0
 *     Output: 4
 * 
 * Example 2:
 * 
 *     Input: nums = [4,5,6,7,0,1,2], target = 3
 *     Output: -1
 * 
 * Example 3:
 * 
 *     Input: nums = [1], target = 0
 *     Output: -1
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 5000
 *     -10^4 <= nums[i] <= 10^4
 *     All values of nums are unique.
 *     nums is an ascending array that is possibly rotated.
 *    -10^4 <= target <= 10^4
 * 
 * @author John Dickerson - 5 May 2022
 */
public class SearchInRotatedSortedArray_JD implements SearchInRotatedSortedArrayAPI {

    @Override
    public int search( int[] nums, int target ) {

        int left = 0;
        int right = nums.length - 1;

        while ( left <= right ) {

            int mid = ( left + right ) / 2;

            if ( nums[mid] == target ) {

                return mid;
            }

            // Search in left portion
            if ( nums[left] <= nums[mid] ) {

                if ( target > nums[mid] || target < nums[left] ) {

                    left = mid + 1;
                }
                else {

                    right = mid - 1;
                }
            }
            // Search in right portion
            else {
                if ( target > nums[right] || target < nums[mid] ) {
                    // go to left
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }

            }
        }
        return -1;
    }
}
