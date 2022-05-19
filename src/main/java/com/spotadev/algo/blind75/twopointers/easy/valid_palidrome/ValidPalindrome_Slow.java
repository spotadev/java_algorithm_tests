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
package com.spotadev.algo.blind75.twopointers.easy.valid_palidrome;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=jJXJ16kPFWg
 * 
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * Short and slow solution
 * 
 *     Runtime: 930 ms, faster than 10.25% of Java online submissions for Valid Palindrome.
 *     Memory Usage: 45.8 MB, less than 26.62% of Java online submissions for Valid Palindrome.
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
 * removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * 
 *     Input: s = "A man, a plan, a canal: Panama"
 *     Output: true
 *     Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 *     Input: s = "race a car"
 *     Output: false
 *     Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * 
 *     Input: s = " "
 *     Output: true
 *     Explanation: s is an empty string "" after removing non-alphanumeric characters.
 *     Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 2 * 10^5
 *     s consists only of printable ASCII characters.
 * 
 * @author John Dickerson - 2 May 2022
 */
public class ValidPalindrome_Slow {

    // =============================================================================================
    //  Short and slow solution below - it was very easy and quick to implement, but is on the 
    //  slow side

    public boolean isPalindrome( String s ) {

        s = s.replaceAll( "[^a-zA-Z0-9]", "" );
        s = s.toLowerCase();

        if ( s.equals( "" ) ) {

            return true;
        }

        int length = s.length();
        int midway = length / 2;
        int y = length - 1;
        char[] chars = s.toCharArray();

        for ( int i = 0; i < midway; i++ ) {

            if ( chars[i] != chars[y] ) {

                return false;
            }

            y--;
        }

        return true;
    }
}
