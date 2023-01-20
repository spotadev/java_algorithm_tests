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
package com.spotadev.algo.blind75.slidingwindow.medium.longest_substring_without_repeating_characters;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=wiGpQwVHdE0
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 * 
 *     Runtime: 12 ms, faster than 48.79% of Java online submissions for Longest Substring Without 
 *     Repeating Characters.
 *     
 *     Memory Usage: 46.2 MB, less than 27.70% of Java online submissions for Longest 
 *     Substring Without Repeating Characters.
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * 
 *     Input: s = "abcabcbb"
 *     Output: 3
 *     Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * 
 *     Input: s = "bbbbb"
 *     Output: 1
 *     Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * 
 *     Input: s = "pwwkew"
 *     Output: 3
 *     Explanation: The answer is "wke", with the length of 3.
 *     Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Constraints:
 * 
 *     0 <= s.length <= 5 * 10^4
 *     s consists of English letters, digits, symbols and spaces.
 *     
 * JD Note:
 * 
 *     See Video:
 *     
 *         https://www.youtube.com/watch?v=wiGpQwVHdE0
 *
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractLongestSubstringWithoutRepeatingCharactersTest {

    protected LongestSubstringWithoutRepeatingCharactersAPI longestSubstringWithoutRepeatingCharacters;

    void lengthOfLongestSubstringTest_1() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "abcabcbb" );

        Assert.assertEquals( longest, 3 );
    }


    void lengthOfLongestSubstringTest_2() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "bbbbb" );

        Assert.assertEquals( longest, 1 );
    }


    void lengthOfLongestSubstringTest_3() {

        int longest =
                longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "pwwkew" );

        Assert.assertEquals( longest, 3 );
    }

}