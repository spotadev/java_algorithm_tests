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
package com.spotadev.algo_daily.missing_number_array;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://algodaily.com/challenges/find-missing-number-in-array
 * 
 * Given an array of continuous numbers that should increment sequentially by 1, 
 * 
 *      e.g. [1, 2, 3, 4, 5, 6]
 * 
 * However there are some missing numbers.
 * 
 *      [1, 2, 4, 6, 7]
 * 
 * Write a method missingNumbers that takes an array of continuous variables and returns the 
 * missing integers
 *
 * Example 1
 * =========
 * 
 *     input: [1, 2, 4, 6, 8] --> output: [3, 5, 7]
 * 
 * Example 2
 * =========
 * 
 *      input: [2, 4, 5, 6] --> output
 *
 * Constraints
 * ===========
 * 
 *      Length of the array <= 100000
 * 
 *      Array will always contain non-negative integers excluding zero
 * 
 *      Time Complexity: O(n)
 * 
 *      Space Complexity: O(1)
 *      
 * @author John Dickerson - 3 Jan 2023
 */
public class MissingNumberArray_JDTest extends AbstractMissingNumberArrayTest {

    @BeforeClass
    public void setUp() {

        missingNumberArray = new MissingNumberArrayJD();
    }


    @Test
    public void missingNumber_1Test() {

        super.missingNumber_1Test();
    }
}
