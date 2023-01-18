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
package com.spotadev.algo.easy.plus_one;

import org.testng.Assert;

/**
 * @author John Dickerson - 19 Apr 2022
 */
public abstract class AbstractPlusOneTest {

    protected PlusOneAPI plusOne;

    void plusOneTest_1() {

        int[] digits = new int[] { 1, 2, 3 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 1, 2, 4 } );
    }


    void plusOneTest_2() {

        int[] digits = new int[] { 4, 3, 2, 1 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 4, 3, 2, 2 } );
    }


    void plusOneTest_3() {

        int[] digits = new int[] { 9 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 1, 0 } );
    }


    void plusOneTest_4() {

        int[] digits = new int[] { 9, 9, 9, 9 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 1, 0, 0, 0, 0 } );
    }


    void plusOneTest_5() {

        int[] digits = new int[] { 8, 9, 9, 9 };
        int[] incremented = plusOne.plusOne( digits );
        Assert.assertEquals( incremented, new int[] { 9, 0, 0, 0 } );
    }
}
