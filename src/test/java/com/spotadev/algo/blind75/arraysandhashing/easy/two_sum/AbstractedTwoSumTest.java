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
package com.spotadev.algo.blind75.arraysandhashing.easy.two_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractedTwoSumTest {

    private Logger logger = LoggerFactory.getLogger( AbstractedTwoSumTest.class );

    protected TwoSumAPI twoSum;

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


    public void twoSumTest_1() {

        int[] indexes = twoSum.twoSum( new int[] { 2, 7, 11, 15 }, 9 );
        logger.info( debug( indexes ) );
        Assert.assertEquals( indexes, new int[] { 0, 1 } );
    }


    public void twoSumTest_2() {

        int[] indexes = twoSum.twoSum( new int[] { 3, 3 }, 6 );
        logger.info( debug( indexes ) );
        Assert.assertEquals( indexes, new int[] { 0, 1 } );
    }


    public void twoSumTest_3() {

        int[] indexes = twoSum.twoSum( new int[] { 2, 5, 5, 11 }, 10 );
        logger.info( debug( indexes ) );
        Assert.assertEquals( indexes, new int[] { 1, 2 } );
    }
}
