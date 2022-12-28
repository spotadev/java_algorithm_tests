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
package com.spotadev.algo.blind75.slidingwindow.hard.minimum_window_substring;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=jSto0O4AJbM&feature=youtu.be
 * 
 * https://leetcode.com/problems/minimum-window-substring/submissions/
 * 
 *       Runtime: 32 ms, faster than 25.25% of Java online submissions for Minimum Window Substring.
 *       Memory Usage: 44 MB, less than 62.10% of Java online submissions for Minimum Window Substring.
 * 
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring 
 * of s such that every character in t (including duplicates) is included in the window. If there 
 * is no such substring, return the empty string "".
 * 
 * The testcases will be generated such that the answer is unique.
 * 
 * A substring is a contiguous sequence of characters within the string.
 * 
 * Example 1:
 * 
 *     Input: s = "ADOBECODEBANC", t = "ABC"
 *     Output: "BANC"
 *     Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * 
 * Example 2:
 * 
 *     Input: s = "a", t = "a"
 *     Output: "a"
 *     Explanation: The entire string s is the minimum window.
 * 
 * Example 3:
 * 
 *     Input: s = "a", t = "aa"
 *     Output: ""
 *     Explanation: Both 'a's from t must be included in the window.
 *     Since the largest window of s only has one 'a', return empty string. 
 * 
 * Constraints:
 * 
 *     m == s.length
 *     n == t.length
 *     1 <= m, n <= 105
 *     s and t consist of uppercase and lowercase English letters.
 * 
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 * 
 * @author John Dickerson - 3 May 2022
 */
public interface MinimumWindowSubstringAPI {

    String minWindow( String s, String t );

}