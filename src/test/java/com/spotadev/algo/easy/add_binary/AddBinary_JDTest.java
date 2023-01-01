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
package com.spotadev.algo.easy.add_binary;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 30 Dec 2022
 */
public class AddBinary_JDTest extends AbstractAddBinaryTest {

    @BeforeClass
    public void setUp() {

        addBinary = new AddBinary_JD();
    }


    @Test
    public void addBinaryTest_1() {

        super.addBinaryTest_1();
    }


    @Test
    public void addBinaryTest_2() {

        super.addBinaryTest_2();
    }


    @Test
    public void addBinaryTest_3() {

        super.addBinaryTest_3();
    }


    @Test
    public void addBinaryTest_4() {

        super.addBinaryTest_4();
    }
}
