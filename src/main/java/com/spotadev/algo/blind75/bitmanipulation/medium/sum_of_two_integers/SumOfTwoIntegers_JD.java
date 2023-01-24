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
package com.spotadev.algo.blind75.bitmanipulation.medium.sum_of_two_integers;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=gVUrDV4tZfY
 * 
 * https://leetcode.com/problems/sum-of-two-integers/
 * 
 * Given two integers a and b, return the sum of the two integers without using the operators 
 * + and -.
 * 
 * Example 1:
 * 
 *     Input: a = 1, b = 2
 *     Output: 3
 * 
 * Example 2:
 * 
 *     Input: a = 2, b = 3
 *     Output: 5
 *  
 * Constraints:
 * 
 *     -1000 <= a, b <= 1000
 * 
 * @author John Dickerson - 19 May 2022
 */
public class SumOfTwoIntegers_JD implements SumOfTwoIntegersAPI {

    @Override
    public int getSum( int a, int b ) {

        int mask = 1;
        int carryMask;
        int addMask;
        int result = 0;

        for ( int i = 0; i < 32; i++ ) {

            boolean aHas1 = ( a & mask ) > 0;
            boolean bHas1 = ( b & mask ) > 0;

            if ( aHas1 ^ bHas1 ) {

                addMask = 1 << i;
            }
            else {
                addMask = 0;
            }

            if ( aHas1 && bHas1 ) {

                carryMask = 1 << i + 1;
            }
            else {
                carryMask = 0;
            }

            result = result | addMask;
            result = result | carryMask;
            mask = mask << 1;
        }

        return result;
    }
}
