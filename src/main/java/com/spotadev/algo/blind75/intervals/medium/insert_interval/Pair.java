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
package com.spotadev.algo.blind75.intervals.medium.insert_interval;

/**
 * @author John Dickerson - 26 Jan 2023
 */
public class Pair<Left, Right> {

    Left left;
    Right right;

    public Pair( Left left, Right right ) {

        this.left = left;
        this.right = right;
    }
}
