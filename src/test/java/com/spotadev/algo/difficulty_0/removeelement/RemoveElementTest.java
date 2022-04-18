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
package com.spotadev.algo.difficulty_0.removeelement;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 18 Apr 2022
 */
public class RemoveElementTest {

    private RemoveElement removeElement;

    @BeforeClass
    public void setUp() {

        removeElement = new RemoveElement();
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
