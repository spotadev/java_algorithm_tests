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
 * @author John Dickerson - 5 Jan 2023
 */
public class ProductExceptSelf_JD implements ProductExceptSelfAPI {

    // Input:  1, [2], 4, 16
    //
    // Above we consider [2] to be a slot.
    // 
    // Note that for [2] we need to multiply the numbers to the left of the slot with the numbers
    // tothe right of the slot.
    //
    // (i) The idea is we move from left to right and populate the product of numbers on the left of 
    //     each slot, but we store the value on the slot iteself.
    //     If there is no number on the left we set it to 1.  As we move right we remember the 
    //     prefix value of the numbers we have so far multiplied.
    //
    // (ii) Then we start from the right and move left.  We calculate the product of the numbers to
    //      the right of each slot and multiply it by the value already in the slot (from moving 
    //      left to right,
    @Override
    public int[] productExceptSelf( int[] numArray ) {

        int[] result = new int[numArray.length];

        int prefix = 1;

        // Prefix values:  1, 1, 2, 8
        for ( int i = 0; i < numArray.length; i++ ) {

            result[i] = prefix;
            prefix = prefix * result[i];
        }

        int postfix = 1;

        // Postfix values: 128   64   16   1
        // Prefix valiues:  1     1    2   8
        // Postfix multiplied by Prefix = answer = 128   64   32   8
        for ( int i = numArray.length; i >= 0; i-- ) {

            result[i] = result[i] * postfix;
            postfix = postfix * result[i];
        }

        return result;
    }
}
