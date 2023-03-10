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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class FibonnaciSequence_JDTest extends AbstractFibonnaciSequenceTest {

    @BeforeClass
    public void setUp() {

        fibonnaciSequenceAPI = new FibonnaciSequenceJD();
    }


    @Test
    public void fibonacciSequence_1Test() {

        super.fibonacciSequence_1Test();
    }


    @Test
    public void fibonacciSequence_2Test() {

        super.fibonacciSequence_2Test();
    }
}
