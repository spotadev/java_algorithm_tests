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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.palindromic_substrings;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=4RACzI5-du8
 * 
 * https://leetcode.com/problems/palindromic-substrings/
 * 
 * Given a string s, return the number of palindromic substrings in it.
 * 
 * A string is a palindrome when it reads the same backward as forward.
 * 
 * A substring is a contiguous sequence of characters within the string.
 * 
 * Example 1:
 * 
 *     Input: s = "abc"
 *     Output: 3
 *     Explanation: Three palindromic strings: "a", "b", "c".
 * 
 * Example 2:
 * 
 *     Input: s = "aaa"
 *     Output: 6
 *     Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *  
 * Constraints:
 * 
 *     1 <= s.length <= 1000
 *     s consists of lowercase English letters.
 * 
 * @author John Dickerson - 13 May 2022
 */
public interface PalindromicSubstringsAPI {

    int countSubstrings( String s );

}