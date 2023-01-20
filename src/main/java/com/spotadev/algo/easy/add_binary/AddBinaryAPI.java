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
package com.spotadev.algo.easy.add_binary;

/**
 * https://leetcode.com/problems/add-binary/
 * 
 *     Runtime: 1 ms, faster than 99.99% of Java online submissions for Add Binary.
 *     Memory Usage: 42.6 MB, less than 66.98% of Java online submissions for Add Binary.
 * 
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1:
 * 
 *     Input: a = "11", b = "1"
 *     Output: "100"
 * 
 * Example 2:
 * 
 *     Input: a = "1010", b = "1011"
 *     Output: "10101"
 *
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 * 
 * @author John Dickerson - 19 Apr 2022
 */
public interface AddBinaryAPI {

    String addBinary( String a, String b );

}