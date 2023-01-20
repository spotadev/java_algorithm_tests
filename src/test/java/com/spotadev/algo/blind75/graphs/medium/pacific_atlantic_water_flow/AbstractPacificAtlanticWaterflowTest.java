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
 * https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=s-VkcjHqkGI
 * 
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 * 
 *    Runtime: 4 ms, faster than 98.54% of Java online submissions for Pacific Atlantic Water Flow.
 *    
 *    Memory Usage: 43.7 MB, less than 82.61% of Java online submissions for Pacific Atlantic 
 *    Water Flow.
 * 
 * There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. 
 * The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches 
 * the island's right and bottom edges.
 * 
 * The island is partitioned into a grid of square cells. You are given an m x n integer matrix 
 * heights where heights[r][c] represents the height above sea level of the cell at 
 * coordinate (r, c).
 * 
 * The island receives a lot of rain, and the rain water can flow to neighboring cells directly 
 * north, south, east, and west if the neighboring cell's height is less than or equal to the 
 * current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.
 * 
 * Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water 
 * can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
 * 
 * Example 1:
 *      
 *               PPPPPPPPPPPPP
 *               P{1,2,2,3,5}A
 *               P{3,2,3,4,4}A
 *               P{2,4,5,3,1}A
 *               P{6,7,1,4,5}A
 *               P{5,1,1,2,4}A
 *               AAAAAAAAAAAAA
 * 
 *     Input: heights = {
 *                        {1,2,2,3,5}
 *                        {3,2,3,4,4}
 *                        {2,4,5,3,1}
 *                        {6,7,1,4,5}
 *                        {5,1,1,2,4}
 *                      } 
 *                         
 *     Output: { {0,4},{1,3},{1,4},{2,2},{3,0},{3,1},{4,0}}
 * 
 * Example 2:
 * 
 *                 PPPPPPP
 *                 P{2,1}A
 *                 P{1,2}A
 *                 AAAAAAA
 *                   
 *     Input: heights = {
 *                        {2,1},
 *                        {1,2}
 *                      }
 *                      
 *     Output: {{0,0},{0,1},{1,0},{1,1}}
 * 
 * Constraints:
 * 
 *     m == heights.length
 *     n == heights[r].length
 *     1 <= m, n <= 200
 *     0 <= heights[r][c] <= 105
 * 
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


    void pacificAtlanticTest_1() {

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


    void pacificAtlanticTest_2() {

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
