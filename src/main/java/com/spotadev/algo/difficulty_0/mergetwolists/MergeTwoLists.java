/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_0.mergetwolists;

/**
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
public class MergeTwoLists {

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
