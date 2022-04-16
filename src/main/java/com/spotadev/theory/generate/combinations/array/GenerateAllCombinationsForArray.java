/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.theory.generate.combinations.array;

import java.util.ArrayList;
import java.util.List;

/**
 * See:
 * 
 *     https://www.baeldung.com/java-combinations-algorithm
 * 
 * Not combinations are not the same as permutations.
 * 
 * Unlike permutations, the order in which we choose the individual elements 
 * doesn't matter. Instead, we only care whether a particular element is in the 
 * selection.
 * 
 * Therefore for combinations we will not have both:
 * 
 *     1, 0
 *     0, 1
 *     
 *  Instead we will have the smallest combination only:
 *  
 *     0, 1
 *     
 *  Therefore for n = 4 and r = 2 the combinations are:
 *  
 *     0, 1
 *     0, 2
 *     0, 3
 *     1, 2
 *     1, 3
 *     2, 3
 */
public class GenerateAllCombinationsForArray {

    public static List<int[]> generate( int n, int r ) {

        List<int[]> combinations = new ArrayList<>();
        int[] combination = new int[r];

        // initialize with lowest lexicographic combination
        for ( int i = 0; i < r; i++ ) {

            combination[i] = i;
        }

        while ( combination[r - 1] < n ) {

            combinations.add( combination.clone() );

            // generate next combination in lexicographic order
            int t = r - 1;

            while ( t != 0 && combination[t] == n - r + t ) {

                t--;
            }

            combination[t]++;

            for ( int i = t + 1; i < r; i++ ) {

                combination[i] = combination[i - 1] + 1;
            }
        }

        return combinations;
    }
}
