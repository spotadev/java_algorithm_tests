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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class ReverseArray_JDTest extends AbstractReverseArrayTest {

    @BeforeClass
    public void setUp() {

        reverseArray = new ReverseArray_JD<>();
    }


    @Test
    public void reverseTest() {

        super.reverseTest();
    }
}
