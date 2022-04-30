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
package com.spotadev.algo.FAILING.difficulty_0.sqrt;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.FAILING.difficulty_0.sqrt.Sqrt;

/**
 * @author John Dickerson - 21 Apr 2022
 */
public class SqrtTest {

    private Sqrt sqrt;

    @BeforeClass
    public void setUp() {

        sqrt = new Sqrt();
    }


    @Test
    public void mySqrtTest_1() {

        int number = 100;
        int answer = sqrt.mySqrt( number );
        Assert.assertEquals( answer, 10 );
    }


    @Test
    public void mySqrtTest_2() {

        int number = 8;
        int answer = sqrt.mySqrt( number );
        Assert.assertEquals( answer, 2 );
    }


    @Test
    public void mySqrtTest_3() {

        int number = 2147395599;
        int answer = sqrt.mySqrt( number );
        Assert.assertEquals( answer, 46339 );
    }
}