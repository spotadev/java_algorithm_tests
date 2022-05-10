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
package com.spotadev.algo.hard.kadane.maximum_subarray;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.hard.kadane.maximum_subarray.MaximumSubarray;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeClass
    public void setUp() {

        maximumSubarray = new MaximumSubarray();
    }


    @Test
    public void maxSubArrayTest_1() {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, 6 );
    }


    @Test
    public void maxSubArrayTest_2() {

        int[] nums = { 1 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, 1 );
    }


    @Test
    public void maxSubArrayTest_3() {

        int[] nums = { 5, 4, -1, 7, 8 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, 23 );
    }


    @Test
    public void maxSubArrayTest_4() {

        int[] nums = { -1 };
        int max = maximumSubarray.maxSubArray( nums );
        Assert.assertEquals( max, -1 );
    }
}
