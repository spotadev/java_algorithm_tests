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
package com.spotadev.algo.blind75.linkedlist.easy.linked_list_cycle;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 10 May 2022
 */
public class LinkedListCycleFast_JDTest extends AbstractNonOverlappingIntervalsTest {

    @BeforeClass
    public void setUp() {

        linkedListCycle = new LinkedListCycleFast_JD();
    }


    @Test
    public void hasCycleTest_1() {

        super.hasCycleTest_1();
    }


    @Test
    public void hasCycleTest_2() {

        super.hasCycleTest_2();
    }


    @Test
    public void hasCycleTest_3() {

        super.hasCycleTest_3();
    }


    @Test
    public void hasCycleTest_4() {

        super.hasCycleTest_4();
    }
}
