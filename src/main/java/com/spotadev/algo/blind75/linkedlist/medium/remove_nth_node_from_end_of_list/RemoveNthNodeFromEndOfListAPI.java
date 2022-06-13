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

/**
* @author John Dickerson - 13 Jun 2022
*/
public interface RemoveNthNodeFromEndOfListAPI {

    // Consider:
    // 1 2 3 4 5 n = 2
    // 
    // 1 2 3 4 5
    // L   R          - R is 2 spaces to the right of L
    //   L   R        - we now start sliding right until next is null
    //     L   R
    //       L   R    - now next is null.  That means L is at the index which needs removing
    // The problem is with this approach that we do not have the previous node to L (4)
    // 
    // Therefore we do the same as above except we add a dummyNode at the beginning and we increase
    // the gap between L and R by one:
    //
    // D 1 2 3 4 5
    // L     R
    //   L     R
    //     L     R
    //       L     R
    // Now we have reference to 3 so we can skip past 4 and connect with 5
    ListNode removeNthFromEnd( ListNode head, int n );

}