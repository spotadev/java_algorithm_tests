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
package com.spotadev.algo.easy.remove_element;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.easy.remove_element.RemoveElement_JD;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class RemoveElementTest {

    private RemoveElementAPI removeElement;

    @BeforeClass
    public void setUp() {

        removeElement = new RemoveElement_JD();
    }


    private void assertEquals( int[] actual, int[] expected ) {

        for ( int i = 0; i < expected.length; i++ ) {

            Assert.assertEquals( actual[i], expected[i] );
        }
    }


    @Test
    public void removeElementTest_1() {

        int[] data = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int k = removeElement.removeElement( data, 2 );
        Assert.assertEquals( k, 5 );
        assertEquals( data, new int[] { 0, 1, 3, 0, 4 } );
    }
}
