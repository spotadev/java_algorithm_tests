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
package com.spotadev.algo_daily.product_except_self;

import org.testng.annotations.BeforeClass;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class ProductExceptSelf_JDTest extends AbstractProductExceptSelfTest {

    @BeforeClass
    public void setUp() {

        productExceptSelf = new ProductExceptSelf_JD();
    }


    public void productExceptSelfTest() {

        super.productExceptSelfTest();
    }
}
