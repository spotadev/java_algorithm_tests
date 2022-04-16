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

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 5 Apr 2022
 */
public class GenerateAllCombinationsForArrayTest {

    @Test
    public void getAllCombinations_4n_2r_Test() {

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


    @Test
    public void getAllCombinations_4n_3r_Test() {

        int n = 4;
        int r = 3;

        List<int[]> combinations =
                GenerateAllCombinationsForArray.generate( n, r );

        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1, 2 } );
        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1, 3 } );
        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 2, 3 } );
        Assert.assertEquals( combinations.get( 0 ), new int[] { 1, 2, 3 } );
    }


    @Test
    public void getAllCombinations_4n_4r_Test() {

        int n = 4;
        int r = 4;

        List<int[]> combinations =
                GenerateAllCombinationsForArray.generate( n, r );

        Assert.assertEquals( combinations.get( 0 ), new int[] { 0, 1, 2, 3 } );
    }
}
