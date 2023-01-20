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
package com.spotadev.algo.blind75.linkedlist.hard.merge_k_sorted_lists;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=q5a5OiGbT6Q
 * 
 * https://leetcode.com/problems/merge-k-sorted-lists/
 *      
 *      Runtime: 352 ms, faster than 6.75% of Java online submissions for Merge k Sorted Lists.
 *      Memory Usage: 47.1 MB, less than 56.21% of Java online submissions for Merge k Sorted Lists.     
 * 
 * This is the node class:
 * 
 *     public class ListNode {
 *         int val;
 *     
 *         ListNode next;
 *     
 *         ListNode() {}
 *     
 *          ListNode(int val) { 
 *              this.val = val; 
 *          }
 *     
 *          ListNode(int val, ListNode next) { 
 *     
 *              this.val = val; 
 *              this.next = next; 
 *          }
 *      }
 * 
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 *
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * Example 1:
 *
 *     Input: lists = [[1,4,5],[1,3,4],[2,6]]
 *     Output: [1,1,2,3,4,4,5,6]
 * 
 *     Explanation: The linked-lists are:
 *     [
 *         1->4->5,
 *         1->3->4,
 *         2->6
 *     ]
 * 
 *     merging them into one sorted list:
 *  
 *         1->1->2->3->4->4->5->6
 * 
 * Example 2:
 * 
 * Input: lists = []
 * Output: []
 * 
 * Example 3:
 *
 * Input: lists = [[]]
 * Output: []
 *
 *
 * Constraints:
 * 
 *     k == lists.length
 *     0 <= k <= 10^4
 *     0 <= lists[i].length <= 500
 *     -10^4 <= lists[i][j] <= 10^4
 *     lists[i] is sorted in ascending order.
 *     The sum of lists[i].length won't exceed 10^4.
 * 
 * Note when I submitted to leetcode it said my solution was slow in execution time.  Maybe you can
 * do a bubble or merge sort instead.
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class MergeKSortedListsPriorityQueue_JDTest extends AbstractMergeKSortedListsTest {

    @BeforeClass
    public void setUp() {

        mergeKSortedLists = new MergeKSortedListsIncrementalMerge_JD();
    }


    @Test
    public void mergeKListsTest_1() {

        super.mergeKListsTest_1();
    }


    @Test
    public void mergeKListsTest_2() {

        super.mergeKListsTest_2();
    }


    @Test
    public void mergeKListsTest_3() {

        super.mergeKListsTest_3();
    }
}
