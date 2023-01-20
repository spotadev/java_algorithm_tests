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

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
public class LinkedList_JDTest extends AbstractLinkedListTest {

    @BeforeMethod
    public void setUp() {

        linkedList = new LinkedListJD();
    }


    @Test
    public void prependOnlyTest() {

        super.prependOnlyTest();
    }


    @Test
    public void prependThanAppendTest() {

        super.prependThanAppendTest();
    }


    @Test
    public void prependAppendMixedTest() {

        super.prependAppendMixedTest();
    }
}
