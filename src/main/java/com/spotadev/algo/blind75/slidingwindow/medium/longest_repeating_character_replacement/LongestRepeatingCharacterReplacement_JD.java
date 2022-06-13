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
package com.spotadev.algo.blind75.slidingwindow.medium.longest_repeating_character_replacement;

import java.util.HashMap;
import java.util.Map;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=gqXU1UyA8pk
 * 
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * 
 *     Runtime: 19 ms, faster than 42.01% of Java online submissions for Longest 
 *     Repeating Character Replacement.
 * 
 *     Memory Usage: 45.6 MB, less than 12.90% of Java online submissions for Longest 
 *     Repeating Character Replacement.
 * 
 * You are given a string s and an integer k. You can choose any character of the string and 
 * change it to any other uppercase English character. You can perform this operation at most 
 * k times.
 * 
 * Return the length of the longest substring containing the same letter you can get after
 * performing the above operations.
 * 
 * Example 1:
 * 
 *     Input: s = "ABAB", k = 2
 *     Output: 4
 *     Explanation: Replace the two 'A's with two 'B's or vice versa.
 * 
 * Example 2:
 * 
 *     Input: s = "AABABBA", k = 1
 *     Output: 4
 *     Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 *     The substring "BBBB" has the longest repeating letters, which is 4.
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 10^5
 *     s consists of only uppercase English letters.
 *     0 <= k <= s.length
 *     
 * JD Note:
 * 
 *     See Video:
 *     
 *         https://www.youtube.com/watch?v=gqXU1UyA8pk
 * 
 * @author John Dickerson - 3 May 2022
 */
public class LongestRepeatingCharacterReplacement_JD implements LongestRepeatingCharacterReplacementAPI {

    private void incrementInMap( char character, Map<Character, Integer> charByCount ) {

        Integer count = charByCount.get( character );

        if ( count == null ) {
            count = 0;
        }

        charByCount.put( character, ++count );
    }


    private void decrementMap( char character, Map<Character, Integer> charByCount ) {

        Integer count = charByCount.get( character );
        charByCount.put( character, --count );
    }


    @Override
    public int characterReplacement( String s, int k ) {

        char[] chars = s.toCharArray();
        Map<Character, Integer> charByCount = new HashMap<>();
        int maxFreq = 0;

        int leftIndex = 0;
        int longest = 0;

        for ( int rightIndex = 0; rightIndex < chars.length; rightIndex++ ) {

            incrementInMap( chars[rightIndex], charByCount );
            maxFreq = Math.max( maxFreq, charByCount.get( chars[rightIndex] ) );
            // int maxLetterCount = Collections.max( charByCount.values() );

            while ( ( rightIndex - leftIndex + 1 ) - maxFreq > k ) {

                decrementMap( chars[leftIndex], charByCount );
                leftIndex++;
            }

            longest = Math.max( longest, rightIndex - leftIndex + 1 );
        }

        return longest;
    }
}
