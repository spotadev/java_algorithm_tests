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
package com.spotadev.algo.blind75.binarysearch.medium.search_in_rotated_sorted_array;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.binarysearch.medium.search_in_rotated_sorted_array.SearchInRotatedSortedArray;

/**
 * @author John Dickerson - 5 May 2022
 */
public class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray searchInRotatedSortedArray;

    @BeforeClass
    public void setUp() {

        searchInRotatedSortedArray = new SearchInRotatedSortedArray();
    }


    @Test
    public void searchTest_1() {

        int result = searchInRotatedSortedArray.search( new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0 );
        Assert.assertEquals( result, 4 );
    }


    @Test
    public void searchTest_2() {

        int result = searchInRotatedSortedArray.search( new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3 );
        Assert.assertEquals( result, -1 );
    }


    @Test
    public void searchTest_3() {

        int result = searchInRotatedSortedArray.search( new int[] { 1 }, 0 );
        Assert.assertEquals( result, -1 );
    }


    @Test
    public void searchTest_4() {

        int result = searchInRotatedSortedArray.search( new int[] { 5, 1, 3 }, 2 );
        Assert.assertEquals( result, -1 );
    }
}
