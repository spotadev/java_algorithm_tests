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
package com.spotadev.algo.hard.sort.heap_sort;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author johndickerson - 30 Dec 2022
 */
public class HeapSort_KMTest extends AbstractHeapSortTest {

    @BeforeClass
    public void setUp() {

        heapSort = new HeapSort_KM();
    }


    @Test
    public void heapSortTest() {

        super.heapSortTest();
    }
}