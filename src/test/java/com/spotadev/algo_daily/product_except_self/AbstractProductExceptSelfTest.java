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
 * https://algodaily.com/challenges/product-except-self
 *
 * Given an array of integers return an output array such that each corresponding input's elements 
 * returns the product of the input array except itself
 *
 * Example
 * =======
 * 
 * [1, 2, 4, 16]  ==> [128, 64, 32, 8]
 * 
 * 128 = 2 x 4 16
 * 64  = 1 x 4 x 16
 * 32  = 1 x 2 x 16
 * 8   = 1 x 2 x 4
 * 
 * Can you solve this in O(n) time without division?
 * 
 * Constraints
 * 
 *     Length of the array will be <= 100000
 * 
 *     The array can be empty
 * 
 *     The array will only contain non zero positive values
 * 
 *     The answer for each index will fit in the integer range
 * 
 *     Expected time complexity : O(n)
 * 
 *     Expected space complexity : O(n)
 * 
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractProductExceptSelfTest {

    protected ProductExceptSelfAPI productExceptSelf;

    void productExceptSelfTest() {

        int[] numArray = { 1, 2, 4, 16 };
        int[] products = productExceptSelf.productExceptSelf( numArray );
        int[] expectedProducts = { 128, 64, 32, 8 };
        Assert.assertTrue( Arrays.equals( products, expectedProducts ) );
    }
}
