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

import org.testng.Assert;

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
public abstract class AbstractMergeKSortedListsTest {

    protected MergeKSortedListsAPI mergeKSortedLists;

    private ListNode getListNode( int[] intArray ) {

        if ( intArray.length == 0 ) {

            return null;
        }

        ListNode dummy = new ListNode( -1 );
        ListNode listNode = new ListNode( intArray[0] );
        dummy.next = listNode;

        for ( int i = 1; i < intArray.length; i++ ) {

            ListNode child = new ListNode( intArray[i] );
            listNode.next = child;
            listNode = child;
        }

        ListNode listNodeToReturn = dummy.next;
        return listNodeToReturn;
    }


    private ListNode[] getListNodes( int[][] ints ) {

        List<ListNode> listNodes = new ArrayList<>();

        for ( int[] intArray : ints ) {

            ListNode listNode = getListNode( intArray );

            if ( listNode != null ) {

                listNodes.add( listNode );
            }
        }

        return listNodes.toArray( new ListNode[listNodes.size()] );
    }


    private void assertEqual( ListNode merged, int[] expectedOutput ) {

        if ( merged == null && expectedOutput.length == 0 ) {

            return;
        }

        System.out.println( "merged = " + merged );

        List<Integer> integers = new ArrayList<>();
        integers.add( merged.val );

        while ( true ) {

            ListNode child = merged.next;

            if ( child == null ) {

                break;
            }
            else {

                integers.add( child.val );
            }

            merged = child;
        }

        int[] actualOutput = new int[integers.size()];
        int i = 0;

        for ( Integer integer : integers ) {

            actualOutput[i++] = integer;
        }

        Assert.assertEquals( actualOutput, expectedOutput );
    }


    void mergeKListsTest_1() {

        int[][] ints = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        int[] output = { 1, 1, 2, 3, 4, 4, 5, 6 };
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }


    void mergeKListsTest_2() {

        int[][] ints = {};
        int[] output = {};
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }


    void mergeKListsTest_3() {

        int[][] ints = { {} };
        int[] output = {};
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }
}
