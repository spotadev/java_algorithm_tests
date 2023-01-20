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
package com.spotadev.algo_daily.single_lonely_number;

import org.testng.Assert;

/**
 * https://algodaily.com/challenges/lonely-number
 * 
 * In a given array of numbers, one element will show up once, and others will each show up twice. 
 * 
 * Find the number that appears only once in O(n) linear time.
 *
 * Examples
 * ========
 * 
 *     [1, 4, 7, 9, 4, 7, 1] --> [9]
 * 
 *     [4, 4, 6, 1, 3, 1, 3] --> [6]
 * 
 *     [3, 3, 9] --> [9]
 *
 * Constraints
 * ===========
 * 
 *     Length of the array <= 100000
 * 
 *      The values of the array will be between - 10000000 and 100000000000
 *      
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractSingleLonelyNumberTest {

    protected SingleLonelyNumberAPI singleLonelyNumber;

    void lonelyNumber_1Test() {

        int[] arr = { 1, 4, 7, 9, 4, 7, 1 };
        int result = singleLonelyNumber.lonelyNumber( arr );
        int expected = 9;
        Assert.assertEquals( result, expected );
    }


    void lonelyNumber_2Test() {

        int[] arr = { 4, 4, 6, 1, 3, 1, 3 };
        int result = singleLonelyNumber.lonelyNumber( arr );
        int expected = 6;
        Assert.assertEquals( result, expected );
    }


    void lonelyNumber_3Test() {

        int[] arr = { 3, 3, 9 };
        int result = singleLonelyNumber.lonelyNumber( arr );
        int expected = 9;
        Assert.assertEquals( result, expected );
    }
}
