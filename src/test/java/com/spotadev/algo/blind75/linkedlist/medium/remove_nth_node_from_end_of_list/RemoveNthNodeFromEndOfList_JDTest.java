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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 10 May 2022
 */
public class RemoveNthNodeFromEndOfList_JDTest extends AbstractRemoveNthNodeFromEndOfListTest {

    protected RemoveNthNodeFromEndOfListAPI removeNthNodeFromEndOfList;

    @BeforeClass
    public void setUp() {

        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList_JD();
    }


    @Test
    public void removeNthFromEndTest_1() {

        super.removeNthFromEndTest_1();
    }


    @Test
    public void removeNthFromEndTest_2() {

        super.removeNthFromEndTest_2();
    }


    @Test
    public void removeNthFromEndTest_3() {

        super.removeNthFromEndTest_3();
    }
}
