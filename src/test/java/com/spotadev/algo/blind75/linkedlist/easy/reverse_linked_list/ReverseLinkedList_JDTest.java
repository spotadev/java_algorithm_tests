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
package com.spotadev.algo.blind75.linkedlist.easy.reverse_linked_list;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 6 May 2022
 */
public class ReverseLinkedList_JDTest extends AbstractReverseLinkedListTest {

    @BeforeClass
    public void setUp() {

        reverseLinkedList = new ReverseLinkedList_JD();
    }


    @Test
    public void reverseListTest_1() {

        super.reverseListTest_1();
    }


    @Test
    public void reverseListTest_2() {

        super.reverseListTest_2();
    }


    @Test
    public void reverseListTest_3() {

        super.reverseListTest_3();
    }
}
