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
package com.spotadev.algo_daily.dollar_sign_deletion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class DollarSignDeletion_JDTest extends AbstractDollarSignDeletionTest {

    @BeforeClass
    public void setUp() {

        dollarSignDeletionAPI = new DollarSignDeletionJD();
    }


    @Test
    public void isDollarDeleteEqual_1Test() {

        super.isDollarDeleteEqual_1Test();
    }


    @Test
    public void getFinalStr_1Test() {

        super.getFinalStr_1Test();
    }
}
