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
package com.spotadev.algo_daily.array_intersection;

/**
 * Similar to: https://algodaily.com/challenges/array-intersection/python
 * 
 * Write a function that takes two arrays as input and returns the intersection of the two arrays 
 * as output. Return the intersection of the two inputs in the form of an array.
 * 
 * An intersection of two sets A and B is consists of all elements found in A that are also belong 
 * to B.
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
 * @author Karema99 - 29 Aug 2022
 */
public interface ArrayIntersectionAPI {

    int[] intersection( int[] num1, int[] num2 );
}
