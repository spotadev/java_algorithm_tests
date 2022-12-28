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
package com.spotadev.algo.blind75.one_d_dynamic_programming.medium.word_break;

import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=Sx9NNgInc3A
 * 
 * https://leetcode.com/problems/word-break/
 * 
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into 
 * a space-separated sequence of one or more dictionary words.
 * 
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * 
 * Example 1:
 * 
 *     Input: s = "leetcode", wordDict = ["leet","code"]
 *     Output: true
 *     Explanation: Return true because "leetcode" can be segmented as "leet code".
 * 
 * Example 2:
 * 
 *     Input: s = "applepenapple", wordDict = ["apple","pen"]
 *     Output: true
 *     Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 *     Note that you are allowed to reuse a dictionary word.
 * 
 * Example 3:
 * 
 *     Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 *     Output: false
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 300
 *     1 <= wordDict.length <= 1000
 *     1 <= wordDict[i].length <= 20
 *     s and wordDict[i] consist of only lowercase English letters.
 *     All the strings of wordDict are unique.
 *     
 * @author John Dickerson - 14 May 2022
 */
public interface WordBreakAPI {

    boolean wordBreak( String s, List<String> wordDict );

}