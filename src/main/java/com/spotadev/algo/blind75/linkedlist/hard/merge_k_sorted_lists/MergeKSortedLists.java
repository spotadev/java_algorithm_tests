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

/**
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
 * @author John Dickerson - 5 Feb 2022
 */
public class MergeKSortedLists {

    private void debugLists( ListNode[] lists ) {

        StringBuilder sb = new StringBuilder();
        sb.append( "{" );

        for ( ListNode listNode : lists ) {

            sb.append( "{" );

            if ( listNode != null ) {

                sb.append( listNode.toString() );
            }
            sb.append( "}" );
        }

        sb.append( "}" );

        System.out.println( sb.toString() );
    }


    public ListNode mergeKLists( ListNode[] lists ) {

        ListNode dummy = new ListNode( -1 );
        ListNode tail = dummy;

        while ( true ) {

            debugLists( lists );
            System.out.println( "dummy: " + dummy.toString() );

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

            System.out.println(
                    "Lowest value at head of list: " +
                            lowestInt + ", list: " + lowestIndex +
                            ", lowestNodeOfLoop = " + lowestNodeOfLoop );

            if ( lowestNodeOfLoop == null ) {

                break;
            }

            tail.next = lowestNodeOfLoop;
            tail = tail.next;
            lists[lowestIndex] = lists[lowestIndex].next;
        }

        return dummy.next;
    }
}
