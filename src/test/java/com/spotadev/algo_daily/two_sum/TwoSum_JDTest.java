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
package com.spotadev.algo_daily.two_sum;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://algodaily.com/challenges/two-sum
 * 
 * Given an array of integers, return the indices of the two numbers that add up to a specific 
 * given target number.
 * 
 * Given an array e.g. [ 1, 9, 13, 20, 47] and a target number say 10. Two numbers that add up to 
 * ten in the array and their indices respectively are [0 and 1]
 * 
 * You may assume that each input would have exactly one solution. Additionally, you may not use 
 * the same element twice towards the sum. 
 *
 * Examples
 * ========
 * 
 *     1, 9, 13, 20, 47 add up to 10 => indexes: 0 and 1
 *     [3, 2, 4, 1, 9  add up to 12  => indexes: 1 and 4
 *
 * Constraints
 * ===========
 * 
 *     Length of the array <= 1000000
 * 
 *     Values of the array between -1000000000 and 10000000000
 * 
 *     The array can be empty
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(n)
 *     
 * @author John Dickerson - 3 Jan 2023
 */
public class TwoSum_JDTest extends AbstractTwoSumTest {

    @BeforeClass
    public void setUp() {

        twoSum = new TwoSum_JD();
    }


    @Test
    public void twoSum_1Test() {

        super.twoSum_1Test();
    }


    @Test
    public void twoSum_2Test() {

        super.twoSum_1Test();
    }


    @Test
    public void twoSum_3Test() {

        super.twoSum_1Test();
    }


    @Test
    public void twoSum_4Test() {

        super.twoSum_1Test();
    }
}
