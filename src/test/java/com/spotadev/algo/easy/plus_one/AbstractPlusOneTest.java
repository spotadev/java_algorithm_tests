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
package com.spotadev.algo.easy.plus_one;

import org.testng.Assert;

/**
 * https://leetcode.com/problems/plus-one/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 *     Memory Usage: 42.6 MB, less than 45.23% of Java online submissions for Plus One.
 * 
 * You are given a large integer represented as an integer array digits, where each digits[i] is 
 * the ith digit of the integer. The digits are ordered from most significant to least significant 
 * in left-to-right order. The large integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Example 1:
 * 
 *     Input: digits = [1,2,3]
 *     Output: [1,2,4]
 * 
 *     Explanation: The array represents the integer 123.
 *     Incrementing by one gives 123 + 1 = 124.
 *     Thus, the result should be [1,2,4].
 * 
 * Example 2:
 * 
 *     Input: digits = [4,3,2,1]
 *     Output: [4,3,2,2]
 * 
 *    Explanation: The array represents the integer 4321.
 *    Incrementing by one gives 4321 + 1 = 4322.
 *    Thus, the result should be [4,3,2,2].
 * 
 * Example 3:
 * 
 *     Input: digits = [9]
 *     Output: [1,0]
 * 
 *     Explanation: The array represents the integer 9.
 *     Incrementing by one gives 9 + 1 = 10.
 *     Thus, the result should be [1,0].
 * 
 * Constraints:
 * 
 *     1 <= digits.length <= 100
 *     0 <= digits[i] <= 9
 *     digits does not contain any leading 0's.
 * 
 * @author John Dickerson - 19 Apr 2022
 */
public abstract class AbstractPlusOneTest {

    protected PlusOneAPI plusOne;

    void plusOneTest_1() {

        int[] digits = new int[] { 1, 2, 3 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 1, 2, 4 } );
    }


    void plusOneTest_2() {

        int[] digits = new int[] { 4, 3, 2, 1 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 4, 3, 2, 2 } );
    }


    void plusOneTest_3() {

        int[] digits = new int[] { 9 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 1, 0 } );
    }


    void plusOneTest_4() {

        int[] digits = new int[] { 9, 9, 9, 9 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 1, 0, 0, 0, 0 } );
    }


    void plusOneTest_5() {

        int[] digits = new int[] { 8, 9, 9, 9 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 9, 0, 0, 0 } );
    }
}
