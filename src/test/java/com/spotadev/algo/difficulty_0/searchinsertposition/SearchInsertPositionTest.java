/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_0.searchinsertposition;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
