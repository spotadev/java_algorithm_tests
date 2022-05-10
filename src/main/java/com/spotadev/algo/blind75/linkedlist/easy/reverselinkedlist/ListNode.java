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

/**
 * @author John Dickerson - 6 May 2022
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {

    }


    ListNode( int val ) {

        this.val = val;
    }


    ListNode( int val, ListNode next ) {

        this.val = val;
        this.next = next;
    }


    @Override
    public String toString() {

        return "ListNode [val=" + val + "]";
    }
}
