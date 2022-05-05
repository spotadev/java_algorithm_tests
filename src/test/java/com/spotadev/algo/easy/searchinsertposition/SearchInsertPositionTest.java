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
package com.spotadev.algo.easy.searchinsertposition;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.easy.searchinsertposition.SearchInsertPosition;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @BeforeClass
    public void setUp() {

        searchInsertPosition = new SearchInsertPosition();
    }


    @Test
    public void searchInsertTest_1() {

        int[] nums = { 1, 3, 5, 6 };
        int result = searchInsertPosition.searchInsert( nums, 5 );
        Assert.assertEquals( result, 2 );
    }


    @Test
    public void searchInsertTest_2() {

        int[] nums = { 1, 3, 5, 6 };
        int result = searchInsertPosition.searchInsert( nums, 2 );
        Assert.assertEquals( result, 1 );
    }


    @Test
    public void searchInsertTest_3() {

        int[] nums = { 1, 3, 5, 6 };
        int result = searchInsertPosition.searchInsert( nums, 7 );
        Assert.assertEquals( result, 4 );
    }
}
