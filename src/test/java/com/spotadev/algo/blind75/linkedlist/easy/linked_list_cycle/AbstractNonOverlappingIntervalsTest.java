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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=gBTe7lFR3vc
 * 
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 *     Your runtime beats 6.16 % of java submissions.
 *     Your memory usage beats 11.76 % of java submissions.
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by 
 * continuously following the next pointer. Internally, pos is used to denote the index of the node 
 * that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * 
 * Return true if there is a cycle in the linked list. Otherwise, return false. 
 * 
 * Example 1:
 * 
 *     Input: head = [3,2,0,-4], pos = 1
 *     Output: true
 *     Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * 
 * Example 2:
 * 
 *     Input: head = [1,2], pos = 0
 *     Output: true
 *     Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * 
 * Example 3:
 * 
 *     Input: head = [1], pos = -1
 *     Output: false
 *     Explanation: There is no cycle in the linked list.
 *  
 * 
 * Constraints:
 * 
 *     The number of the nodes in the list is in the range [0, 104].
 *     -105 <= Node.val <= 10^5
 *     pos is -1 or a valid index in the linked-list.
 * 
 * 
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 * 
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


    void hasCycleTest_1() {

        ListNode head = createNode( 1, new int[] { 3, 2, 0, -4 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertTrue( hasCycle );
    }


    void hasCycleTest_2() {

        ListNode head = createNode( 0, new int[] { 1, 2 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertTrue( hasCycle );
    }


    void hasCycleTest_3() {

        ListNode head = createNode( -1, new int[] { 1 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertFalse( hasCycle );
    }


    void hasCycleTest_4() {

        ListNode head = createNode( -1, new int[] { 1, 2 } );
        boolean hasCycle = linkedListCycle.hasCycle( head );
        Assert.assertFalse( hasCycle );
    }
}
