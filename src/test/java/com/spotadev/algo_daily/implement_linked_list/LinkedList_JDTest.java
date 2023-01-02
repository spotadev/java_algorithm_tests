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

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class LinkedList_JDTest extends AbstractLinkedListTest {

    @BeforeTest
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
