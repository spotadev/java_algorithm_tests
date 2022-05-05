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
package com.spotadev.algo.blind75.twopointers.difficulty_1.containerwithmostwater;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.twopointers.medium.containerwithmostwater.ContainerWithMostWater;

/**
 * @author John Dickerson - 3 May 2022
 */
public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeClass
    public void setUp() {

        containerWithMostWater = new ContainerWithMostWater();
    }


    @Test
    public void maxAreaTest_1() {

        int max = containerWithMostWater.maxArea( new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 } );
        Assert.assertEquals( max, 49 );
    }


    @Test
    public void maxAreaTest_2() {

        int max = containerWithMostWater.maxArea( new int[] { 1, 1 } );
        Assert.assertEquals( max, 1 );
    }
}
