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
package com.spotadev.algo.blind75.arraysandhashing.difficulty_0.containsduplicates;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.arraysandhashing.difficulty_0.containsduplicates.ContainsDuplicates;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class ContainsDuplicatesTest {

    private ContainsDuplicates containsDuplicates;

    @BeforeClass
    public void setUp() {

        containsDuplicates = new ContainsDuplicates();
    }


    @Test
    public void containsDuplicateTest_1() {

        boolean hasDuplicates =
                containsDuplicates.containsDuplicate( new int[] { 1, 2, 3, 1 } );

        Assert.assertTrue( hasDuplicates );
    }


    @Test
    public void containsDuplicateTest_2() {

        boolean hasDuplicates =
                containsDuplicates.containsDuplicate( new int[] { 1, 2, 3, 4 } );

        Assert.assertFalse( hasDuplicates );
    }


    @Test
    public void containsDuplicateTest_3() {

        boolean hasDuplicates =
                containsDuplicates.containsDuplicate( new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 } );

        Assert.assertTrue( hasDuplicates );
    }
}
