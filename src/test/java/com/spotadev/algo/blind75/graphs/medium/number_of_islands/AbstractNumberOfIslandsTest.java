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

import org.testng.Assert;

/**
 * @author John Dickerson - 11 Jun 2022
 */
public abstract class AbstractNumberOfIslandsTest {

    protected NumberOfIslandsAPI numberOfIslands;

    public void numIslandsTest_1() {

        char[][] grid = new char[][] {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };

        int numIslands = numberOfIslands.numIslands( grid );
        Assert.assertEquals( numIslands, 1 );
    }


    public void numIslandsTest_2() {

        char[][] grid = new char[][] {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };

        int numIslands = numberOfIslands.numIslands( grid );
        Assert.assertEquals( numIslands, 3 );
    }

}
