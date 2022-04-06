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
package com.spotadev.algo.FAILING.difficulty_3.substringwithconcatenationofallwords.no_recursion;

import java.util.List;

/**
 * @author John Dickerson - 1 Apr 2022
 */
public class Job {

    List<String> remainingWords;
    int startIndex;
    int currentIndex;

    public Job( List<String> remainingWords, int startIndex, int currentIndex ) {

        super();
        this.remainingWords = remainingWords;
        this.startIndex = startIndex;
        this.currentIndex = currentIndex;
    }
}
