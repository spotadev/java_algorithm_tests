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
package com.spotadev.algo_daily.swap_two_nodes_list;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class SwapTwoNodes_JDTest extends AbstractSwapTwoNodesTest {

    @BeforeClass
    public void setUp() {

        swapTwoNodes = new SwapTwoNodes_JD();
    }


    @Test
    public void swapEveryTwo_1Test() {

        super.swapEveryTwo_1Test();
    }


    @Test
    public void swapEveryTwo_2Test() {

        super.swapEveryTwo_2Test();
    }


    @Test
    public void swapEveryTwo_3Test() {

        super.swapEveryTwo_3Test();
    }
}
