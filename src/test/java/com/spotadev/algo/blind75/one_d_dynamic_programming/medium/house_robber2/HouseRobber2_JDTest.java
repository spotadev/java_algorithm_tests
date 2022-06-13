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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.house_robber2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class HouseRobber2_JDTest {

    private HouseRobber2API houseRobber2;

    @BeforeClass
    public void setUp() {

        houseRobber2 = new HouseRobber2_JD();
    }


    @Test
    public void robTest() {

        int[] nums = {};
        int results = houseRobber2.rob( nums );
    }
}
