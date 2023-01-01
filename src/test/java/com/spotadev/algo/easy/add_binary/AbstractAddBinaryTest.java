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

import org.testng.Assert;

/**
 * @author John Dickerson - 19 Apr 2022
 */
public abstract class AbstractAddBinaryTest {

    protected AddBinaryAPI addBinary;

    public void addBinaryTest_1() {

        String a = "11";
        String b = "1";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "100" );
    }


    public void addBinaryTest_2() {

        String a = "1010";
        String b = "1011";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "10101" );
    }


    //    100
    // 110010
    // 110110
    public void addBinaryTest_3() {

        String a = "100";
        String b = "110010";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "110110" );
    }


    //  101111
    //      10
    //  110001
    public void addBinaryTest_4() {

        String a = "101111";
        String b = "10";
        String result = addBinary.addBinary( a, b );
        Assert.assertEquals( result, "110001" );
    }
}
