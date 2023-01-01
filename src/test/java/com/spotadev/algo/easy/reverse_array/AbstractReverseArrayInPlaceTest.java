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
package com.spotadev.algo.easy.reverse_array;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * Implement a method with the following method signature:
 * 
 *     public void reverse( T[] inData )
 * 
 * The data in inData should be reversed. Create a testng unit test to prove your reverse works. 
 * Also print nData before and after the sort.  Also test arrays with odd and even length.
 *
 * Time Allocated: 10 minutes
 *
 * Difficulty: 0
 * 
 * @author John Dickerson - 23rd Jun 2021
 */
public class AbstractReverseArrayInPlaceTest {

    private Logger logger = LoggerFactory.getLogger( AbstractReverseArrayInPlaceTest.class );

    protected ReverseArrayInPlaceAPI<String> reverseArrayInPlace;

    private String debug( String[] array ) {

        StringBuilder sb = new StringBuilder( "[" );

        for ( String string : array ) {

            sb.append( string ).append( ", " );
        }

        sb.append( "]" );
        return sb.toString();
    }


    public void reverseTest() {

        String[] inData1 = new String[] { "1", "2", "3", "4", "5", "6" };
        String[] expected1 = { "6", "5", "4", "3", "2", "1" };
        String[] inData2 = new String[] { "1", "2", "3", "4", "5", "6", "7" };
        String[] expected2 = { "7", "6", "5", "4", "3", "2", "1" };

        logger.info( debug( inData1 ) );
        reverseArrayInPlace.reverse( inData1 );
        logger.info( debug( inData1 ) );
        Assert.assertTrue( Arrays.equals( inData1, expected1 ) );

        logger.info( debug( inData2 ) );
        reverseArrayInPlace.reverse( inData2 );
        logger.info( debug( inData2 ) );
        Assert.assertTrue( Arrays.equals( inData2, expected2 ) );
    }
}
