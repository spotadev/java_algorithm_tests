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
package com.spotadev.algo.difficulty_1.topkfrequentelements;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class TopKFrequentElementsTest {

    private TopKFrequentElements topKFrequentElements;

    @BeforeClass
    public void setUp() {

        topKFrequentElements = new TopKFrequentElements();
    }


    @Test
    public void topKFrequentTest_1() {

        int[] mostFrequent = topKFrequentElements.topKFrequent( new int[] { 1, 1, 1, 2, 2, 3 }, 2 );
        Assert.assertTrue( Arrays.equals( mostFrequent, new int[] { 1, 2 } ) );
    }


    @Test
    public void topKFrequentTest_2() {

        int[] mostFrequent = topKFrequentElements.topKFrequent( new int[] { 1 }, 1 );
        Assert.assertTrue( Arrays.equals( mostFrequent, new int[] { 1 } ) );
    }
}
