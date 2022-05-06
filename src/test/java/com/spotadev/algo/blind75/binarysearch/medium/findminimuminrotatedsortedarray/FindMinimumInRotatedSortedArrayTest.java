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
package com.spotadev.algo.blind75.binarysearch.medium.findminimuminrotatedsortedarray;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 5 May 2022
 */
public class FindMinimumInRotatedSortedArrayTest {

    private FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray;

    @BeforeClass
    public void setup() {

        findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
    }


    @Test
    public void findMinTest_1() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 3, 4, 5, 1, 2 } );
        Assert.assertEquals( min, 1 );
    }


    @Test
    public void findMinTest_2() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 4, 5, 6, 7, 0, 1, 2 } );
        Assert.assertEquals( min, 0 );
    }


    @Test
    public void findMinTest_3() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 11, 13, 15, 17 } );
        Assert.assertEquals( min, 11 );
    }


    @Test
    public void findMinTest_4() {

        int min = findMinimumInRotatedSortedArray.findMin( new int[] { 4, 5, 1, 2, 3 } );
        Assert.assertEquals( min, 1 );
    }
}
