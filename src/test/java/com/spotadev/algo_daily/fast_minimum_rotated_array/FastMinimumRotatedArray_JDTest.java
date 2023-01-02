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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class FastMinimumRotatedArray_JDTest extends AbstractFastMinimumRotatedArrayTest {

    @BeforeClass
    public void setUp() {

        fastMinimumRotatedArrayAPI = new FastMinimumRotatedArrayJD();
    }


    @Test
    public void getMinimum_1Test() {

        super.getMinimum_1Test();
    }


    @Test
    public void getMinimum_2Test() {

        super.getMinimum_2Test();
    }


    @Test
    public void getMinimum_3Test() {

        super.getMinimum_3Test();
    }
}
