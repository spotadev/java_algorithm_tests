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
 *     public void reverse( T[] inData, T[] outData )
 * 
 * The data in inData should be reversed and put in outData.  Create a testng unit test to prove
 * your reverse works. You can expect inData and outData to be the same length. Also print both
 * inData and outData to the console.
 *
 * Time Allocated: 10 minutes
 *
 * Difficulty: 0
 * 
 * @author John Dickerson - 23rd Jun 2021
 */
public class AbstractReverseArrayTest {

    private Logger logger = LoggerFactory.getLogger( AbstractReverseArrayTest.class );

    protected ReverseArrayAPI<String> reverseArray;

    private String debug( String[] array ) {

        StringBuilder sb = new StringBuilder( "[" );

        for ( String string : array ) {

            sb.append( string ).append( ", " );
        }

        sb.append( "]" );
        return sb.toString();
    }


    public void reverseTest() {

        String[] inData =
                new String[] { "Reversing", "an", "Array", "is", "easy", "when", "you", "know",
                        "how." };

        String[] outData = new String[inData.length];
        String[] expected = { "how.", "know", "you", "when", "easy", "is", "Array", "an",
                "Reversing" };
        logger.info( debug( inData ) );
        reverseArray.reverse( inData, outData );
        logger.info( debug( outData ) );
        Assert.assertTrue( Arrays.equals( outData, expected ) );
    }
}
