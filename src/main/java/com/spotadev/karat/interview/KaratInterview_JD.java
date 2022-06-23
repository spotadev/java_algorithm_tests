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
package com.spotadev.karat.interview;

import java.util.Arrays;

/**
 *
 * You are running a classroom and suspect that some of your students are passing around the
 * answers to multiple choice questions disguised as random strings. 4
 * Your task is to write a function that, given a list of words and a string, finds and returns 
 * the word in the list that is scrambled up inside the string, if any exists. There will be at 
 * most one matching word. The letters don't need to be in order or next to each other. The 
 * letters cannot be reused.
 * 
 * Example:
 * 
 * words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
 * 
 * string1 = 'tcabnihjs'
 * find_embedded_word(words, string1) -> cat (the letters do not have to be in order)
 * 
 * string2 = 'tbcanihjs'
 * find_embedded_word(words, string2) -> cat (the letters do not have to be together)
 * 
 * string3 = 'baykkjl'
 * find_embedded_word(words, string3) -> None
 * 
 * string4 = 'bbabylkkj'
 * find_embedded_word(words, string4) -> baby
 * 
 * string5 = 'ccc'
 * find_embedded_word(words, string5) -> None
 * 
 * string6 = 'breadmaking'
 * find_embedded_word(words, string6) -> bird
 *  
 * All Test Cases:
 * find_embedded_word(words, string1) -> cat
 * find_embedded_word(words, string2) -> cat
 * find_embedded_word(words, string3) -> None
 * find_embedded_word(words, string4) -> baby
 * find_embedded_word(words, string5) -> None
 * find_embedded_word(words, string6) -> bird
 * 
 * Complexity analysis variables: 36
 * 
 *     W = number of words in `words`
 *     S = maximal length of each word or string
 * 
 * @author John Dickerson - 23 Jun 2022
 */
public class KaratInterview_JD implements KaratInterviewAPI {

    /**
     * Time: 
     * 
     *     O( w * s + s log s + w log w)
     * 
     *         We are sorting 2 arrays which is:
     *     
     *             O(s log s)
     *             O(w log w)
     *         
     *         We also have 2 loops but the second loop is starting an incrementing index like 
     *         combinations
     *     
     *         The outer most loop is for words and the inner 2 loops are for length of strings for 
     *         the word and the string to check against
     *     
     *         So all in all we have something like:
     *     
     *             O( w * s + s log s + w log w)
     * 
     * Space: 
     * 
     *      O(n)
     * 
     */
    public String findWord( String stringToCheck, String[] words ) {

        for ( String word : words ) {

            // sort both word and stringToCheck
            char[] characters = word.toCharArray();
            Arrays.sort( characters );
            char[] sortedStringToCheck = stringToCheck.toCharArray();
            Arrays.sort( sortedStringToCheck );
            boolean found = true;

            for ( int i = 0; found && i < characters.length; i++ ) {

                found = false;

                for ( int d = i; d < sortedStringToCheck.length; d++ ) {

                    if ( characters[i] == sortedStringToCheck[d] ) {

                        found = true;
                        break;
                    }
                }
            }

            if ( found ) {

                return word;
            }
        }

        return null;
    }
}
