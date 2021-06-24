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
package com.spotadev.algo.difficulty_0.reversearray;

/**
 * Implement a method with the following method signature:
 * 
 *     public void reverse( T[] inData )
 * 
 * The data in inData should be reversed. Create a testng unit test to prove your reverse works. 
 * Also print nData before and after the sort.  Also test arrays with odd and even length.
 *
 * Time Allocated: 10 minutes
 *
 * Difficulty: 0
 * 
 * @author John Dickerson - 23rd Jun 2021
 */
public class ReverseArrayInPlace<T> {

    public void reverse( T[] inData ) {
            
        int endIndex = inData.length - 1;
        
        for ( int i=0; i<inData.length; i++ ) {
            
            if ( endIndex > i ) {
            
                T temp = inData[ endIndex ];
                inData[ endIndex ] = inData[ i ];
                inData[i] = temp;
                endIndex--;
            }
            else {
                break;
            }
        }
    }
}
