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
package com.spotadev.algo.blind75.twopointers.easy.validpalidrome;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * Optimised Solution
 * 
 *     Runtime: 5 ms, faster than 65.46% of Java online submissions for Valid Palindrome.
 *     Memory Usage: 43.7 MB, less than 54.31% of Java online submissions for Valid Palindrome.
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
 * removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * 
 *     Input: s = "A man, a plan, a canal: Panama"
 *     Output: true
 *     Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 *     Input: s = "race a car"
 *     Output: false
 *     Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * 
 *     Input: s = " "
 *     Output: true
 *     Explanation: s is an empty string "" after removing non-alphanumeric characters.
 *     Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 2 * 10^5
 *     s consists only of printable ASCII characters.
 * 
 * @author John Dickerson - 2 May 2022
 */
public class ValidPalindrome_Fast {

    // =============================================================================================
    //  Optimised Solution Below ===================================================================

    private char getNextValidLeftChar( AtomicInteger length, AtomicInteger leftIndex,
            char[] chars ) {

        while ( leftIndex.intValue() <= length.intValue() ) {

            int left = leftIndex.incrementAndGet();
            char leftChar = chars[left];
            int codeLeftChar = ( int )leftChar;

            if ( codeLeftChar >= 65 && codeLeftChar <= 90 ) {

                codeLeftChar = codeLeftChar + 32;
                return ( char )codeLeftChar;
            }
            else if ( codeLeftChar >= 97 && codeLeftChar <= 122 ) {

                return leftChar;
            }
            else if ( codeLeftChar >= 48 && codeLeftChar <= 57 ) {

                return leftChar;
            }
            else {

                length.decrementAndGet();
            }
        }

        return ( char )0;
    }


    private char getNextValidRightChar( AtomicInteger length, AtomicInteger rightIndex,
            char[] chars ) {

        while ( rightIndex.intValue() >= 1 ) {

            int right = rightIndex.decrementAndGet();
            char rightChar = chars[right];
            int codeRightChar = ( int )rightChar;

            if ( codeRightChar >= 65 && codeRightChar <= 90 ) {

                codeRightChar = codeRightChar + 32;
                return ( char )codeRightChar;
            }
            else if ( codeRightChar >= 97 && codeRightChar <= 122 ) {

                return rightChar;
            }
            else if ( codeRightChar >= 48 && codeRightChar <= 57 ) {

                return rightChar;
            }
            else {
                length.decrementAndGet();
            }

        }

        return ( char )0;
    }


    public boolean isPalindrome( String s ) {

        char[] chars = s.toCharArray();
        AtomicInteger length = new AtomicInteger( s.length() );
        AtomicInteger leftIndex = new AtomicInteger( -1 );
        AtomicInteger rightIndex = new AtomicInteger( length.intValue() );
        int count = 0;

        while ( count < length.intValue() / 2 ) {

            char leftChar = getNextValidLeftChar( length, leftIndex, chars );
            char rightChar = getNextValidRightChar( length, rightIndex, chars );

            if ( leftChar != rightChar ) {

                return false;
            }

            count++;
        }

        return true;
    }
}
