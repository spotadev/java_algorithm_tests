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
package com.spotadev.algo.blind75.twopointers.difficulty_1.three_sum;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.twopointers.medium.three_sum.ThreeSum_Slow_JD;

/**
 * @author John Dickerson - 2 May 2022
 */
public class ThreeSum_SlowTest extends AbstractThreeSumTest {

    @BeforeClass
    public void setUp() {

        threeSum = new ThreeSum_Slow_JD();
    }


    @Test
    public void threeSumTest_1() {

        super.threeSumTest_1();
    }


    @Test
    public void threeSumTest_2() {

        super.threeSumTest_2();
    }


    @Test
    public void threeSumTest_3() {

        super.threeSumTest_3();
    }


    @Test
    public void threeSumTest_4() {

        super.threeSumTest_4();
    }


    @Test
    public void threeSumTest_5() {

        super.threeSumTest_5();
    }
}
