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
package com.spotadev.algo.blind75.slidingwindow.hard.minimumwindowsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-window-substring/submissions/
 * 
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
public class MinimumWindowSubstring {

    private Map<Character, Integer> initializeExpectedCharacters( String t ) {

        Map<Character, Integer> expectedCharacters = new HashMap<>();

        for ( char x : t.toCharArray() ) {

            expectedCharacters.put( x, expectedCharacters.getOrDefault( x, 0 ) + 1 );
        }

        return expectedCharacters;
    }


    public String minWindow( String s, String t ) {

        // Map is initiated with expected count for each letter
        Map<Character, Integer> expectedCharacters = initializeExpectedCharacters( t );

        // Every time we come across a letter  in the window we reduce the count in the map.
        // When the count for a certain letter reaches 0 we have a match for that letter and
        // we increment numberMatched.
        int numberMatched = 0;

        int startIndex = 0;
        int minLen = s.length() + 1;
        int indexShortestMatch = 0;

        // start right index
        for ( int rightIndex = 0; rightIndex < s.length(); rightIndex++ ) {

            char character = s.charAt( rightIndex );

            if ( expectedCharacters.containsKey( character ) ) {

                // if we come across one of our expected letters reduce the count
                expectedCharacters.put( character, expectedCharacters.get( character ) - 1 );

                // when the count reaches zero for a character that means we have found all 
                // occurences of that letter.  We then increment the matches
                if ( expectedCharacters.get( character ) == 0 ) {

                    numberMatched++;
                }
            }

            // this means we have matched the t string.

            while ( numberMatched == expectedCharacters.size() ) {

                // if this the shortest match we found so far update the index we found it in
                // and the length of the match
                if ( ( rightIndex - startIndex + 1 ) < minLen ) {

                    minLen = rightIndex - startIndex + 1;
                    indexShortestMatch = startIndex;
                }

                // Remove the leftmost index from the map and iterate round the loop checking
                // if we still have the match.  We want to see 
                char deleted = s.charAt( startIndex++ );

                if ( expectedCharacters.containsKey( deleted ) ) {

                    if ( expectedCharacters.get( deleted ) == 0 )
                        numberMatched--;

                    expectedCharacters.put( deleted, expectedCharacters.get( deleted ) + 1 );
                }
            }
        }

        return minLen > s.length() ? ""
                : s.substring( indexShortestMatch, indexShortestMatch + minLen );
    }
}
