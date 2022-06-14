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
package com.spotadev.algo.blind75.twopointers.difficulty_1.three_sum;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;

import com.spotadev.algo.blind75.twopointers.medium.three_sum.ThreeSumAPI;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractThreeSumTest {

    protected ThreeSumAPI threeSum;

    private String createVisualRepresentation( List<List<Integer>> lists ) {

        StringBuilder sb = new StringBuilder( "[" );
        Iterator<List<Integer>> listsIterator = lists.iterator();

        while ( listsIterator.hasNext() ) {

            sb.append( "[" );
            List<Integer> list = listsIterator.next();
            Iterator<Integer> listIterator = list.iterator();

            while ( listIterator.hasNext() ) {

                Integer integer = listIterator.next();
                sb.append( integer );

                if ( listIterator.hasNext() ) {

                    sb.append( "," );
                }
            }
            sb.append( "]" );

            if ( listsIterator.hasNext() ) {

                sb.append( "," );
            }
        }

        sb.append( "]" );
        return sb.toString();
    }


    public void threeSumTest_1() {

        List<List<Integer>> lists = threeSum.threeSum( new int[] { -1, 0, 1, 2, -1, -4 } );
        String visualRepresentation = createVisualRepresentation( lists );
        Assert.assertEquals( visualRepresentation, "[[-1,-1,2],[-1,0,1]]" );
    }


    public void threeSumTest_2() {

        List<List<Integer>> lists = threeSum.threeSum( new int[] {} );
        String visualRepresentation = createVisualRepresentation( lists );
        Assert.assertEquals( visualRepresentation, "[]" );
    }


    public void threeSumTest_3() {

        List<List<Integer>> lists = threeSum.threeSum( new int[] { 0 } );
        String visualRepresentation = createVisualRepresentation( lists );
        Assert.assertEquals( visualRepresentation, "[]" );
    }


    public void threeSumTest_4() {

        List<List<Integer>> lists = threeSum.threeSum( new int[] { 0, 0, 0, 0 } );
        String visualRepresentation = createVisualRepresentation( lists );
        Assert.assertEquals( visualRepresentation, "[[0,0,0]]" );
    }


    public void threeSumTest_5() {

        List<List<Integer>> lists = threeSum.threeSum( new int[] { -2, 0, 1, 1, 2 } );
        String visualRepresentation = createVisualRepresentation( lists );
        Assert.assertEquals( visualRepresentation, "[[-2,0,2],[-2,1,1]]" );
    }
}
