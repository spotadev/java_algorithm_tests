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
package com.spotadev.algo.easy.remove_duplicates_from_sorted_array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class AbstractRemoveDuplicatesFromSortedArrayTest {

    private Logger logger = LoggerFactory.getLogger(
            AbstractRemoveDuplicatesFromSortedArrayTest.class );

    protected RemoveDuplicatesFromSortedArrayAPI removeDuplicatesFromSortedArray;

    private void assertEquals( int numberElements, int[] actual, int[] expected ) {

        for ( int i = 0; i < expected.length; i++ ) {

            Assert.assertEquals( actual[i], expected[i] );
        }
    }


    private void debug( int[] array ) {

        StringBuilder sb = new StringBuilder();
        sb.append( "[ " );

        for ( int element : array ) {

            sb.append( element ).append( ", " );
        }

        sb.append( " ]" );
        logger.info( sb.toString() );
    }


    public void removeDuplicatesTest_1() {

        int[] data = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int numberElements = removeDuplicatesFromSortedArray.removeDuplicates( data );
        logger.info( numberElements + "" );
        debug( data );
        Assert.assertEquals( numberElements, 5 );
        assertEquals( numberElements, data, new int[] { 0, 1, 2, 3, 4 } );
    }
}