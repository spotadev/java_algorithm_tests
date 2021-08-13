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
package com.spotadev.algo.difficulty_5.sort.mergesort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Implement two methods with the following method signatures:
 * 
 *     public Comparable[] mergeSort(Comparable[] list)
 *     private static void merge(Comparable[] first, Comparable[] second, Comparable[] result)
 * 
 * The data in array should be sorted to a correct ascending or descending order. Create a testng 
 * unit test to prove your bubble sort works. Print both unsorted and sorted array to the console.
 * 
 * The merge sort algorithm works as follows:
 * 
 *     1. It divides the unsorted list into two sublists of about the same size i.e into half
 * 
 *     2. Divides the sublists again to smaller sublists until there are single elements in each 
 *        collection.
 * 
 *     3. Merges the elements back to their sublists while sorting the elements in the order intended.
 * 
 *  For better understanding the above is visually shown below:
 *  
 *  Having the list - { 5, 89, 34, 62, 17, 28, 46 }
 *  
 *  The list is broken down to sublists i.e:
 *  
 *      { 5, 89, 62 , 34 } and { 17, 28, 64 }
 *  
 *  then:
 *  
 *      { 5, 89 } and { 62, 34 } and { 17, 28 } and { 64 }
 *  
 *  then to single elements:
 *  
 *      { 5 } { 89 } { 62 } { 34 } { 17 } { 28 } { 64 }
 *  
 *  the single elements are then merged back to their respective sublists when sorted  till the 
 *  whole list is sorted
 *   
 *  i.e
 *  
 *      { 5 } { 89 } { 62 } { 34 } { 17 } { 28 } { 64 }
 *  
 *  are merged back as:
 *  
 *      { 5, 89 } { 34, 62 } { 17, 28 } { 64 }
 *  
 *  then:
 *  
 *      { 5, 34, 62, 89 } and { 17, 28, 64 }
 *  
 *  then finally:
 *  
 *      { 5, 17, 28, 34, 62, 64, 89 }
 *
 * Time Allocated: 25 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 2nd July 2021
 */
public class MergeSortTest {

    private Logger logger = LoggerFactory.getLogger( MergeSortTest.class );
    private MergeSort mergeSort;

    @BeforeClass
    public void setUp() {

        mergeSort = new MergeSort();
    }


    // method to make output array to be readable and understandable
    private String show( Integer[] array ) {

        StringBuilder sb = new StringBuilder( "{" );

        for ( int someInt : array ) {

            sb.append( someInt ).append( ", " );
        }

        sb.append( "}" );
        return sb.toString();
    }


    @Test
    public void mergeSortTest() {

        //Unsorted array
        Integer[] unsortedArray = { 5, 89, 34, 62, 17, 28, 46 };

        //The expected sorted array
        Integer[] expectedSort = { 5, 17, 28, 34, 46, 62, 89 };

        //showing the unsorted array on testng
        logger.info( show( unsortedArray ) );

        //calling the merge sort function
        mergeSort.mergeSort( unsortedArray );

        //showing the sorted array
        logger.info( show( unsortedArray ) );

        //comparing if the output is equal to the sorted array
        Assert.assertTrue( Arrays.deepEquals( unsortedArray, expectedSort ) );
    }
}
