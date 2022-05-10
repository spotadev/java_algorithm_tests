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
package com.spotadev.algo.blind75.linkedlist.medium.remove_nth_node_from_end_of_list;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node 
 *     From End of List.
 *     
 *     Memory Usage: 40.4 MB, less than 88.58% of Java online submissions for Remove Nth 
 *     Node From End of List.
 * 
 * Given the head of a linked list, remove the nth node from the end of the list and return 
 * its head.
 * 
 * Example 1:
 * 
 *     Input: head = [1,2,3,4,5], n = 2
 *     Output: [1,2,3,5]
 * 
 * Example 2:
 * 
 *     Input: head = [1], n = 1
 *     Output: []
 * 
 * Example 3:
 * 
 *     Input: head = [1,2], n = 1
 *     Output: [1]
 *  
 * Constraints:
 * 
 *     The number of nodes in the list is sz.
 *     1 <= sz <= 30
 *     0 <= Node.val <= 100
 *     1 <= n <= sz
 * 
 * Follow up: Could you do this in one pass?
 * 
 * @author John Dickerson - 10 May 2022
 */
public class RemoveNthNodeFromEndOfList {

    // Consider:
    // 1 2 3 4 5 n = 2
    // 
    // 1 2 3 4 5
    // L   R          - R is 2 spaces to the right of L
    //   L   R        - we now start sliding right until next is null
    //     L   R
    //       L   R    - now next is null.  That means L is at the index which needs removing
    // The problem is with this approach that we do not have the previous node to L (4)
    // 
    // Therefore we do the same as above except we add a dummyNode at the beginning and we increase
    // the gap between L and R by one:
    //
    // D 1 2 3 4 5
    // L     R
    //   L     R
    //     L     R
    //       L     R
    // Now we have reference to 3 so we can skip past 4 and connect with 5
    public ListNode removeNthFromEnd( ListNode head, int n ) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode right = head;
        ListNode left = dummy;

        // we are getting the gap between L and R correct
        for ( int i = 0; i < n && right != null; i++ ) {

            right = right.next;
        }

        // Now we move L and R to the right until R is null.
        // When R is null it means L is now on the node before the one we want to remove
        while ( right != null ) {

            left = left.next;
            right = right.next;
        }

        // we remove the one we do not want by getting next of next
        left.next = left.next.next;
        return dummy.next;
    }
}
