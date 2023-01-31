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
package com.spotadev.algo.blind75.math_geometry.medium.rotate_image;

import java.util.Arrays;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=fMSJSS7eO1w
 * 
 * https://leetcode.com/problems/rotate-image/
 * 
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees 
 * (clockwise).
 * 
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix 
 * directly. DO NOT allocate another 2D matrix and do the rotation.
 * 
 * Example 1:
 *
 *     Input: matrix = [[1,2,3],
 *                      [4,5,6],
 *                      [7,8,9]]
 *     
 *     Rows to columns, intermediary algo step:
 *     
 *          1  4  7   Then we swap 7 with 1 
 *          2  5  8   Then we swap 8 with 2
 *          3  6  9   Then we swap 9 with 3
 *     
 *     Output: [[7,4,1],
 *              [8,5,2],
 *              [9,6,3]]
 * 
 * Example 2:
 * 
 *     Input: matrix = [[5,1,9,11],
 *                      [2,4,8,10],
 *                      [13,3,6,7],
 *                      [15,14,12,16]]
 *                      
 *     Rows to columns, intermediary algo step:
 *     
 *               5  2 13 15    Then we swap 15 with 5 and 13 with 2
 *               1  4  3 14    Then we swap 14 with 1 and 3 with 2
 *               9  8  6 12    Then we swap 12 with 9 and 6 with 8
 *              11 10  7 16    Then we swap 16 with 11 and 7 with 10
 *              
 *     
 *     Output: [[15,13,2,5],
 *              [14,3,4,1],
 *              [12,6,8,9],
 *              [16,7,10,11]]
 *  
 * Constraints:
 * 
 *     n == matrix.length == matrix[i].length
 *     1 <= n <= 20
 *     -1000 <= matrix[i][j] <= 1000
 * 
 * @author John Dickerson - 19 May 2022
 */
public abstract class AbstractRotateImageTest {

    protected RotateImageAPI rotateImage;

    void rotate_1Test() {

        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateImage.rotate( matrix );
        Assert.assertTrue( Arrays.equals( matrix[0], new int[] { 7, 4, 1 } ) );
        Assert.assertTrue( Arrays.equals( matrix[1], new int[] { 8, 5, 2 } ) );
        Assert.assertTrue( Arrays.equals( matrix[2], new int[] { 9, 6, 3 } ) );
    }


    void rotate_2Test() {

        int[][] matrix = new int[][] {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 } };

        rotateImage.rotate( matrix );
        Assert.assertTrue( Arrays.equals( matrix[0], new int[] { 15, 13, 2, 5 } ) );
        Assert.assertTrue( Arrays.equals( matrix[1], new int[] { 14, 3, 4, 1 } ) );
        Assert.assertTrue( Arrays.equals( matrix[2], new int[] { 12, 6, 8, 9 } ) );
        Assert.assertTrue( Arrays.equals( matrix[3], new int[] { 16, 7, 10, 11 } ) );
    }
}
