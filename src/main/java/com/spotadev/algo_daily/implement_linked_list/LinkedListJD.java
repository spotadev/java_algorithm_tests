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
package com.spotadev.algo_daily.implement_linked_list;

/**
 * https://algodaily.com/challenges/implement-a-linked-list
 * 
 * Implement a linked list from scratch
 *
 * Constraints
 * 
 *    The numbers in the node to be added are within the integer limits
 * 
 *    Time Complexity for prepending and appending operations: O(1)
 * 
 *    Space Complexity for appending and prepending: 0(1)
 *    
 * @author John Dickerson - 2 Jan 2023
 */
public class LinkedListJD implements LinkedListAPI {

    private LinkedListNode head;

    @Override
    public LinkedListNode getHead() {

        return head;
    }


    @Override
    public LinkedListNode getTail() {

        if ( head.next == null ) {

            return head;
        }

        LinkedListNode node = head;

        while ( true ) {

            if ( node.next == null ) {

                return node;
            }
            else {
                node = node.next;
            }
        }
    }


    @Override
    public void prepend( int newVal ) {

        LinkedListNode node = new LinkedListNode( newVal );

        if ( head == null ) {

            head = node;
        }
        else {

            node.next = head;
            head = node;
        }
    }


    @Override
    public void append( int newVal ) {

        LinkedListNode node = new LinkedListNode( newVal );
        LinkedListNode tail = getTail();

        if ( tail == null ) {

            head = node;
        }
        else {
            tail.next = node;
        }
    }
}
