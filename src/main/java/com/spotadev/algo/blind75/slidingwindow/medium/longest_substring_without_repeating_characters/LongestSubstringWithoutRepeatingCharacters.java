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

import java.util.HashSet;
import java.util.Set;

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
 * @author John Dickerson - 3 May 2022
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring( String s ) {

        Set<Character> charSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int indexLeft = 0;
        int longest = 0;

        for ( int indexRight = 0; indexRight < chars.length; indexRight++ ) {

            while ( charSet.contains( chars[indexRight] ) ) {

                charSet.remove( chars[indexLeft] );
                indexLeft++;
            }

            charSet.add( chars[indexRight] );
            longest = Math.max( longest, indexRight - indexLeft + 1 );
        }

        return longest;
    }
}
