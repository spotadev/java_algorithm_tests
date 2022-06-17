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
package com.spotadev.algo.blind75.graphs.medium.number_connected_components_in_an_undirected_graph;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 17 Jun 2022
 */
public class NumberConnectedComponentsInAnUndirectedGraph_JDTest extends
        AbstractNumberConnectedComponentsInAnUndirectedGraphTest {

    @BeforeClass
    public void setUp() {

        numberConnectedComponentsInAnUndirectedGraph =
                new NumberConnectedComponentsInAnUndirectedGraph_JD();
    }


    @Test
    public void countComponentsTest_1() {

        super.countComponentsTest_1();
    }


    @Test
    public void countComponentsTest_2() {

        super.countComponentsTest_2();
    }
}
