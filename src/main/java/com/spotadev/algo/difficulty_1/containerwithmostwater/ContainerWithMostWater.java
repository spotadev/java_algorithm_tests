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
package com.spotadev.algo.difficulty_1.containerwithmostwater;

/**
 * https://leetcode.com/problems/container-with-most-water
 * 
 *     Runtime: 5 ms, faster than 42.77% of Java online submissions for Container With Most Water.
 *     
 *     Memory Usage: 81.3 MB, less than 33.39% of Java online submissions for Container With Most 
 *     Water.
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn such that 
 * the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the container contains 
 * the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * Example 1:
 *                       ,8, , , , ,8, ,
 *                       ,8, , , , ,8, ,7
 *                       ,8,6, , , ,8, ,7
 *                       ,8,6, ,5, ,8, ,7
 *                       ,8,6, ,5,4,8, ,7
 *                       ,8,6, ,5,4,8,3,7
 *                       ,8,6, ,5,4,8,3,7
 *     Input: height = [1,8,6,2,5,4,8,3,7]
 *     Output: 49
 *     
 *     Explanation: 
 *     
 *          The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
 *          In this case, the max area of water (blue section) the container can contain is 49.
 *          
 *          Cannot put graphic here but the blue section is between 8 and 7. Because water is 
 *          horizontal the area is 7 * 7.
 * 
 * Example 2:
 * 
 *     Input: height = [1,1]
 *     Output: 1 
 * 
 * Constraints:
 * 
 *     n == height.length
 *     2 <= n <= 10^5
 *     0 <= height[i] <= 10^4
 * 
 * @author John Dickerson - 3 May 2022
 */
public class ContainerWithMostWater {

    private int getArea( int heightLeft, int heightRight, int leftIndex, int rightIndex ) {

        int area;
        int gap = rightIndex - leftIndex;

        if ( heightLeft >= heightRight ) {

            area = heightRight * gap;
        }
        else {
            area = heightLeft * gap;
        }

        return area;
    }


    public int maxArea( int[] height ) {

        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int maxArea = 0;

        while ( leftIndex < rightIndex ) {

            int heightLeft = height[leftIndex];
            int heightRight = height[rightIndex];
            int area = getArea( heightLeft, heightRight, leftIndex, rightIndex );

            if ( area > maxArea ) {

                maxArea = area;
            }

            if ( height[leftIndex] >= height[rightIndex] ) {

                rightIndex--;
            }
            else {
                leftIndex++;
            }
        }

        return maxArea;
    }
}
