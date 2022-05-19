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

import java.util.PriorityQueue;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=q5a5OiGbT6Q
 * 
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * 
 *     Runtime: 9 ms, faster than 37.63% of Java online submissions for Merge k Sorted Lists.
 *     Memory Usage: 47.7 MB, less than 27.65% of Java online submissions for Merge k Sorted Lists.
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
 * This solution is the easiest to implement 
 * 
 * @author John Dickerson - 5 Feb 2022
 */
public class MergeKSortedListsPriorityQueue {

    public ListNode mergeKLists( ListNode[] lists ) {

        PriorityQueue<ListNode> stack = new PriorityQueue<>( ( a, b ) -> a.val - b.val );

        for ( ListNode listNode : lists ) {

            if ( listNode != null ) {

                stack.add( listNode );
            }
        }

        ListNode dummy = new ListNode();
        ListNode list = dummy;

        while ( !stack.isEmpty() ) {

            ListNode smallest = stack.poll();
            list.next = smallest;
            list = list.next;

            if ( smallest.next != null ) {

                stack.add( smallest.next );
            }
        }

        return dummy.next;
    }
}
