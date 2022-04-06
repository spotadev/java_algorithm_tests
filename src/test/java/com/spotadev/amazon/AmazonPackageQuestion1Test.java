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

import org.testng.annotations.Test;

import com.spotadev.amazon.interview.AmazonPackageQuestion1;

/**
 * @author John Dickerson - 4 Apr 2022
 */
public class AmazonPackageQuestion1Test {

    @Test
    public void solutionTest() {

        List<Integer> packageWeights = new ArrayList<>();
        AmazonPackageQuestion1.getHeaviestPackage( packageWeights );
    }
}
