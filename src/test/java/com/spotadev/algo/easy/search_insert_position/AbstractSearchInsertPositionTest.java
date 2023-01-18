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
package com.spotadev.algo.easy.search_insert_position;

import org.testng.Assert;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class AbstractSearchInsertPositionTest {

    protected SearchInsertPositionAPI searchInsertPosition;

    void searchInsertTest_1() {

        int[] nums = { 1, 3, 5, 6 };
        int result = searchInsertPosition.searchInsert( nums, 5 );
        Assert.assertEquals( result, 2 );
    }


    void searchInsertTest_2() {

        int[] nums = { 1, 3, 5, 6 };
        int result = searchInsertPosition.searchInsert( nums, 2 );
        Assert.assertEquals( result, 1 );
    }


    void searchInsertTest_3() {

        int[] nums = { 1, 3, 5, 6 };
        int result = searchInsertPosition.searchInsert( nums, 7 );
        Assert.assertEquals( result, 4 );
    }
}
