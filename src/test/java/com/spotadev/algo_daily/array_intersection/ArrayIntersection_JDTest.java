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
package com.spotadev.algo_daily.array_intersection;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 1 Jan 2023
 */
public class ArrayIntersection_JDTest extends AbstractArrayIntersectionTest {

    @BeforeClass
    public void setUp() {

        arrayIntersection = new ArrayIntersectionJD();
    }


    @Test
    public void intersection_1_Test() {

        super.intersection_1_Test();
    }


    @Test
    public void intersection_2_Test() {

        super.intersection_2_Test();
    }
}
