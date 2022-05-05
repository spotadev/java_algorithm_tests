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
package com.spotadev.algo.blind75.arraysandhashing.easy.encodeanddecodestrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://www.lintcode.com/problem/659/
 * 
 *      Did not submit cos did not want to sing up
 * 
 * Design an algorithm to encode a list of strings to a string. The encoded string is then sent 
 * over the network and is decoded back to the original list of strings.
 * 
 * Please implement encode and decode
 * 
 * Example1
 * 
 *     Input: ["lint","code","love","you"]
 *     Output: ["lint","code","love","you"]
 * 
 *     Explanation:
 *     One possible encode method is: "lint:;code:;love:;you"
 * 
 * Example2
 * 
 *     Input: ["we", "say", ":", "yes"]
 *     Output: ["we", "say", ":", "yes"]
 * 
 *     Explanation:
 *     One possible encode method is: "we:;say:;:::;yes"
 * 
 * @author John Dickerson - 1 May 2022
 */
public class EncodeAndDecodeStrings {

    public String encode( List<String> strs ) {

        Iterator<String> iterator = strs.iterator();

        StringBuilder sb = new StringBuilder();

        while ( iterator.hasNext() ) {

            sb.append( iterator.next() );

            if ( iterator.hasNext() ) {

                sb.append( "#" );
            }
        }

        return sb.toString();
    }


    public List<String> decode( String str ) {

        StringTokenizer tokenizer = new StringTokenizer( str, "#" );
        List<String> words = new ArrayList<>();

        while ( tokenizer.hasMoreTokens() ) {

            words.add( tokenizer.nextToken() );
        }

        return words;
    }
}
