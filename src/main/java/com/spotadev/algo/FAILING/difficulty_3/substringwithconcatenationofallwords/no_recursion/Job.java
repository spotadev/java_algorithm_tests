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
