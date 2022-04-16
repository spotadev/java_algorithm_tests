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
package com.spotadev.theory.algo.difficulty_5.generate.combinations.array;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spotadev.theory.algo.difficulty_5.generate.combinations.array.GenerateCustomCombinationsForArray;

/**
 * @author John Dickerson - 5 Apr 2022
 */
public class GenerateCustomCombinationsForArrayTest {

    @Test
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
