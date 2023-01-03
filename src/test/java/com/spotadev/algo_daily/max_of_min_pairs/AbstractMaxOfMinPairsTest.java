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
package com.spotadev.algo_daily.max_of_min_pairs;

import static org.testng.Assert.assertEquals;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractMaxOfMinPairsTest {

    protected MaxOfMinPairsAPI maxOfMinPairs;

    public void smallArrayTest() {

        int[] numbers = { 3, 4, 2, 5 };
        int result = maxOfMinPairs.maxOfMinPairs( numbers );

        // min(2,3 ) + min( 4, 5 ) = 2 + 4 = 6
        assertEquals( result, 6 );
    }


    public void largeArrayTest() {

        int[] numbers = { 1, 3, 2, 6, 5, 4 };
        int result = maxOfMinPairs.maxOfMinPairs( numbers );

        // min( 1, 2 ) + min( 3, 4 ) + min( 5, 6 ) = 1 + 3 + 5 = 9
        assertEquals( result, 9 );
    }
}
