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
package com.spotadev.algo.blind75.linkedlist.easy.reverse_linked_list;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 *     Memory Usage: 41.9 MB, less than 86.96% of Java online submissions for Reverse Linked List.
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Example 1:
 * 
 *     Input: head = [1,2,3,4,5]
 *     Output: [5,4,3,2,1]
 * 
 * Example 2:
 * 
 *     Input: head = [1,2]
 *     Output: [2,1]
 * 
 * Example 3:
 * 
 *     Input: head = []
 *     Output: []
 * 
 * Constraints:
 * 
 *     The number of nodes in the list is the range [0, 5000].
 *     -5000 <= Node.val <= 5000
 * 
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you 
 * implement both?
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractReverseLinkedListTest {

    protected ReverseLinkedListAPI reverseLinkedList;

    private ListNode createListNode( int[] array ) {

        ListNode dummy = new ListNode();
        ListNode lastNode = dummy;

        for ( int number : array ) {

            ListNode listNode = new ListNode( number );
            lastNode.next = listNode;
            lastNode = listNode;
        }

        return dummy.next;
    }


    private void assertTrue( ListNode listNode, int[] expected ) {

        for ( int number : expected ) {

            if ( listNode == null ) {

                Assert.fail( "Missing expected values" );
            }

            Assert.assertEquals( listNode.val, number );
            listNode = listNode.next;
        }
    }


    void reverseListTest_1() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] { 1, 2, 3, 4, 5 } ) );

        assertTrue( resultListNode, new int[] { 5, 4, 3, 2, 1 } );
    }


    void reverseListTest_2() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] { 1, 2 } ) );

        assertTrue( resultListNode, new int[] { 2, 1 } );
    }


    void reverseListTest_3() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] {} ) );

        assertTrue( resultListNode, new int[] {} );
    }
}
