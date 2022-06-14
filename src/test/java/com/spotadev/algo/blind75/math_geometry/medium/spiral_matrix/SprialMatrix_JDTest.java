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
package com.spotadev.algo.blind75.math_geometry.medium.spiral_matrix;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 19 May 2022
 */
public class SprialMatrix_JDTest extends AbstractSprialMatrixTest {

    @BeforeClass
    public void setUp() {

        spiralMatrix = new SpiralMatrix_JD();
    }


    @Test
    public void spiralOrderTest() {

        super.spiralOrderTest();
    }
}