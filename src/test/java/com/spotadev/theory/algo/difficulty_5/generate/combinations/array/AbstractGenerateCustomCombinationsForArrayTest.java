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

import org.testng.Assert;

import com.spotadev.algo.theory.generate.combinations.array.GenerateCustomCombinationsForArray;

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
 *
 * @author John Dickerson - 5 Apr 2022
 */
public class AbstractGenerateCustomCombinationsForArrayTest {

    public void getCustomCombinations() {

        int[] data = { 0, 1, 2, 3 };

        int[][] pairCombinations =
                GenerateCustomCombinationsForArray.getCustomCombinations( data );

        Assert.assertEquals( pairCombinations.length, 10 );
        Assert.assertEquals( pairCombinations[0], new int[] { 0, 0 } );
        Assert.assertEquals( pairCombinations[1], new int[] { 0, 1 } );
        Assert.assertEquals( pairCombinations[2], new int[] { 0, 2 } );
        Assert.assertEquals( pairCombinations[3], new int[] { 0, 3 } );
        Assert.assertEquals( pairCombinations[4], new int[] { 1, 1 } );
        Assert.assertEquals( pairCombinations[5], new int[] { 1, 2 } );
        Assert.assertEquals( pairCombinations[6], new int[] { 1, 3 } );
        Assert.assertEquals( pairCombinations[7], new int[] { 2, 2 } );
        Assert.assertEquals( pairCombinations[8], new int[] { 2, 3 } );
        Assert.assertEquals( pairCombinations[9], new int[] { 3, 3 } );
    }
}
