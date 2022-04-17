/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_0.longestcommonprefix;

/**
 * https://leetcode.com/problems/longest-common-prefix
 * 
 *     Runtime: 7 ms, faster than 24.15% of Java online submissions for Longest Common Prefix.
 *     Memory Usage: 40.9 MB, less than 82.05% of Java online submissions for Longest Common Prefix.
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 *    Input: strs = [ "flower", "flow", "flight"]
 *    Output: "fl"
 * 
 * Example 2:
 * 
 *     Input: strs = [ "dog", "racecar", "car"]
 *     Output: ""
 *     Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Constraints:
 * 
 *     1 <= strs.length <= 200
 *     0 <= strs[i].length <= 200
 *    strs[i] consists of only lower-case English letters.
 * 
 * @author John Dickerson - 17 Apr 2022
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix( String[] strs ) {

        char letter;
        int index = 0;
        String longestComminPrefix = "";

        if ( strs.length > 0 && strs[0].length() > 0 ) {

            letter = strs[0].charAt( 0 );
        }
        else {
            return "";
        }

        while ( true ) {

            for ( String str : strs ) {

                if ( str.length() > index ) {

                    char let = str.charAt( index );

                    if ( let != letter ) {

                        return longestComminPrefix;
                    }
                }
                else {
                    return longestComminPrefix;
                }
            }

            longestComminPrefix = longestComminPrefix + letter;
            index++;

            if ( strs[0].length() > index ) {

                letter = strs[0].charAt( index );
            }
        }
    }
}
