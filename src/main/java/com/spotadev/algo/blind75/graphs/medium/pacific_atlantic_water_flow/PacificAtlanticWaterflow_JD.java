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

import java.util.ArrayList;
import java.util.List;

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
 * @author John Dickerson - 13 May 2022
 */
public class PacificAtlanticWaterflow_JD implements PacificAtlanticWaterflowAPI {

    private void dfs(
            int previousValue, int r, int c, int[][] heights, boolean[][] reachesSea,
            int numRows, int numCols ) {

        if ( r < 0 || c < 0 || r >= numRows || c >= numCols || heights[r][c] < previousValue
                || reachesSea[r][c] )
            return;

        reachesSea[r][c] = true;
        previousValue = heights[r][c];
        dfs( previousValue, r + 1, c, heights, reachesSea, numRows, numCols );
        dfs( previousValue, r - 1, c, heights, reachesSea, numRows, numCols );
        dfs( previousValue, r, c + 1, heights, reachesSea, numRows, numCols );
        dfs( previousValue, r, c - 1, heights, reachesSea, numRows, numCols );
    }


    private void debug( String message, boolean[][] access ) {

        StringBuilder sb = new StringBuilder();
        sb.append( message ).append( "\n\n" );

        for ( int r = 0; r < access.length; r++ ) {

            for ( int c = 0; c < access[0].length; c++ ) {

                String bool = "F";

                if ( access[r][c] ) {
                    bool = "T";
                }

                sb.append( bool ).append( " " );
            }

            sb.append( "\n" );
        }

        sb.append( "\n" );
        System.out.println( sb.toString() );
    }


    private void debug( String message, int[][] heights ) {

        StringBuilder sb = new StringBuilder();
        sb.append( message ).append( "\n\n" );

        for ( int r = 0; r < heights.length; r++ ) {

            for ( int c = 0; c < heights[0].length; c++ ) {

                sb.append( heights[r][c] ).append( " " );
            }

            sb.append( "\n" );
        }

        sb.append( "\n" );
        System.out.println( sb.toString() );
    }


    private void debug( String message, List<List<Integer>> results ) {

        StringBuilder sb = new StringBuilder();
        sb.append( message ).append( "\n\n" );

        for ( List<Integer> coordinate : results ) {

            for ( Integer p : coordinate ) {

                sb.append( p ).append( " " );
            }

            sb.append( "\n" );
        }

        sb.append( "\n" );
        System.out.println( sb.toString() );
    }


    public List<List<Integer>> pacificAtlantic( int[][] heights ) {

        List<List<Integer>> results = new ArrayList<>();
        int numRows = heights.length;
        int numCols = heights[0].length;

        boolean[][] reachesPacific = new boolean[numRows][numCols];
        boolean[][] reachesAtlantic = new boolean[numRows][numCols];
        boolean[][] reachesCombined = new boolean[numRows][numCols];

        for ( int r = 0; r < numRows; r++ ) {

            // start west coast
            int c = 0;
            dfs( -1, r, c, heights, reachesPacific, numRows, numCols );

            // start east coast
            c = numCols - 1;
            dfs( -1, r, c, heights, reachesAtlantic, numRows, numCols );
        }

        for ( int c = 0; c < numCols; c++ ) {

            // start north
            int r = 0;
            dfs( -1, r, c, heights, reachesPacific, numRows, numCols );

            // start south
            r = numRows - 1;
            dfs( -1, r, c, heights, reachesAtlantic, numRows, numCols );
        }

        debug( "Heights", heights );
        debug( "Pacific", reachesPacific );
        debug( "Atlantic", reachesAtlantic );

        for ( int r = 0; r < numRows; r++ ) {

            for ( int c = 0; c < numCols; c++ ) {

                if ( reachesPacific[r][c] && reachesAtlantic[r][c] ) {

                    reachesCombined[r][c] = true;
                    List<Integer> point = new ArrayList<>();
                    point.add( r );
                    point.add( c );
                    results.add( point );
                }
            }
        }

        debug( "Reach both seas", reachesCombined );
        debug( "Results ", results );
        return results;
    }
}
