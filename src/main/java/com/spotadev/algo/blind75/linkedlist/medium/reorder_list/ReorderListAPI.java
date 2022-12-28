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
package com.spotadev.algo.blind75.linkedlist.medium.reorder_list;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=S5bfdUTrKLM
 * 
 * https://leetcode.com/problems/reorder-list/
 * 
 *     Runtime: 1 ms, faster than 99.94% of Java online submissions for Reorder List.
 *     Memory Usage: 45.3 MB, less than 76.54% of Java online submissions for Reorder List.
 * 
 * You are given the head of a singly linked-list. The list can be represented as:
 * 
 *     L0 → L1 → … → Ln - 1 → Ln
 * 
 * Reorder the list to be on the following form:
 * 
 *     L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * 
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 * 
 * Example 1:
 * 
 *     Input: head = [1,2,3,4]
 *     Output: [1,4,2,3]
 * 
 * Example 2:
 * 
 *     Input: head = [1,2,3,4,5]
 *     Output: [1,5,2,4,3]
 * 
 * Constraints:
 * 
 *     The number of nodes in the list is in the range [1, 5 * 104].
 *     1 <= Node.val <= 1000
 * 
 * @author John Dickerson - 9 May 2022
 */
public interface ReorderListAPI {

    // Assume:                               1 2 3 4 5
    // We want to change to:                 1 5 2 4 3
    //
    // The strategy has 3 steps:
    //
    // (i) Find the mid value:                   3
    // (ii) Reverse the right side:          1 2 3   5 4   
    // (iii) Merge the left and right side:  1 5   2 4   3
    void reorderList( ListNode head );

}