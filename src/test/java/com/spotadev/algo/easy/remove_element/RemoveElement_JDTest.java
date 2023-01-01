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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RemoveElement_JDTest extends AbstractRemoveElementTest {

    @BeforeClass
    public void setUp() {

        removeElement = new RemoveElement_JD();
    }


    @Test
    public void removeElementTest_1() {

        super.removeElementTest_1();
    }
}
