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
package com.spotadev.algo.blind75.bitmanipulation.medium.sum_of_two_integers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=gVUrDV4tZfY
 * 
 * https://leetcode.com/problems/sum-of-two-integers/
 * 
 * Given two integers a and b, return the sum of the two integers without using the operators 
 * + and -.
 * 
 * Example 1:
 * 
 *     Input: a = 1, b = 2
 *     Output: 3
 * 
 * Example 2:
 * 
 *     Input: a = 2, b = 3
 *     Output: 5
 *  
 * Constraints:
 * 
 *     -1000 <= a, b <= 1000
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class SumOfTwoIntegers_JDTest extends AbstractSumOfTwoIntegersTest {

    @BeforeClass
    public void setUp() {

        sumOfTwoIntegers = new SumOfTwoIntegers_JD();
    }


    @Test
    public void getSum_1Test() {

        super.getSum_1Test();
    }


    @Test
    public void getSum_2Test() {

        super.getSum_2Test();
    }


    @Test
    public void getSum_3Test() {

        super.getSum_3Test();
    }


    @Test
    public void getSum_4Test() {

        super.getSum_4Test();
    }
}
