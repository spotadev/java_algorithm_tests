package com.spotadev.algo_daily.array_intersection;

import java.util.Arrays;

import org.testng.Assert;

/**
 * https://algodaily.com/challenges/array-intersection/java
 * 
 * Write a function that takes two arrays as input and returns the intersection of the two arrays 
 * as output. Return the intersection of the two inputs in the form of an array.
 * 
 * An intersection of two sets A and B is consists of all elements found in A that are also belong 
 * to B.
 * 
 * All elements in the final result should be unique.
 *
 * Example 1
 * =========
 * 
 *     A = [1, 2, 3, 4, 5 ] and B = [ 2, 3 ]
 * 
 *     intersection( A, B ) --> [ 2, 3 ]
 *
 * Example 2
 * =========
 *
 *    num1 = [ 3, 5, 6, 7 ] and num2 = [ 5, 6, 8 ]
 *    intersection( num1, num2 ) ---> [ 5, 6 ]
 *
 *
 * Constraints:
 * ============
 * 
 *     Length of the array <= 100000
 * 
 *     Values in array range from -1000000000 to 1000000000
 * 
 *     Time Complexity : O( n + m ) where n and m are the lengths of the two arrays
 * 
 *     Space Complexity: O( max( n, m ) )
 *
 * @author John Dickerson - 5 Feb 2022
 */
public abstract class AbstractArrayIntersectionTest {

    protected ArrayIntersectionAPI arrayIntersection;

    protected void intersection_1_Test() {

        int[] num1 = { 1, 2, 3, 4, 5 };
        int[] num2 = { 2, 3 };
        Integer[] expected = { 2, 3 };
        Integer[] intersection = arrayIntersection.intersection( num1, num2 );
        Assert.assertTrue( Arrays.equals( intersection, expected ) );
    }


    void intersection_2_Test() {

        int[] num1 = { 3, 5, 6, 7 };
        int[] num2 = { 5, 6, 8 };
        Integer[] expected = { 5, 6 };
        Integer[] intersection = arrayIntersection.intersection( num1, num2 );
        Assert.assertTrue( Arrays.equals( intersection, expected ) );
    }


    void intersection_3_Test() {

        int[] num1 = { 1, 2, 2, 1 };
        int[] num2 = { 2, 2 };
        Integer[] expected = { 2 };
        Integer[] intersection = arrayIntersection.intersection( num1, num2 );
        Assert.assertTrue( Arrays.equals( intersection, expected ) );
    }
}
