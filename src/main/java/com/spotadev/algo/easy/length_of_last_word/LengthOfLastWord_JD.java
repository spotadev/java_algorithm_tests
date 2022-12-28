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
package com.spotadev.algo.easy.length_of_last_word;

/**
 * https://leetcode.com/problems/length-of-last-word/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
 *     Memory Usage: 40.5 MB, less than 87.95% of Java online submissions for Length of Last Word.
 * 
 * Given a string s consisting of some words separated by some number of spaces, return the length 
 * of the last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Example 1:
 * 
 *     Input: s = "Hello World"
 *     Output: 5
 * 
 *     Explanation: The last word is "World" with length 5.
 * 
 * Example 2:
 * 
 *      Input: s = "   fly me   to   the moon  "
 *      Output: 4
 * 
 *      Explanation: The last word is "moon" with length 4.
 * 
 * Example 3:
 * 
 *     Input: s = "luffy is still joyboy"
 *     Output: 6
 * 
 *     Explanation: The last word is "joyboy" with length 6. 
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 10^4
 *     s consists of only English letters and spaces ' '.
 *     There will be at least one word in s.
 * 
 * @author John Dickerson - 18 Apr 2022
 */
public class LengthOfLastWord_JD implements LengthOflastWordAPI {

    @Override
    public int lengthOfLastWord( String s ) {

        Integer lastNotSpaceIndex = null;
        Integer startIndex = null;

        for ( int i = s.length() - 1; i >= 0; i-- ) {

            if ( !s.substring( i, i + 1 ).equals( " " ) ) {

                lastNotSpaceIndex = i;
                break;
            }
        }

        if ( lastNotSpaceIndex != null ) {

            for ( int i = lastNotSpaceIndex; i >= 0; i-- ) {

                if ( s.substring( i, i + 1 ).equals( " " ) ) {

                    startIndex = i + 1;
                    break;
                }
            }
        }

        if ( startIndex == null ) {

            startIndex = 0;
        }

        if ( lastNotSpaceIndex != null && startIndex != null ) {

            return lastNotSpaceIndex + 1 - startIndex;
        }

        return 0;
    }
}
