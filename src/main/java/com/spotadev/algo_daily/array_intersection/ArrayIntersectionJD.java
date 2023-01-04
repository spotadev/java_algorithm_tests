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

import java.util.HashSet;
import java.util.Set;

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
 * Example 3
 * =========
 * 
 *     nums1 = [1, 2, 2, 1] and nums2 = [2, 2];
 *     intersection( num1, num2 ) ---> [ 2 ]
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
 * @author John Dickerson - 1 Jan 2023
 */
public class ArrayIntersectionJD implements ArrayIntersectionAPI {

    @Override
    public Integer[] intersection( int[] num1, int[] num2 ) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for ( int num : num1 ) {

            set1.add( num );
        }

        for ( int num : num2 ) {

            set2.add( num );
        }

        set1.retainAll( set2 );
        return set1.toArray( new Integer[set1.size()] );
    }
}
