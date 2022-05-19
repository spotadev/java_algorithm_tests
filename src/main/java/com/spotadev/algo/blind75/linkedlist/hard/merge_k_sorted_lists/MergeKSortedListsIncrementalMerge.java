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

import java.util.ArrayList;
import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=q5a5OiGbT6Q
 * 
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * 
 *     Runtime: 4 ms, faster than 83.58% of Java online submissions for Merge k Sorted Lists.
 *     Memory Usage: 47.9 MB, less than 23.24% of Java online submissions for Merge k Sorted Lists.
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
 *     Input: lists = []
 *     Output: []
 * 
 * Example 3:
 *
 *     Input: lists = [[]]
 *     Output: []
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
 * Explanation of solution    
 *     
 *     This solution merges Nodes in pairs.  
 * 
 *         e.g. consider nodes a b c d
 * 
 *             It can merge a with b and c with d
 * 
 *             Then it can merge the resultant ab and cd nodes together.
 *         
 *        e.g. consider a b c d e f g
 *    
 *            First pass:
 *        
 *                ab cd ef g (4 nodes)
 *            
 *            Second pass:
 *        
 *                abcd efg  (2 nodes)
 *            
 *            Third pass
 *        
 *                abcdefg  (1 node)
 * 
 * @author John Dickerson - 5 Feb 2022
 */
public class MergeKSortedListsIncrementalMerge {

    private ListNode merge( ListNode a, ListNode b ) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        if ( b == null ) {

            return a;
        }

        while ( a != null && b != null ) {

            if ( a.val < b.val ) {

                tail.next = a;
                a = a.next;
            }
            else {

                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        tail.next = a != null ? a : b;
        return dummy.next;
    }


    public ListNode mergeKLists( ListNode[] lists ) {

        if ( lists.length == 0 ) {

            return null;
        }

        while ( lists.length > 1 ) {

            List<ListNode> reducedNodes = new ArrayList<>();

            for ( int i = 0; i < lists.length; i = i + 2 ) {

                ListNode a = lists[i];
                ListNode b = ( i + 1 ) < lists.length ? lists[i + 1] : null;
                ListNode merged = merge( a, b );
                reducedNodes.add( merged );
            }

            lists = reducedNodes.toArray( new ListNode[reducedNodes.size()] );
        }

        return lists[0];
    }
}
