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
package com.spotadev.algo.blind75.arraysandhashing.easy.encode_and_decode_strings;

import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=B1k_sxOSgv8
 * 
 * https://www.lintcode.com/problem/659/
 * 
 *      Did not submit cos did not want to sign up
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
public interface EncodeAndDecodeStringsAPI {

    String encode( List<String> strs );


    List<String> decode( String str );

}