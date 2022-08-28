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
package com.spotadev.interview.undirected_graph;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 26 Jun 2022
 */
public class UndirectedGraph_MSTest extends AbstractUndirectedGraphTest {

    @BeforeClass
    public void setUp() {

        this.undirectedGraph = new UndirectedGraph_MS();
    }


    @Test
    public void sumOfAllEdgesTest_1() {

        super.sumOfAllEdgesTest_1();
    }
}