/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
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
