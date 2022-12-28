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
package com.spotadev.algo.easy.reverse_array;

/**
 * Implement a method with the following method signature:
 * 
 *     public void reverse( T[] inData )
 * 
 * The data in inData should be reversed. Create a testng unit test to prove your reverse works. 
 * Also print inData before and after the sort.  Also test arrays with odd and even length.
 *
 * Time Allocated: 10 minutes
 *
 * Difficulty: 0
 * 
 * @author John Dickerson - 23rd Jun 2021
 */
public interface ReverseArrayInPlaceAPI<T> {

    /**
     * Given 1, 2, 3, 4, 5, 6
     * 
     * We swap as follows:
     * 
     *      6, 2, 3, 4, 5, 1
     *      6, 5, 3, 4, 2, 1
     *      6, 5, 4, 3, 2, 1
     */
    void reverse( T[] inData );

}