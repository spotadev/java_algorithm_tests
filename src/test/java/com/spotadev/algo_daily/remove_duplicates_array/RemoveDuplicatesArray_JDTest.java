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
package com.spotadev.algo_daily.remove_duplicates_array;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://algodaily.com/challenges/uniqueness-of-arrays
 *
 * Given an array, return another array with just the ordered unique elements from the given array 
 * i.e. remove the duplicate values from the array.
 * 
 * N/B: No sorting is allowed since the order of the elements has to be preserved. Order should be 
 * maintained with the first occurrence of the element in the given array.
 *
 * Examples
 * ========
 *     input : [1, 3, 4, 4, 5, 8, 4, 2, 2,] --> output : [1, 3, 4, 5, 8, 2]
 * 
 *     input: [2, 3, 4, 5, 5, 1, 1, 7, 8] --> output: [2, 3, 4, 5, 1, 7]
 * 
 *     input: [3, 5, 6, 9, 4, 3, 12] --> output: [3, 5, 6, 9, 4, 12]
 * 
 *     input: [13, 5, 3, 5, 8, 13, 14, 5, 9] --> output: [13, 5, 3, 8, 14, 9]
 *
 * Constraints
 * ===========
 * 
 *     Length of the array <= 100000
 * 
 *     Values in between the array -1000000000 and 1000000000
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(n)
 *
 * @author John Dickerson - 3 Jan 2023
 */
public class RemoveDuplicatesArray_JDTest extends AbstractRemoveDuplicatesArrayTest {

    @BeforeClass
    public void setUp() {

        removeDuplicatesArray = new RemoveDuplicatesArray_JD();
    }


    @Test
    public void unique_1Test() {

        super.unique_1Test();
    }


    @Test
    public void unique_2Test() {

        super.unique_2Test();
    }


    @Test
    public void unique_3Test() {

        super.unique_3Test();
    }


    @Test
    public void unique_4Test() {

        super.unique_4Test();
    }
}
