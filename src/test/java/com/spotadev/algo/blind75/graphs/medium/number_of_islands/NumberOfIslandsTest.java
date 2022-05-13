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
package com.spotadev.algo.blind75.graphs.medium.number_of_islands;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;

    @BeforeClass
    public void setUp() {

        numberOfIslands = new NumberOfIslands();
    }


    @Test
    public void numIslandsTest() {

        char[][] grid = new char[][] {};
        int numIsIslands = numberOfIslands.numIslands( grid );
    }
}
