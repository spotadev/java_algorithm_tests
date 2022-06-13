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
package com.spotadev.algo.blind75.graphs.medium.pacific_atlantic_water_flow;

import java.util.List;

import org.testng.Assert;

/**
 * @author John Dickerson - 12 Jun 2022
 */
public abstract class AbstractPacificAtlanticWaterflowTest {

    protected PacificAtlanticWaterflowAPI pacificAtlanticWaterflow;

    private void check( List<List<Integer>> result, int[][] coordinates ) {

        Assert.assertEquals( result.size(), coordinates.length );

        for ( int[] coordinate : coordinates ) {

            int expectedRow = coordinate[0];
            int expectedCol = coordinate[1];
            boolean found = false;

            for ( List<Integer> point : result ) {

                if ( point.get( 0 ) == expectedRow && point.get( 1 ) == expectedCol ) {
                    found = true;
                    break;
                }
            }

            if ( !found ) {

                Assert.fail( "Did not find: " + expectedRow + " " + expectedCol );
            }
        }
    }


    public void pacificAtlanticTest_1() {

        int[][] heights = new int[][] {
                { 1, 2, 2, 3, 5 },
                { 3, 2, 3, 4, 4 },
                { 2, 4, 5, 3, 1 },
                { 6, 7, 1, 4, 5 },
                { 5, 1, 1, 2, 4 }
        };

        List<List<Integer>> result = pacificAtlanticWaterflow.pacificAtlantic( heights );

        int[][] expected = new int[][] {
                { 0, 4 },
                { 1, 3 },
                { 1, 4 },
                { 2, 2 },
                { 3, 0 },
                { 3, 1 },
                { 4, 0 } };

        check( result, expected );

    }


    public void pacificAtlanticTest_2() {

        int[][] heights = new int[][] {
                { 2, 1 },
                { 1, 2 }
        };

        List<List<Integer>> result = pacificAtlanticWaterflow.pacificAtlantic( heights );

        int[][] expected = new int[][] {
                { 0, 0 },
                { 0, 1 },
                { 1, 0 },
                { 1, 1 } };

        check( result, expected );
    }
}
