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
package com.spotadev.algo_daily.fizz_buzz;

/** 
 * https://algodaily.com/challenges/fizz-buzz
 * 
 * Given a number in the form of integer n, write a function that returns the string 
 * representation of all numbers from 0 to n, based on the following rules
 *
 *     i)   If it's a multiple of 3, represent it as "fizz".
 *     ii)  If it's a multiple of 5, represent it as "buzz".
 *     iii) If it's a multiple of both 3 and 5, represent it as "fizzbuzz".
 *     iv)  If it's neither just return the number itself.
 *
 * Constraints:
 * 
 *     i)   Maximum value of integer n<=1000
 *     ii)  n will always be a positive integer, but cannot be 0
 *     iii) Expected time complexity: O(n)
 *     iv ) Expected space complexity O(1)
 *
 *
 * @author John Dickerson - 2 Jan 2023
 */
public class FizzBuzzJD implements FizzBuzzAPI {

    @Override
    public String fizzBuzz( Integer num ) {

        StringBuilder sb = new StringBuilder();
        boolean fizz = false;
        boolean buzz = false;

        for ( int i = 1; i <= num; i++ ) {

            if ( i % 3 == 0 ) {

                fizz = true;
            }

            if ( i % 5 == 0 ) {

                buzz = true;
            }

            if ( fizz && buzz ) {

                sb.append( "fizzbuzz" );
            }
            else {

                if ( fizz ) {

                    sb.append( "fizz" );
                }
                else if ( buzz ) {

                    sb.append( "buzz" );
                }
                else {

                    sb.append( i );
                }
            }

            fizz = false;
            buzz = false;
        }

        return sb.toString();
    }
}
