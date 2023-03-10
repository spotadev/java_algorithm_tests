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
package com.spotadev.algo.blind75.linkedlist.hard.merge_k_sorted_lists;

/**
 * @author John Dickerson - 5 Feb 2022
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

        StringBuilder sb = new StringBuilder();
        sb.append( val );

        if ( next != null ) {

            sb.append( ", " );

            if ( next != null ) {

                sb.append( next.toString() );
            }
        }

        return sb.toString();
    }
}
