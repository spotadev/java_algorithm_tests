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
package com.spotadev.algo_daily.remove_duplicates_array;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class RemoveDuplicatesArray_JDTest extends AbstractRemoveDuplicatesArrayTest {

    @BeforeClass
    public void setUp() {

        removeDuplicatesArray = new RemoveDuplicatesArray_JD();
    }


    @Test
    public void unique_1Test() {

        super.unique_1Test();
    }


    @Test
    public void unique_2Test() {

        super.unique_2Test();
    }


    @Test
    public void unique_3Test() {

        super.unique_3Test();
    }


    @Test
    public void unique_4Test() {

        super.unique_4Test();
    }
}
