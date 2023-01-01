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
package com.spotadev.algo.hard.median2sorted_arrays_duplicates_removed;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author johndickerson - 30 Dec 2022
 */
public class Median2SortedArraysDuplicatesRemoved_JDTest extends
        AbstractMedian2SortedArraysDuplicatesRemovedTest {

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArraysDuplicatesRemoved_JD();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        super.findMedianUsingThirdArray_evenLengthMergedTest();
    }


    @Test
    public void findMedianUsingThirdArray_oddLengthMergedTest() {

        super.findMedianUsingTreeSet_oddLengthMergedTest();
    }


    @Test
    public void findMedianUsingTreeSet_evenLengthMergedTest() {

        super.findMedianUsingTreeSet_evenLengthMergedTest();
    }


    @Test
    public void findMedianUsingTreeSet_oddLengthMergedTest() {

        super.findMedianUsingTreeSet_oddLengthMergedTest();
    }


    @Test
    public void findMedianUsingThirdArray_test_O_Notation() {

        super.findMedianUsingThirdArray_test_O_Notation();
    }


    @Test
    public void findMedianUsingTreeSet_test_O_Notation() {

        super.findMedianUsingTreeSet_test_O_Notation();
    }
}
