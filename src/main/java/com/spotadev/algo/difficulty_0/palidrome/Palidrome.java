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
package com.spotadev.algo.difficulty_0.palidrome;

/**
 * https://leetcode.com/problems/palindrome-number
 * 
 *     Runtime: 13 ms, faster than 59.91% of Java online submissions for Palindrome Number.
 *     Memory Usage: 45.2 MB, less than 34.30% of Java online submissions for Palindrome Number.
 * 
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 * 
 * Example 1:
 * 
 *     Input: x = 121
 *     Output: true
 * 
 *     Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 * 
 *    Input: x = -121
 *    Output: false
 *    
 *    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
 *    Therefore it is not a palindrome.
 * 
 * Example 3:
 * 
 *     Input: x = 10
 *     Output: false
 * 
 *     Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * Constraints:
 * 
 *     -231 <= x <= 231 - 1
 * 
 * 
 * Follow up: Could you solve it without converting the integer to a string?
 * 
 * @author John Dickerson - 16 Apr 2022
 */
public class Palidrome {

    public boolean isPalindrome( int x ) {

        char[] candidate = ( x + "" ).toCharArray();

        for ( int i = 0; i < candidate.length / 2; i++ ) {

            int indexToCompareWith = candidate.length - 1 - i;

            if ( candidate[i] != candidate[indexToCompareWith] ) {

                return false;
            }
        }

        return true;
    }
}
