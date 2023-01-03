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
package com.spotadev.algo_daily.product_except_self;

import java.util.Arrays;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractProductExceptSelfTest {

    protected ProductExceptSelfAPI productExceptSelf;

    public void productExceptSelfTest() {

        int[] numArray = { 1, 2, 4, 16 };
        int[] products = productExceptSelf.productExceptSelf( numArray );
        int[] expectedProducts = { 128, 64, 32, 8 };
        Assert.assertTrue( Arrays.equals( products, expectedProducts ) );
    }
}
