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
package com.spotadev.algo.blind75.arraysandhashing.medium.product_of_array_except_self;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractProductOfArrayExceptSelfTest {

    protected ProductOfArrayExceptSelfAPI productOfArrayExceptSelf;

    public void productExceptSelfTest_1() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { 1, 2, 3, 4 } );
        Assert.assertEquals( result, new int[] { 24, 12, 8, 6 } );
    }


    public void productExceptSelfTest_2() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { -1, 1, 0, -3, 3 } );
        Assert.assertEquals( result, new int[] { 0, 0, 9, 0, 0 } );
    }


    public void productExceptSelfTest_3() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { 1, 1, 0, -3, 3 } );
        Assert.assertEquals( result, new int[] { 0, 0, -9, 0, 0 } );
    }


    public void productExceptSelfTest_4() {

        int[] result = productOfArrayExceptSelf.productExceptSelf( new int[] { 9, 0, -2 } );
        Assert.assertEquals( result, new int[] { 0, -18, 0 } );
    }
}
