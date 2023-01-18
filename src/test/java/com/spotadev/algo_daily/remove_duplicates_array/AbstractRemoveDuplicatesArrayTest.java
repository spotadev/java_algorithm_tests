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
package com.spotadev.algo_daily.remove_duplicates_array;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public abstract class AbstractRemoveDuplicatesArrayTest {

    protected RemoveDuplicatesArrayAPI removeDuplicatesArray;

    void unique_1Test() {

        int[] arr = { 1, 3, 4, 4, 5, 8, 4, 2, 2 };
        List<Integer> outputList = removeDuplicatesArray.unique( arr );
        System.out.println( outputList );
        int[] output = outputList.stream().mapToInt( Integer::intValue ).toArray();
        int[] expected = { 1, 3, 4, 5, 8, 2 };
        Assert.assertTrue( Arrays.equals( output, expected ) );
    }


    void unique_2Test() {

        int[] arr = { 2, 3, 4, 5, 5, 1, 1, 7, 8 };
        List<Integer> outputList = removeDuplicatesArray.unique( arr );
        System.out.println( outputList );
        int[] output = outputList.stream().mapToInt( Integer::intValue ).toArray();
        int[] expected = { 2, 3, 4, 5, 1, 7, 8 };
        Assert.assertTrue( Arrays.equals( output, expected ) );
    }


    void unique_3Test() {

        int[] arr = { 3, 5, 6, 9, 4, 3, 12 };
        List<Integer> outputList = removeDuplicatesArray.unique( arr );
        System.out.println( outputList );
        int[] output = outputList.stream().mapToInt( Integer::intValue ).toArray();
        int[] expected = { 3, 5, 6, 9, 4, 12 };
        Assert.assertTrue( Arrays.equals( output, expected ) );
    }


    void unique_4Test() {

        int[] arr = { 13, 5, 3, 5, 8, 13, 14, 5, 9 };
        List<Integer> outputList = removeDuplicatesArray.unique( arr );
        System.out.println( outputList );
        int[] output = outputList.stream().mapToInt( Integer::intValue ).toArray();
        int[] expected = { 13, 5, 3, 8, 14, 9 };
        Assert.assertTrue( Arrays.equals( output, expected ) );
    }
}
