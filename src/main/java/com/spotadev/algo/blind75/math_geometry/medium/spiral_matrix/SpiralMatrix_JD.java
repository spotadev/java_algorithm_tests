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

import java.util.ArrayList;
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
 *     Input: matrix = [[1,2,3],
 *                      [4,5,6],
 *                      [7,8,9]]
 *                      
 *     Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Example 2:
 * 
 *     Input: matrix = [[1,2,3,4],
 *                      [5,6,7,8],
 *                      [9,10,11,12]]
 *                      
 *     Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * Constraints:
 * 
 *     m == matrix.length
 *     n == matrix[i].length
 *     1 <= m, n <= 10
 *     -100 <= matrix[i][j] <= 100
 * 
 * @author John Dickerson - 19 May 2022
 */
public class SpiralMatrix_JD implements SpiralMatrixAPI {

    // We could have a rule that you try and:
    //    (i) go east
    //    (ii) else go south
    //    (iii) else go west
    //    (iv) else go north
    // as you navigate mark the matrix that you have visited a cell. 
    // You cannot visit a marked cell.
    @Override
    public List<Integer> spiralOrder( int[][] matrix ) {

        int r = 0;
        int c = 0;
        List<Integer> visited = new ArrayList<>();
        visited.add( matrix[r][c] );

        while ( true ) {

            if ( ( c + 1 ) < matrix[r].length && matrix[r][c + 1] != 400 ) {

                visited.add( matrix[r][c] );
                c = c + 1;
            }
            else if ( ( r + 1 ) < matrix.length && matrix[r + 1][c] != 400 ) {

                visited.add( matrix[r + 1][c] );
                r = r + 1;
            }
            else if ( c - 1 >= 0 && matrix[r][c - 1] != 400 ) {

                visited.add( matrix[r][c - 1] );
                c = c - 1;
            }
            else if ( r - 1 >= 0 && matrix[r - 1][c] != 400 ) {

                visited.add( matrix[r - 1][c] );
                r = r - 1;
            }
            else {
                break;
            }

            matrix[r][c] = 400;
        }

        return visited;

    }
}
