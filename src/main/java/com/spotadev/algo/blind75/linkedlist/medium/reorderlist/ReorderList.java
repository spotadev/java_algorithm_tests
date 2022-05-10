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
package com.spotadev.algo.blind75.linkedlist.medium.reorderlist;

/**
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
public class ReorderList {

    // Find what the midNode is.  The fast node goes double the distance than the slow node.
    // We know we have the slow node when the fast node reaches the end and there is no next.
    private ListNode getMidNode( ListNode head ) {

        ListNode slow = head;
        ListNode fast = head.next;

        while ( fast != null && fast.next != null ) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    // The idea is we reverse the second half of the nodes before doing a merge
    private ListNode reverseNodesInRightHalf( ListNode midNode ) {

        ListNode second = midNode.next;

        // the mid node is the last node on the left. After the merge it will be the last node
        // and has no next
        midNode.next = null;
        ListNode previous = null;

        while ( second != null ) {

            ListNode temp = second.next;
            second.next = previous;
            previous = second;
            second = temp;
        }

        return previous;
    }


    // The secondNode came from the second half after it was reversed
    private void mergeNodes( ListNode firstNode, ListNode secondNode ) {

        while ( secondNode != null ) {

            ListNode tmp1 = firstNode.next;
            ListNode tmp2 = secondNode.next;
            firstNode.next = secondNode;
            secondNode.next = tmp1;
            firstNode = tmp1;
            secondNode = tmp2;
        }
    }


    // Assume:                               1 2 3 4 5
    // We want to change to:                 1 5 2 4 3
    //
    // The strategy has 3 steps:
    //
    // (i) Find the mid value:                   3
    // (ii) Reverse the right side:          1 2 3   5 4   
    // (iii) Merge the left and right side:  1 5   2 4   3
    public void reorderList( ListNode head ) {

        ListNode midNode = getMidNode( head );
        ListNode second = reverseNodesInRightHalf( midNode );
        ListNode first = head;
        mergeNodes( first, second );
    }
}
