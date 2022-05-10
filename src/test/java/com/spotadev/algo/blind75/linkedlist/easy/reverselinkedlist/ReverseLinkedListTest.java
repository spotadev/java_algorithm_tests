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
package com.spotadev.algo.blind75.linkedlist.easy.reverselinkedlist;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 6 May 2022
 */
public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    @BeforeClass
    public void setUp() {

        reverseLinkedList = new ReverseLinkedList();
    }


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


    @Test
    public void reverseListTest_1() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] { 1, 2, 3, 4, 5 } ) );

        assertTrue( resultListNode, new int[] { 5, 4, 3, 2, 1 } );
    }


    @Test
    public void reverseListTest_2() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] { 1, 2 } ) );

        assertTrue( resultListNode, new int[] { 2, 1 } );
    }


    @Test
    public void reverseListTest_3() {

        ListNode resultListNode =
                reverseLinkedList.reverseList( createListNode( new int[] {} ) );

        assertTrue( resultListNode, new int[] {} );
    }
}
