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
package com.spotadev.algo.blind75.bitmanipulation.easy.number_of_1_bits;

import org.testng.Assert;

import com.spotadev.algo.blind75.bitmanipulation.easy.number_of_1_bit.NumberOf1BitsAPI;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=5Km3utixwZs
 * 
 * https://leetcode.com/problems/number-of-1-bits/
 * 
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has 
 * (also known as the Hamming weight).
 * 
 * Note:
 * 
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, 
 * the input will be given as a signed integer type. It should not affect your implementation, 
 * as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, 
 * in Example 3, the input represents the signed integer. -3.
 * 
 * Example 1:
 * 
 *     Input: n = 00000000000000000000000000001011   (11)
 *     Output: 3
 *     
 *     Explanation: The input binary string 00000000000000000000000000001011 has a 
 *     total of three '1' bits.
 * 
 * Example 2:
 * 
 *     Input: n = 00000000000000000000000010000000 (128)
 *     Output: 1
 *     
 *     Explanation: The input binary string 00000000000000000000000010000000 has a 
 *     total of one '1' bit.
 * 
 * Example 3:
 * 
 *     Input: n = 11111111111111111111111111111101
 *     Output: 31
 * 
 *     Explanation: The input binary string 11111111111111111111111111111101 has a total of 
 *     thirty one '1' bits.
 *  
 * Constraints:
 * 
 *     The input must be a binary string of length 32.
 * 
 *     Follow up: If this function is called many times, how would you optimize it?
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractNumberOf1BitsTest {

    protected NumberOf1BitsAPI numberOf1Bits;

    void hammingWeight_1Test() {

        int n = 11;
        int result = numberOf1Bits.hammingWeight( n );
        Assert.assertEquals( result, 3 );
    }


    void hammingWeight_2Test() {

        int n = 128;
        int result = numberOf1Bits.hammingWeight( n );
        Assert.assertEquals( result, 1 );
    }
}
