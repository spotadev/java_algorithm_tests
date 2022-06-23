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
package com.spotadev.interview.miguel;

/**
 * @author John Dickerson - 23 Jun 2022
 */
public class Result {

    int patrol = 0;
    int submarine = 0;
    int destroyer = 0;

    void setResult( String inProgress ) {

        System.out.println( "inProgress = " + inProgress );

        int length = inProgress.length();

        switch ( length ) {

            case 1:
                patrol++;
                break;
            case 2:
                submarine++;
                break;
            case 3:
                destroyer++;
                break;
            default:
                break;
        }
    }
}
