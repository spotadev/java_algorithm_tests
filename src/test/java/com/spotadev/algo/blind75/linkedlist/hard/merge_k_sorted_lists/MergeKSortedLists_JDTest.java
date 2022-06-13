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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 6 Feb 2022
 */
public class MergeKSortedLists_JDTest extends AbstractMergeKSortedListsTest {

    @BeforeClass
    public void setUp() {

        mergeKSortedLists = new MergeKSortedLists_JD();
    }


    @Test
    public void mergeKListsTest_1() {

        super.mergeKListsTest_1();
    }


    @Test
    public void mergeKListsTest_2() {

        super.mergeKListsTest_2();
    }


    @Test
    public void mergeKListsTest_3() {

        super.mergeKListsTest_3();
    }
}
