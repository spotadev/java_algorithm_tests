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
package com.spotadev.algo.blind75.two_d_dynamic_programming.medium.unique_paths;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 14 May 2022
 */
public class UniquePaths_JDTest extends AbstractUniquePathsTest {

    @BeforeClass
    public void setUp() {

        uniquePaths = new UniquePaths_JD();
    }


    @Test
    public void uniquePathsTest() {

        super.uniquePathsTest();
    }
}
