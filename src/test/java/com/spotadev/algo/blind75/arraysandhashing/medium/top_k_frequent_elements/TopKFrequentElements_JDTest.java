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
package com.spotadev.algo.blind75.arraysandhashing.medium.top_k_frequent_elements;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class TopKFrequentElements_JDTest extends AbstractTopKFrequentElementsTest {

    @BeforeClass
    public void setUp() {

        topKFrequentElements = new TopKFrequentElements_JD();
    }


    @Test
    public void topKFrequentTest_1() {

        super.topKFrequentTest_1();
    }


    @Test
    public void topKFrequentTest_2() {

        super.topKFrequentTest_2();
    }
}
