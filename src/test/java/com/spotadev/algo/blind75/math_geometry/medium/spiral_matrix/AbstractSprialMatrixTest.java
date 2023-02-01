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
package com.spotadev.algo.blind75.math_geometry.medium.spiral_matrix;

import java.util.Arrays;
import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=BJnMZNwUk1M
 * 
 * https://leetcode.com/problems/spiral-matrix/
 * 
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * 
 * Example 1:
 * 
 *     Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *     Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Example 2:
 * 
 *     Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 *     Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * Constraints:
 * 
 *     m == matrix.length
 *     n == matrix[i].length
 *     1 <= m, n <= 10
 *     -100 <= matrix[i][j] <= 100
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractSprialMatrixTest {

    protected SpiralMatrixAPI spiralMatrix;

    void spiralOrder_1Test() {

        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> result = spiralMatrix.spiralOrder( matrix );
        int[] ints = result.stream().mapToInt( i -> i ).toArray();
        Arrays.equals( ints, new int[] { 1, 2, 3, 6, 9, 8, 7, 4, 5 } );
    }


    void spiralOrder_2Test() {

        int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> result = spiralMatrix.spiralOrder( matrix );
        int[] ints = result.stream().mapToInt( i -> i ).toArray();
        Arrays.equals( ints, new int[] { 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7 } );
    }
}
