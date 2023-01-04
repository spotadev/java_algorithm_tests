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
package com.spotadev.algo_daily.fibonacci_sequence;

/**
 * https://algodaily.com/challenges/fibonacci-sequence
 * 
 * Implement a function that returns the Fibonnaci number for a given integer input. In a fibonnaci 
 * sequence, each sum is the sum of the two preceding numbers:
 * 
 * fibonacci(0) = 0
 * fibonacci(1) = 1
 * fibonacci(2) = 1
 * fibonacci(3) = 1 + 1 = 2
 * fibonacci(4) = 1 + 2 = 3
 * fibonacci(5) = 2 + 3 = 5
 * fibonacci(n) = ?
 * 
 * So calculate ? for n
 * 
 * Constraints
 * ===========
 * 
 *     The value of n will always be a non negative integer and <=40
 * 
 *     The answer is guaranteed to fit in the integer data type
 * 
 *  Expected time and space complexity are both O(n)
 *
 * @author John Dickerson - 2 Jan 2023
 */
public class FibonnaciSequenceJD implements FibonnaciSequenceAPI {

    @Override
    public int fibonacciSequence( int n ) {

        if ( n == 0 ) {

            return 0;
        }

        if ( n == 1 ) {

            return 1;
        }

        int prePre = 0;
        int pre = 1;
        int sum = 0;

        for ( int i = 2; i <= n; i++ ) {

            sum = prePre + pre;
            prePre = pre;
            pre = sum;
        }

        return sum;
    }
}
