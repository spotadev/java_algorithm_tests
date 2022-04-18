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
package com.spotadev.algo.difficulty_0.strstr;

/**
 * https://leetcode.com/problems/implement-strstr/  
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
 *     Memory Usage: 40.1 MB, less than 97.30% of Java online submissions for Implement strStr(). 
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in 
 * haystack, or -1 if needle is not part of haystack.
 * 
 * Clarification:
 * 
 * What should we return when needle is an empty string? This is a great question to ask during 
 * an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is 
 * consistent to C's strstr() and Java's indexOf().
 * 
 * 
 * Example 1:
 * 
 *     Input: haystack = "hello", needle = "ll"
 *     Output: 2
 * 
 * Example 2:
 * 
 *     Input: haystack = "aaaaa", needle = "bba"
 *     Output: -1
 *  
 * 
 * Constraints:
 * 
 *     1 <= haystack.length, needle.length <= 104
 *     haystack and needle consist of only lowercase English characters.
 * 
 * @author John Dickerson - 18 Apr 2022
 */
public class Strstr {

    public int strStr( String haystack, String needle ) {

        char[] needleChars = needle.toCharArray();
        char[] haystackChars = haystack.toCharArray();

        if ( needleChars.length > haystackChars.length ) {

            return -1;
        }

        int index = 0;

        for ( char letter : haystack.toCharArray() ) {

            if ( letter == needleChars[0] ) {

                int start = index;
                boolean found = true;

                for ( int i = 0; i < needleChars.length; i++ ) {

                    if ( start >= haystackChars.length || haystackChars[start] != needleChars[i] ) {

                        found = false;
                        break;
                    }
                    else {

                        start++;
                    }
                }

                if ( found ) {

                    return index;
                }
            }

            index++;
        }

        return -1;
    }
}
