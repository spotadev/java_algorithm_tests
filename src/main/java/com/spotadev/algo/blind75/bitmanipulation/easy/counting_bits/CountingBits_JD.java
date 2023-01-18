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
package com.spotadev.algo.blind75.bitmanipulation.easy.counting_bits;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=RyBM56RIWrM
 * 
 * https://leetcode.com/problems/counting-bits/
 * 
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
 * ans[i] is the number of 1's in the binary representation of i.
 * 
 * Example 1:
 * 
 *     Input: n = 2
 *     Output: [0,1,1]
 * 
 *     Explanation:
 *         0 --> 0
 *         1 --> 1
 *         2 --> 10
 *
 * Example 2:
 * 
 *     Input: n = 5
 *     Output: [0,1,1,2,1,2]
 * 
 *     Explanation:
 *         0 --> 0
 *         1 --> 1
 *         2 --> 10
 *         3 --> 11
 *         4 --> 100
 *         5 --> 101
 * 
 * Constraints:
 * 
 *      0 <= n <= 105
 *  
 * Follow up:
 * 
 *      It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in 
 *      linear time O(n) and possibly in a single pass?
 *      
 *      Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 * 
 * @author John Dickerson - 19 May 2022
 */
public class CountingBits_JD implements CountingBitsAPI {

    private int count1s( int number ) {

        // let us say number is 23:
        // 16 + 0 + 4 + 2 + 1 = 23
        // 1    0   1   1   1

        // indexes count from right. x is the number e.g 23

        // 1 0 1 1 1
        // 0 0 0 0 1 
        // 0 0 0 0 1 => not 0 so we have a 1 in index 0

        // 1 0 1 1 1
        // 0 0 0 1 0 <= this is x << 1    (we call this a mask)
        // 0 0 0 1 0 => not 0 so we have a 1 in index 1

        // 1 0 1 1 1
        // 0 0 1 0 0 <= this is x << 2    (we call this a mask)
        // 0 0 1 0 0 => not 0 so we have a 1 in index 1

        // 1 0 1 1 1
        // 0 1 0 0 0 <= this is x << 3    (we call this a mask)
        // 0 0 0 0 0 => 0 so we have a 1 in index 3

        // 1 0 1 1 1
        // 1 0 0 0 0<= this is x << 4     (we call this a mask)
        // 1 0 0 0 0 => not 0 so we have a 1 in index 4

        int countOf1 = 0;
        int mask = 1;

        // 32 bits in a java int but constraints say largest number is 105 which only has 7 bits
        // 0 <= n <= 105      
        // 64 32 16 8 4 2 1
        // 1  1  0  1 0 0 1  
        for ( int i = 0; i <= 7; i++ ) {

            if ( ( number & mask ) != 0 ) {
                countOf1++;
            }

            mask = mask << 1;
        }

        return countOf1;
    }


    @Override
    public int[] countBits( int n ) {

        int[] countsToReturn = new int[n + 1];
        int number = 0;

        for ( int i = 0; i <= n; i++ ) {

            countsToReturn[i] = count1s( number );
            number++;
        }

        return countsToReturn;
    }
}
