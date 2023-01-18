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

import java.util.Arrays;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractTopKFrequentElementsTest {

    protected TopKFrequentElementsAPI topKFrequentElements;

    void topKFrequentTest_1() {

        int[] mostFrequent = topKFrequentElements.topKFrequent( new int[] { 1, 1, 1, 2, 2, 3 }, 2 );
        Assert.assertTrue( Arrays.equals( mostFrequent, new int[] { 1, 2 } ) );
    }


    void topKFrequentTest_2() {

        int[] mostFrequent = topKFrequentElements.topKFrequent( new int[] { 1 }, 1 );
        Assert.assertTrue( Arrays.equals( mostFrequent, new int[] { 1 } ) );
    }
}
