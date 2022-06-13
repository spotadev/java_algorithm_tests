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
package com.spotadev.algo.blind75.linkedlist.medium.remove_nth_node_from_end_of_list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 10 May 2022
 */
public class RemoveNthNodeFromEndOfList_JDTest {

    private RemoveNthNodeFromEndOfListAPI removeNthNodeFromEndOfList;

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


    @BeforeClass
    public void setUp() {

        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList_JD();
    }


    @Test
    public void removeNthFromEndTest_1() {

        ListNode head = createNode( new int[] { 1, 2, 3, 4, 5 } );
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd( head, 2 );
        assertTrue( listNode, new int[] { 1, 2, 3, 5 } );
    }


    @Test
    public void removeNthFromEndTest_2() {

        ListNode head = createNode( new int[] { 1 } );
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd( head, 1 );
        assertTrue( listNode, new int[] {} );
    }


    @Test
    public void removeNthFromEndTest_3() {

        ListNode head = createNode( new int[] { 1, 2 } );
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd( head, 1 );
        assertTrue( listNode, new int[] { 1 } );
    }
}
