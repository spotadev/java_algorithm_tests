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
package com.spotadev.algo_daily.sum_digits_until_one;

import org.testng.Assert;

/**
 * https://algodaily.com/challenges/sum-digits-until-one
 * 
 * Given a positive integer num, write a method to repeatedly add of all its digits until the 
 * result has only one digit?
 *
 * Example 1
 * =========
 * 
 *      Given num 49
 * 
 *      4 + 9 = 13
 *      1 + 3 = 4
 * 
 *      output --> 4
 *
 *  Example 2
 *  ========= 
 *      
 *      Given num 56
 *  
 *      5 + 6 = 11
 *      1 + 1 = 2
 *  
 *      output --> 2
 *
 *  Constraints
 *  ===========
 *  
 *      Input ranges from 0 and 100000000
 *  
 *      Time complexity: O (log n)
 *  
 *      Space complexity: O(1)
 *      
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractSumDigitsUntilOneTest {

    protected SumDigitsUntilOneAPI sumDigitsUntilOne;

    void sumDigits_1Test() {

        int input = 49;
        int output = sumDigitsUntilOne.sumDigits( input );
        Assert.assertEquals( output, 4 );
    }


    void sumDigits_2Test() {

        int input = 56;
        int output = sumDigitsUntilOne.sumDigits( input );
        Assert.assertEquals( output, 2 );
    }
}
