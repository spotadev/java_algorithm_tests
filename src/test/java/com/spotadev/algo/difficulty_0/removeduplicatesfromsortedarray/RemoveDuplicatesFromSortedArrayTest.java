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
package com.spotadev.algo.difficulty_0.removeduplicatesfromsortedarray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class RemoveDuplicatesFromSortedArrayTest {

    private Logger logger = LoggerFactory.getLogger( RemoveDuplicatesFromSortedArrayTest.class );

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeClass
    public void setUp() {

        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }


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


    @Test
    public void removeDuplicatesTest_1() {

        int[] data = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int numberElements = removeDuplicatesFromSortedArray.removeDuplicates( data );
        logger.info( numberElements + "" );
        debug( data );
        Assert.assertEquals( numberElements, 5 );
        assertEquals( numberElements, data, new int[] { 0, 1, 2, 3, 4 } );
    }
}
