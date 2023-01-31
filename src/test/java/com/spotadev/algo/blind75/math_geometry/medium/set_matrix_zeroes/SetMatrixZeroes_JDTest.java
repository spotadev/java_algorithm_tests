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
package com.spotadev.algo.blind75.math_geometry.medium.set_matrix_zeroes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=T41rL0L3Pnw
 * 
 * https://leetcode.com/problems/set-matrix-zeroes/
 * 
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * 
 * You must do it in place.
 * 
 * Example 1:
 * 
 *     Input: matrix = [[1,1,1],
 *                      [1,0,1],[
 *                      1,1,1]]
 *                      
 *     Output: [[1,0,1],
 *              [0,0,0],
 *              [1,0,1]]
 * 
 * Example 2:
 * 
 *     Input: matrix = [[0,1,2,0],
 *                      [3,4,5,2],
 *                      [1,3,1,5]]
 *                      
 *     Output: [[0,0,0,0],
 *              [0,4,5,0],
 *              [0,3,1,0]]
 *  
 * Constraints:
 * 
 *     m == matrix.length
 *     n == matrix[0].length
 *     1 <= m, n <= 200
 *     -231 <= matrix[i][j] <= 231 - 1
 * 
 * Follow up:
 * 
 * A straightforward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 * 
 * @author John Dickerson - 19 May 2022
 */
public class SetMatrixZeroes_JDTest extends AbstractSetMatrixZeroesTest {

    @BeforeClass
    public void setUp() {

        setMatrixZeroes = new SetMatrixZeroes_JD();
    }


    @Test
    public void setZeroes_1Test() {

        super.setZeroes_1Test();
    }


    @Test
    public void setZeroes_2Test() {

        super.setZeroes_2Test();
    }
}
