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
package com.spotadev.algo.easy.remove_duplicates_from_sorted_array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 *     Runtime: 1 ms, faster than 85.62% of Java online submissions for Remove Duplicates from 
 *     Sorted Array.
 *     
 *     Memory Usage: 43.8 MB, less than 93.32% of Java online submissions for Remove Duplicates 
 *     from Sorted Array.
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such 
 * that each unique element appears only once. The relative order of the elements should be kept 
 * the same.
 *  
 * Since it is impossible to change the length of the array in some languages, you must instead 
 * have the result be placed in the first part of the array nums. More formally, if there are 
 * k elements after removing the duplicates, then the first k elements of nums should hold the 
 * final result. It does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array. You must do this by modifying the input array 
 * in-place with O(1) extra memory.
 * 
 * Custom Judge:
 * 
 * The judge will test your solution with the following code:
 * 
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * 
 * int k = removeDuplicates(nums); // Calls your implementation
 * 
 * assert k == expectedNums.length;
 * 
 * for (int i = 0; i < k; i++) {
 *    assert nums[i] == expectedNums[i];
 * }
 * 
 * If all assertions pass, then your solution will be accepted.
 * 
 * Example 1:
 * 
 *     Input: nums = [1,1,2]
 *     Output: 2, nums = [1,2,_]
 * 
 *     Explanation: Your function should return k = 2, with the first two elements of nums being 
 *     1 and 2 respectively.
 * 
 *     It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Example 2:
 * 
 *     Input: nums = [0,0,1,1,1,2,2,3,3,4]
 *     Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 
 *     Explanation: Your function should return k = 5, with the first five elements of nums being 
 *     0, 1, 2, 3, and 4 respectively.
 * 
 *     It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 3 * 104
 *     -100 <= nums[i] <= 100
 *     nums is sorted in non-decreasing order.
 * 
 * @author John Dickerson - 18 Apr 2022
 */
public class AbstractRemoveDuplicatesFromSortedArrayTest {

    private Logger logger = LoggerFactory.getLogger(
            AbstractRemoveDuplicatesFromSortedArrayTest.class );

    protected RemoveDuplicatesFromSortedArrayAPI removeDuplicatesFromSortedArray;

    private void assertEquals( int numberElements, int[] actual, int[] expected ) {

        for ( int i = 0; i < expected.length; i++ ) {

            Assert.assertEquals( actual[i], expected[i] );
        }
    }


    private void debug( int[] array ) {

        StringBuilder sb = new StringBuilder();
        sb.append( "[ " );

        for ( int element : array ) {

            sb.append( element ).append( ", " );
        }

        sb.append( " ]" );
        logger.info( sb.toString() );
    }


    void removeDuplicatesTest_1() {

        int[] data = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int numberElements = removeDuplicatesFromSortedArray.removeDuplicates( data );
        logger.info( numberElements + "" );
        debug( data );
        Assert.assertEquals( numberElements, 5 );
        assertEquals( numberElements, data, new int[] { 0, 1, 2, 3, 4 } );
    }
}
