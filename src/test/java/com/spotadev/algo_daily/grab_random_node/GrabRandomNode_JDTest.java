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
package com.spotadev.algo_daily.grab_random_node;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class GrabRandomNode_JDTest extends AbstractGrabRandomNodeTest {

    @BeforeClass
    public void setUp() {

        grabRandomNode = new GrabRandomNodeJD();
    }


    @Test
    public void fetchRandomNodeTest() {

        super.fetchRandomNodeTest();
    }
}
