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
package com.spotadev.amazon;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spotadev.amazon.interview.AmazonPowerQuestion2;

/**
 * @author John Dickerson - 4 Apr 2022
 */
public class AmazonPowerQuestion2Test {

    @Test
    public void findTotalPower() {

        List<Integer> powers = new ArrayList<>();
        powers.add( 2 );
        powers.add( 3 );
        powers.add( 2 );
        powers.add( 1 );
        int total = AmazonPowerQuestion2.findTotalPower( powers );
        Assert.assertEquals( total, 69 );
    }
}
