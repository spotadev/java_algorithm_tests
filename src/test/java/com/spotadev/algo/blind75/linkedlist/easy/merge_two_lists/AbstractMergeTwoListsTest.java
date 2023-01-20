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

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=XIdigk956u0
 * 
 * https://leetcode.com/problems/merge-two-sorted-lists
 * 
 *    Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
 *    Memory Usage: 42 MB, less than 76.07% of Java online submissions for Merge Two Sorted Lists. 
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
public abstract class AbstractMergeTwoListsTest {

    protected MergeTwoListsAPI mergeTwoLists;

    private ListNode createNode( int... values ) {

        ListNode dummy = new ListNode( -1 );
        ListNode head = dummy;

        for ( int value : values ) {

            head.next = new ListNode( value );
            head = head.next;
        }

        return dummy.next;
    }


    private int[] getNumbers( ListNode listNode ) {

        List<Integer> integers = new ArrayList<>();
        ListNode currentNode = listNode;

        while ( currentNode != null ) {

            integers.add( currentNode.val );
            currentNode = currentNode.next;
        }

        int[] ints = new int[integers.size()];

        for ( int i = 0; i < integers.size(); i++ ) {

            ints[i] = integers.get( i );
        }

        return ints;
    }


    private void assertTrue( ListNode listNode, int... values ) {

        int[] expected = getNumbers( listNode );
        Assert.assertArrayEquals( values, expected );
    }


    void mergeTwoListsTest_1() {

        ListNode list1 = createNode( 1, 2, 4 );
        ListNode list2 = createNode( 1, 3, 4 );
        ListNode merged = mergeTwoLists.mergeTwoLists( list1, list2 );
        assertTrue( merged, 1, 1, 2, 3, 4, 4 );

    }


    void mergeTwoListsTest_2() {

        ListNode list1 = createNode();
        ListNode list2 = createNode();
        ListNode merged = mergeTwoLists.mergeTwoLists( list1, list2 );
        assertTrue( merged );

    }


    void mergeTwoListsTest_3() {

        ListNode list1 = createNode();
        ListNode list2 = createNode( 0 );
        ListNode merged = mergeTwoLists.mergeTwoLists( list1, list2 );
        assertTrue( merged, 0 );
    }
}
