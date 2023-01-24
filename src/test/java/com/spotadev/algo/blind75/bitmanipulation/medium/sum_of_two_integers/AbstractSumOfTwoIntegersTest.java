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

import org.testng.Assert;

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
public class AbstractSumOfTwoIntegersTest {

    protected SumOfTwoIntegersAPI sumOfTwoIntegers;

    void getSum_1Test() {

        int a = 1;
        int b = 2;
        int result = sumOfTwoIntegers.getSum( a, b );
        Assert.assertEquals( result, 3 );
    }


    void getSum_2Test() {

        int a = 2;
        int b = 3;
        int result = sumOfTwoIntegers.getSum( a, b );
        Assert.assertEquals( result, 5 );
    }


    void getSum_3Test() {

        int a = 3;
        int b = 3;
        int result = sumOfTwoIntegers.getSum( a, b );
        Assert.assertEquals( result, 6 );
    }


    public void getSum_4Test() {

        int a = 231;
        int b = 232;
        int result = sumOfTwoIntegers.getSum( a, b );
        Assert.assertEquals( result, 463 );
    }
}
