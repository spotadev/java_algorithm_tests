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
package com.spotadev.algo.easy.plusone;

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
public class PlusOne {

    // 9, 9, 9    => + 1
    //       0

    public int[] plusOne( int[] digits ) {

        int carry = 1;

        for ( int i = digits.length - 1; i >= 0; i-- ) {

            if ( digits[i] + carry <= 9 ) {

                digits[i] = digits[i] + carry;
                carry = 0;
                break;
            }
            else {
                digits[i] = 0;
                carry = 1;
            }
        }

        if ( carry > 0 ) {

            int[] copy = new int[digits.length + 1];
            System.arraycopy( digits, 0, copy, 1, digits.length );
            copy[0] = 1;
            return copy;
        }
        else {
            return digits;
        }
    }
}
