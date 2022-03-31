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
package com.spotadev.algo.difficulty_3.median2sortedarrays;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 5 Feb 2022
 */
public class Median2SortedArraysTest {

    private Median2SortedArrays median2SortedArrays;

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArrays();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        int[] num1 = { 2, 2, 4, 4 };
        int[] num2 = { 2, 2, 4, 4 };
        // int[] merged = { 2, 2, 2, 2, 4, 4, 4, 4 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 3.0 );
    }
}
