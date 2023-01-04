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
package com.spotadev.algo_daily.dollar_sign_deletion;

/**
 * https://algodaily.com/challenges/dollar-sign-deletion
 * 
 * Given an array of strings containing alphabetical characters and certain $ characters.
 * 
 * A $ represents a DELETE action whereby the character before it is deleted
 * 
 * Each of the strings is run through a method to operate on the $ DELETE action. 
 * 
 * We want to find out if the final string is the same for all of them. For example:
 *
 * Example
 * =======
 * 
 *     input --> ["f$st", "st"]
 *     output --> true (both strings have become "st")
 *
 * Constraints
 * ===========
 * 
 *     Array input can be of any size.
 * 
 *     Every string has at least a single character
 * 
 *     The string will consist of dollar signs and lowercase alphabets.
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(n) for a good solution, O(1) for asymptotically optimal solution
 * 
 * @author John Dickerson - 2 Jan 2023
 */
public class DollarSignDeletionJD implements DollarSignDeletionAPI {

    @Override
    public boolean isDollarDeleteEqual( String[] array ) {

        String previous = null;

        for ( String element : array ) {

            String finalStr = getFinalStr( element );

            if ( previous != null ) {

                if ( !previous.equals( finalStr ) ) {

                    return false;
                }
            }
            else {

                previous = finalStr;
            }
        }

        return true;
    }


    @Override
    public String getFinalStr( String str ) {

        String toReturn = "";
        boolean skip = false;

        // We start on the right and move left.  We continue if we find a $ or the character after
        // it
        for ( int i = str.length(); i > 0; i-- ) {

            char c = str.charAt( i - 1 );

            if ( c == '$' ) {

                skip = true;
                continue;
            }

            if ( skip ) {

                skip = false;
                continue;
            }

            toReturn = c + toReturn;
        }

        return toReturn;
    }
}
