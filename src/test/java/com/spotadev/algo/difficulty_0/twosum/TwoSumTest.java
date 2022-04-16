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
package com.spotadev.algo.difficulty_0.twosum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 16 Apr 2022
 */
public class TwoSumTest {

    private Logger logger = LoggerFactory.getLogger( TwoSumTest.class );

    private TwoSum twoSum;

    private String debug( int[] indexes ) {

        if ( indexes != null ) {

            StringBuilder sb = new StringBuilder();
            sb.append( "[ " );

            for ( int index : indexes ) {

                sb.append( index ).append( ", " );
            }

            sb.append( " ]" );
            return sb.toString();
        }
        else {

            return null;
        }
    }


    @BeforeClass
    public void setUp() {

        twoSum = new TwoSum();
    }


    @Test
    public void twoSumTest_1() {

        int[] indexes = twoSum.twoSum( new int[] { 2, 7, 11, 15 }, 9 );
        logger.info( debug( indexes ) );
        Assert.assertEquals( indexes, new int[] { 0, 1 } );
    }


    @Test
    public void twoSumTest_2() {

        int[] indexes = twoSum.twoSum( new int[] { 3, 3 }, 6 );
        logger.info( debug( indexes ) );
        Assert.assertEquals( indexes, new int[] { 0, 1 } );
    }


    @Test
    public void twoSumTest_3() {

        int[] indexes = twoSum.twoSum( new int[] { 2, 5, 5, 11 }, 10 );
        logger.info( debug( indexes ) );
        Assert.assertEquals( indexes, new int[] { 1, 2 } );
    }
}
