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
package com.spotadev.theory.generate.alluniquecombination.array;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllUniqueCombinationsForArray {

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
     * @author John Dickerson - 5 Apr 2022
     */
    public static int[][] getAllUniquePairCombinations() {

        int[] data = { 0, 1, 2, 3 };
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


    public static void printAllCombinations() {

    }
}
