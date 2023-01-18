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
package com.spotadev.algo.blind75.binarysearch.medium.find_minimum_in_rotated_sorted_array;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractFindMinimumInRotatedSortedArrayTest {

    protected FindMinimumInRotatedSortedArrayAPI findMinimumInRotatedSortedArray;

    void findMinTest_1() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 3, 4, 5, 1, 2 } );
        Assert.assertEquals( min, 1 );
    }


    void findMinTest_2() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 4, 5, 6, 7, 0, 1, 2 } );
        Assert.assertEquals( min, 0 );
    }


    void findMinTest_3() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 11, 13, 15, 17 } );
        Assert.assertEquals( min, 11 );
    }


    void findMinTest_4() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 4, 5, 1, 2, 3 } );
        Assert.assertEquals( min, 1 );
    }
}
