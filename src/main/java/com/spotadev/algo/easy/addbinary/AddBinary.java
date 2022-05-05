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
package com.spotadev.algo.easy.addbinary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://leetcode.com/problems/add-binary/
 * 
 *     Runtime: 1 ms, faster than 99.99% of Java online submissions for Add Binary.
 *     Memory Usage: 42.6 MB, less than 66.98% of Java online submissions for Add Binary.
 * 
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1:
 * 
 *     Input: a = "11", b = "1"
 *     Output: "100"
 * 
 * Example 2:
 * 
 *     Input: a = "1010", b = "1011"
 *     Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 * 
 * @author John Dickerson - 19 Apr 2022
 */
public class AddBinary {

    private Logger logger = LoggerFactory.getLogger( AddBinary.class );

    private void debug( int index, char[] array ) {

        StringBuilder sb = new StringBuilder( index );
        sb.append( " : [" );

        for ( char i = 0; i < array.length; i++ ) {

            sb.append( array[i] ).append( ", " );
        }

        sb.append( "]" );
        logger.info( sb.toString() );
    }


    private int addShortestToLongest(
            int shortestLength,
            int longestLength,
            char[] longest,
            char[] shortest ) {

        int diffSize = longestLength - shortestLength;
        int carry = 0;

        for ( int i = longestLength - 1; i >= 0; i-- ) {

            int indexShortest = i - diffSize;

            // this is where the arrays overlap
            if ( indexShortest >= 0 ) {

                if ( shortest[indexShortest] == '1' && longest[i] == '1' ) {

                    longest[i] = carry == 1 ? '1' : '0';
                    carry = 1;
                }
                else if ( shortest[indexShortest] == '0' && longest[i] == '0' ) {

                    if ( carry == 1 ) {

                        longest[i] = '1';
                        carry = 0;
                    }
                    else {
                        longest[i] = '0';
                    }
                }
                else {

                    if ( carry == 1 ) {
                        longest[i] = '0';
                        carry = 1;
                    }
                    else {
                        longest[i] = '1';
                    }
                }
            } // this next part is where the 2 arrays do not overlap
            else {
                if ( carry == 1 ) {
                    if ( longest[i] == '1' ) {

                        longest[i] = '0';
                        carry = 1;
                    }
                    else {
                        longest[i] = '1';
                        carry = 0;
                    }
                }
                else {
                    break;
                }
            }

            debug( i, longest );
        }

        return carry;
    }


    public String addBinary( String a, String b ) {

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int aLength = aChar.length;
        int bLength = bChar.length;
        char[] longest;
        char[] shortest;
        int longestLength;
        int shortestLength;

        if ( aLength > bLength ) {
            longest = aChar;
            longestLength = aLength;
            shortest = bChar;
            shortestLength = bLength;
        }
        else {
            longest = bChar;
            longestLength = bLength;
            shortest = aChar;
            shortestLength = aLength;
        }

        int carry =
                addShortestToLongest(
                        shortestLength, longestLength, longest, shortest );

        if ( carry == 1 ) {

            char[] array = new char[longest.length + 1];
            System.arraycopy( longest, 0, array, 1, longest.length );
            array[0] = '1';
            return new String( array );
        }

        return new String( longest );
    }
}
