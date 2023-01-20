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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=IlEsdxuD4lY
 * 
 * https://leetcode.com/problems/unique-paths/
 * 
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner 
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner 
 * (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 * 
 * Given the two integers m and n, return the number of possible unique paths that the robot can 
 * take to reach the bottom-right corner.
 * 
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 * 
 * Example 1:
 * 
 *     Input: m = 3, n = 7
 *     Output: 28
 * 
 * Example 2:
 * 
 *     Input: m = 3, n = 2
 *     Output: 3
 *     
 *     Explanation: From the top-left corner, there are a total of 3 ways to reach the 
 *     bottom-right corner:
 *         1. Right -> Down -> Down
 *         2. Down -> Down -> Right
 *         3. Down -> Right -> Down
 * 
 * Constraints:
 * 
 *     1 <= m, n <= 100
 *     
 * @author John Dickerson - 14 Jun 2022
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
