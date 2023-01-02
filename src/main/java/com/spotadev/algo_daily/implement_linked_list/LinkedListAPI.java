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
 * @author Karema99 - 29 Aug 2022
 */
public interface LinkedListAPI {

    class LinkedListNode {

        public LinkedListNode next;
        public int val;

        public LinkedListNode( int val ) {

            this.val = val;
        }
    }

    void prepend( int newVal );


    void append( int newVal );


    LinkedListNode getHead();


    LinkedListNode getTail();
}
