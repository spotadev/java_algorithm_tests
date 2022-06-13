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
package com.spotadev.algo.blind75.arraysandhashing.easy.contains_duplicates;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class ContainsDuplicates_JDTest extends AbstractContainsDuplicatesTest {

    @BeforeClass
    public void setUp() {

        containsDuplicates = new ContainsDuplicates_JD();
    }


    @Test
    public void containsDuplicateTest_1() {

        super.containsDuplicateTest_1();
    }


    @Test
    public void containsDuplicateTest_2() {

        super.containsDuplicateTest_2();
    }


    @Test
    public void containsDuplicateTest_3() {

        super.containsDuplicateTest_3();
    }
}
