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
package com.spotadev.algo.medium.search.binary;

import org.testng.Assert;

/**
 * @author johndickerson - 30 Dec 2022
 */
public class AbstractBinarySearchTest {

    protected BinarySearchAPI binarySearch;

    public void binarySearchTest() {

        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        int result = binarySearch.binarySearch( numbers, 50 );
        Assert.assertEquals( result, 4 );
    }
}
