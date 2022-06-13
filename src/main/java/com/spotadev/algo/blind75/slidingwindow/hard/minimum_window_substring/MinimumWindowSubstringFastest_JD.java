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
package com.spotadev.algo.blind75.slidingwindow.hard.minimum_window_substring;

/**
 * See MimimumWindowSubstring for the question.  
 * 
 * This was the fastest solution from leetcode.  The performance was 1 ms which was 32 times 
 * faster than my solution in MimimumWindowSubstring.
 * 
 * The main performance enhancement he has is not using a map.  As char can be cast to int,
 * wherever you want to use a Map where the key is a Character you can instead use an array
 * where the index of the array is the Character.  This can speed up performance 32 times
 * 
 * @author John Dickerson - 5 May 2022
 */
public class MinimumWindowSubstringFastest_JD implements MinimumWindowSubstringAPI {

    public String minWindow( String s, String t ) {

        int[] need = new int[123];
        int miss = t.length();
        char[] have = s.toCharArray();

        // here the index of the array is the char we need, and value is the count of occurrences
        for ( char c : t.toCharArray() )
            need[c]++;

        int i = 0, j = 0, l = 0, r = 0;

        // r is the right pointer of the window
        while ( r < s.length() ) {

            // miss is initiated with the number of characters in t.
            // We reduce
            if ( need[have[r]] > 0 )
                miss--;

            // we reduce the count of each character as we move the right pointer to the right
            need[have[r]]--;
            r++;

            // when the miss count is zero it means we have a match.   We now move the left pointer
            // to the right.  We want to see if we can make the match shorter.  Maybe the characters
            // on the left are not needed
            while ( miss == 0 ) {

                // we update j and i if our current window length is less than them
                if ( j == 0 || ( r - l ) < ( j - i ) ) {

                    j = r;
                    i = l;
                }

                // as we have removed a character from the left of our window we increment 
                // the count for the character in question
                need[have[l]]++;

                // if we a count of more than zero for the character it means we do not have 
                // sufficient occurences of it it in our window for a match. 
                // We therefore increase the number of missing characters in miss.
                if ( need[have[l]] > 0 )
                    miss++;

                // we increment the left pointer to see if we can shrink the length of the found
                // string while retaining the match
                l++;
            }
        }

        // these are the indexes of the shortest found string
        return s.substring( i, j );
    }
}
