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

import java.util.List;

import org.testng.Assert;

import com.spotadev.algo.theory.generate.combinations.array.GenerateAllCombinationsForArray;

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
public class AbstractGenerateAllCombinationsForArrayTest {

    void getAllCombinations_4n_2r_Test() {

        int n = 4;
        int r = 2;

        List<int[]> combinations =
                GenerateAllCombinationsForArray.generate( n, r );

        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1 } );
        Assert.assertEquals( combinations.get( 1 ), new int[] { 0, 2 } );
        Assert.assertEquals( combinations.get( 2 ), new int[] { 0, 3 } );
        Assert.assertEquals( combinations.get( 3 ), new int[] { 1, 2 } );
        Assert.assertEquals( combinations.get( 4 ), new int[] { 1, 3 } );
        Assert.assertEquals( combinations.get( 5 ), new int[] { 2, 3 } );
    }


    void getAllCombinations_4n_3r_Test() {

        int n = 4;
        int r = 3;

        List<int[]> combinations =
                GenerateAllCombinationsForArray.generate( n, r );

        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1, 2 } );
        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1, 3 } );
        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 2, 3 } );
        Assert.assertEquals( combinations.get( 0 ), new int[] { 1, 2, 3 } );
    }


    void getAllCombinations_4n_4r_Test() {

        int n = 4;
        int r = 4;

        List<int[]> combinations =
                GenerateAllCombinationsForArray.generate( n, r );

        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1, 2, 3 } );
    }
}
