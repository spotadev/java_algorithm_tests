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
package com.spotadev.algo.blind75.linkedlist.medium.reorder_list;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.linkedlist.medium.reorder_list.ListNode;
import com.spotadev.algo.blind75.linkedlist.medium.reorder_list.ReorderList;

/**
 * @author John Dickerson - 9 May 2022
 */
public class ReorderListTest {

    private ReorderList reorderList;

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


    @BeforeClass
    public void setUp() {

        reorderList = new ReorderList();
    }


    @Test
    public void reorderListTest_1() {

        ListNode listNode = createListNode( new int[] { 1, 2, 3, 4 } );
        reorderList.reorderList( listNode );
        assertTrue( listNode, new int[] { 1, 4, 2, 3 } );
    }


    @Test
    public void reorderListTest_2() {

        ListNode listNode = createListNode( new int[] { 1, 2, 3, 4, 5 } );
        reorderList.reorderList( listNode );
        assertTrue( listNode, new int[] { 1, 5, 2, 4, 3 } );
    }
}
