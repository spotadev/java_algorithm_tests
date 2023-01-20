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
 * https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=pV2kpPD66nE
 * 
 * https://leetcode.com/problems/number-of-islands/
 * 
 *     Runtime: 3 ms, faster than 96.23% of Java online submissions for Number of Islands.
 *     
 *     Memory Usage: 57.9 MB, less than 19.77% of Java online submissions for Number of Islands.
 * 
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), 
 * return the number of islands.
 * 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or 
 * vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 *     Input: 
 *         grid = [
 *             ["1","1","1","1","0"],
 *             ["1","1","0","1","0"],
 *             ["1","1","0","0","0"],
 *             ["0","0","0","0","0"]
 *         ]
 *      
 *      Output: 1
 * 
 * Example 2:
 * 
 *     Input: 
 *         grid = [
 *            ["1","1","0","0","0"],
 *            ["1","1","0","0","0"],
 *            ["0","0","1","0","0"],
 *            ["0","0","0","1","1"]
 *         ]
 * 
 *     Output: 3
 *  
 * Constraints:
 * 
 *     m == grid.length
 *     n == grid[i].length
 *     1 <= m, n <= 300
 *     grid[i][j] is '0' or '1'.
 *     
 * @author John Dickerson - 11 Jun 2022
 */
public class NumberOfIslands_JDTest extends AbstractNumberOfIslandsTest {

    @BeforeClass
    public void setUp() {

        numberOfIslands = new NumberOfIslands_JD();
    }


    @Test
    public void numIslandsTest_1() {

        super.numIslandsTest_1();
    }


    @Test
    public void numIslandsTest_2() {

        super.numIslandsTest_2();
    }
}
