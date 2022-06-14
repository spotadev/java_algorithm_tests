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


    public void reverseListTest_1() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] { 1, 2, 3, 4, 5 } ) );

        assertTrue( resultListNode, new int[] { 5, 4, 3, 2, 1 } );
    }


    public void reverseListTest_2() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] { 1, 2 } ) );

        assertTrue( resultListNode, new int[] { 2, 1 } );
    }


    public void reverseListTest_3() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] {} ) );

        assertTrue( resultListNode, new int[] {} );
    }
}