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

/**
* @author John Dickerson - 13 Jun 2022
*/
public interface ReorderListAPI {

    // Assume:                               1 2 3 4 5
    // We want to change to:                 1 5 2 4 3
    //
    // The strategy has 3 steps:
    //
    // (i) Find the mid value:                   3
    // (ii) Reverse the right side:          1 2 3   5 4   
    // (iii) Merge the left and right side:  1 5   2 4   3
    void reorderList( ListNode head );

}