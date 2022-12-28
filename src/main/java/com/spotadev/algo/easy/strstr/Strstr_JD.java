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
package com.spotadev.algo.easy.strstr;

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
public class Strstr_JD implements StrstrAPI {

    @Override
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
