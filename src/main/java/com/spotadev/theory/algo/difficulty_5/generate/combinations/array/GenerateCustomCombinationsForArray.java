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
package com.spotadev.theory.algo.difficulty_5.generate.combinations.array;

import java.util.ArrayList;
import java.util.List;

public class GenerateCustomCombinationsForArray {

    /**
     * Given:
     * 
     *     int[] = { 0, 1, 2, 3 }
     *     
     *  Print:
     *  
     *      0  0
     *      0  1
     *      0  2
     *      0  3
     *      1  1
     *      1  2
     *      1  3
     *      2  2
     *      2  3
     *      3  3
     *      
     * This solution of nested "for loops" is only for returning a combination of 2 elements from a
     * set of 4 elements. This code cannot work for any size of combination from any size set. The
     * 2 for loops harcode this solution to return a combination of 2 items.
     * 
     * Note also that here we have stuff like [0,0] which is strictly not a combination of availble
     * elements - this example is a custom combination with its own rules - came from an amazon
     * interview problem.
     * 
     * @author John Dickerson - 5 Apr 2022
     */
    public static int[][] getCustomCombinations( int[] data ) {

        int n = data.length;
        List<int[]> arrays = new ArrayList<>();

        for ( int i = 0; i < n; i++ ) {

            for ( int j = i; j < n; j++ ) {

                System.out.println( " " + data[i] + "  " + data[j] );
                arrays.add( new int[] { data[i], data[j] } );
            }
        }

        return arrays.toArray( new int[arrays.size()][] );
    }
}
