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
package com.spotadev.algo.easy.mergetwolists;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {

    }


    public ListNode( int val ) {

        this.val = val;
    }


    public ListNode( int val, ListNode next ) {

        this.val = val;
        this.next = next;
    }
}
