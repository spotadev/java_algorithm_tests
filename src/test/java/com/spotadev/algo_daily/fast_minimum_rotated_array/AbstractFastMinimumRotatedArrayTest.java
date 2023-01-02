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
package com.spotadev.algo_daily.fast_minimum_rotated_array;

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractFastMinimumRotatedArrayTest {

    protected FastMinimumRotatedArrayAPI fastMinimumRotatedArrayAPI;

    public void getMinimum_1Test() {

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int minimum = fastMinimumRotatedArrayAPI.getMinimum( numbers );
        Assert.assertEquals( minimum, 0 );
    }


    public void getMinimum_2Test() {

        int[] numbers = { 4, 5, 1, 2, 3 };
        int minimum = fastMinimumRotatedArrayAPI.getMinimum( numbers );
        Assert.assertEquals( minimum, 1 );
    }


    public void getMinimum_3Test() {

        int[] numbers = { 5, 6, 7, 0, 1, 2, 3 };
        int minimum = fastMinimumRotatedArrayAPI.getMinimum( numbers );
        Assert.assertEquals( minimum, 0 );
    }
}
