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
package com.spotadev.algo.blind75.linkedlist.easy.merge_two_lists;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=XIdigk956u0
 * 
 * https://leetcode.com/problems/merge-two-sorted-lists
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
 *     Memory Usage: 41.8 MB, less than 87.65% of Java online submissions for Merge Two Sorted Lists.
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes 
 * of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * Example 1:
 * 
 *     Input: list1 = [1,2,4], list2 = [1,3,4]
 *     Output: [1,1,2,3,4,4]
 * 
 * Example 2:
 * 
 *     Input: list1 = [], list2 = []
 *     Output: []
 * 
 * Example 3:
 * 
 *     Input: list1 = [], list2 = [0]
 *     Output: [0]
 *  
 * 
 * Constraints:
 * 
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 * 
 * @author John Dickerson - 17 Apr 2022
 */
public class MergeTwoListsAlt_JD implements MergeTwoListsAPI {

    public ListNode mergeTwoLists( ListNode list1, ListNode list2 ) {

        ListNode[] lists = new ListNode[] { list1, list2 };
        ListNode dummy = new ListNode( -1 );
        ListNode tail = dummy;

        while ( true ) {

            ListNode lowestNodeOfLoop = null;
            int lowestInt = Integer.MAX_VALUE;
            int lowestIndex = -1;
            int count = 0;

            for ( ListNode listNode : lists ) {

                if ( listNode != null && listNode.val < lowestInt ) {

                    lowestNodeOfLoop = listNode;
                    lowestInt = listNode.val;
                    lowestIndex = count;
                }

                count++;
            }

            if ( lowestNodeOfLoop == null ) {

                break;
            }

            tail.next = lowestNodeOfLoop;
            tail = tail.next;
            lists[lowestIndex] = lists[lowestIndex] != null ? lists[lowestIndex].next : null;
        }

        return dummy.next;
    }
}
