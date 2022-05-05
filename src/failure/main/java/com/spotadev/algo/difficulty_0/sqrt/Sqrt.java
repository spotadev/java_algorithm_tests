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
package com.spotadev.algo.difficulty_0.sqrt;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * 
 * Since the return type is an integer, the decimal digits are truncated, and only the integer 
 * part of the result is returned.
 * 
 * Note: You are not allowed to use any built-in exponent function or operator, 
 * such as pow(x, 0.5) or x ** 0.5.
 * 
 * Example 1:
 * 
 *     Input: x = 4
 *     Output: 2
 * 
 * Example 2:
 * 
 *     Input: x  = 8
 *     Output: 2
 * 
 *    Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 
 *    2 is returned.
 * 
 * 
 * Constraints:
 * 
 * 0 <= x <= 2^31 - 1
 * 
 * 
 * @author John Dickerson - 21 Apr 2022
 */
public class Sqrt {

    // 100 = 10 * 10
    // 1000 = 30 * 30 
    // 5000 = 70 * 70
    // 10,000 = 100 * 100
    // 100,000
    private long getHighEstimate( int x ) {

        long high = 0;

        if ( x <= 10 ) {

            high = 4;
        }
        else if ( x <= 100 ) {

            high = 10;
        }
        else if ( x < 1000 ) {

            high = 32;
        }
        else if ( x <= 10000 ) {

            high = 100;
        }
        else if ( x <= 100000 ) {

            high = 317;
        }
        else if ( x <= 1000000 ) {

            high = 1000;
        }
        else if ( x <= 10000000 ) {

            high = 3163;
        }
        else if ( x <= 100000000 ) {

            high = 10000;
        }
        else if ( x <= 1000000000 ) {

            high = 31623;
        }
        else if ( x < Integer.MAX_VALUE ) {

            high = 14655;
        }

        return high;
    }


    private int getInt( Long value ) {

        return value.intValue();
    }


    public int mySqrt( int x ) {

        long low = 0;
        long max = 14655;

        long lowerMid = low + ( ( max - low ) / 2 );
        long higherMid = lowerMid + 1;

        long higherMidSqr = higherMid * higherMid;
        long lowerMidSqr = lowerMid * lowerMid;

        while ( true ) {

            if ( higherMidSqr == x ) {

                return getInt( higherMid );
            }

            if ( lowerMidSqr == x ) {

                return getInt( lowerMid );
            }

            if ( higherMidSqr > x && lowerMidSqr < x ) {

                return getInt( lowerMid );
            }

            if ( higherMidSqr > x ) {

                max = lowerMid;
                lowerMid = low + ( ( max - low ) / 2 );
                higherMid = lowerMid + 1;
            }
            else if ( higherMidSqr < x ) {

                low = higherMid;
                lowerMid = low + ( ( max - low ) / 2 );
                higherMid = lowerMid + 1;
            }

            higherMidSqr = higherMid * higherMid;
            lowerMidSqr = lowerMid * lowerMid;
        }
    }
}
