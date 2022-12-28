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
package com.spotadev.algo.blind75.two_d_dynamic_programming.medium.longest_common_subsequence;

/**
 * https://neetcode.io/
 * https://leetcode.com/problems/longest-common-subsequence/
 * 
 * https://www.youtube.com/watch?v=Ua0GhsJSlWM
 * 
 * Given two strings text1 and text2, return the length of their longest common subsequence. If 
 * there is no common subsequence, return 0.
 * 
 * A subsequence of a string is a new string generated from the original string with some 
 * characters (can be none) deleted without changing the relative order of the remaining characters.
 * 
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * 
 * Example 1:
 * 
 *     Input: text1 = "abcde", text2 = "ace" 
 *     Output: 3  
 *     Explanation: The longest common subsequence is "ace" and its length is 3.
 * 
 * Example 2:
 * 
 *     Input: text1 = "abc", text2 = "abc"
 *     Output: 3
 *     Explanation: The longest common subsequence is "abc" and its length is 3.
 * 
 * Example 3:
 * 
 *     Input: text1 = "abc", text2 = "def"
 *     Output: 0
 *     Explanation: There is no such common subsequence, so the result is 0.
 *  
 * Constraints:
 * 
 *     1 <= text1.length, text2.length <= 1000
 *     text1 and text2 consist of only lowercase English characters.
 * 
 * @author John Dickerson - 15 May 2022
 */
public interface LongestCommonSubsequenceAPI {

    int longestCommonSubsequence( String text1, String text2 );

}