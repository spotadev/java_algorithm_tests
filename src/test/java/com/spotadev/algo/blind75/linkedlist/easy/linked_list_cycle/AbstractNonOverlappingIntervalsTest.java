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
package com.spotadev.algo.blind75.linkedlist.easy.linked_list_cycle;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractNonOverlappingIntervalsTest {

    protected LinkedListCycleAPI linkedListCycle;

    private ListNode createNode( int pos, int... values ) {

        ListNode dummy = new ListNode( -1 );
        ListNode head = dummy;
        ListNode loopBackNode = null;

        for ( int i = 0; i < values.length; i++ ) {

            head.next = new ListNode( values[i] );

            if ( i == pos ) {

                loopBackNode = head.next;
            }

            head = head.next;
        }

        head.next = loopBackNode;
        return dummy.next;
    }


    public void hasCycleTest_1() {

        ListNode head = createNode( 1, new int[] { 3, 2, 0, -4 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertTrue( hasCycle );
    }


    public void hasCycleTest_2() {

        ListNode head = createNode( 0, new int[] { 1, 2 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertTrue( hasCycle );
    }


    public void hasCycleTest_3() {

        ListNode head = createNode( -1, new int[] { 1 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertFalse( hasCycle );
    }


    public void hasCycleTest_4() {

        ListNode head = createNode( -1, new int[] { 1, 2 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertFalse( hasCycle );
    }
}
