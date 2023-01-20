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

import org.testng.Assert;

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
public abstract class AbstractAddBinaryTest {

    protected AddBinaryAPI addBinary;

    void addBinaryTest_1() {

        String a = "11";
        String b = "1";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "100" );
    }


    void addBinaryTest_2() {

        String a = "1010";
        String b = "1011";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "10101" );
    }


    //    100
    // 110010
    // 110110
    void addBinaryTest_3() {

        String a = "100";
        String b = "110010";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "110110" );
    }


    //  101111
    //      10
    //  110001
    void addBinaryTest_4() {

        String a = "101111";
        String b = "10";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "110001" );
    }
}
