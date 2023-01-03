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
package com.spotadev.algo_daily.single_lonely_number;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class SingleLonelyNumber_JDTest extends AbstractSingleLonelyNumberTest {

    @BeforeClass
    public void setUp() {

        singleLonelyNumber = new SingleLonelyNumber_JD();
    }


    @Test
    public void lonelyNumber_1Test() {

        super.lonelyNumber_1Test();
    }


    @Test
    public void lonelyNumber_2Test() {

        super.lonelyNumber_2Test();
    }


    @Test
    public void lonelyNumber_3Test() {

        super.lonelyNumber_3Test();
    }
}
