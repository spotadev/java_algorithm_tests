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
package com.spotadev.algo.hard.sort.bubble_sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implement a method with the following method signature:
 * 
 *     public void bubbleSort(int[] array, int fromIndex, int toIndex)
 * 
 * The data in array should be sorted to a correct ascending or descending order. Create a testng 
 * unit test to prove your bubble sort works. Print both unsorted and sorted array to the console.
 * 
 * The bubble sort algorithm works as follows
 * 
 *     0, 1, 2, 3, 4, 5, 6
 *     0, 1, 2, 3, 4, 5,
 *     0, 1, 2, 3, 4,
 *     0, 1, 2, 3, 
 *     0, 1, 2,
 *     0, 1, 
 *     
 *  On the first line it compares:
 *  
 *     0 with 1
 *     1 with 2
 *     2 with 3
 *     ...
 *     5 with 6
 *     
 *  Then the second line it compares;
 *  
 *     0 with 1
 *     1 with 2
 *     2 with 3
 *     ...
 *     4 with 5
 *     
 *  e.t.c
 *  
 *  So with data:
 *  
 *      line 1:                            V   V
 *      { [16,  13], 42,  11,   9,    6,  75,  40, }
 *      {  13, [16,  42], 11,   9,    6,  75,  40, }
 *      {  13,  16, [42,  11],  9,    6,  75,  40, }
 *      {  13,  16,  11, [42,   9],   6,  75,  40, }
 *      {  13,  16,  11,   9, [42,    6], 75,  40, }
 *      {  13,  16,  11,   9,   6,  [42,  75], 40, }
 *      {  13,  16,  11,   9,   6,   42, [75,  40],}
 *      
 *      line 2:                      V     V
 *      { [13,  16], 11,   9,   6,   42,  40,  75, }
 *      {  13, [16,  11],  9,   6,   42,  40,  75, }
 *      {  13,  11, [16,   9],  6,   42,  40,  75, }
 *      {  13,  11,   9, [16,   6],  42,  40,  75, }
 *      {  13,  11,   9,   6, [16,   42], 40,  75, }
 *      {  13,  11,   9,   6,  16,  [42,  40], 75, }
 *      
 *      line 3:                V      V
 *      { [13,  11],  9,   6,  16,   40,  42,  75, }
 *      {  11, [13,   9],  6,  16,   40,  42,  75, }
 *      {  11,   9, [13,   6], 16,   40,  42,  75, }
 *      {  11,   9,   6, [13,  16],  40,  42,  75, }
 *      {  11,   9,   6,  13, [16,   40], 42,  75, }
 *      
 *      line 4:            V    V
 *      { [11,   9],  6,  13,  16,   40,  42,  75, }
 *      {   9, [11,   6], 13,  16,   40,  42,  75, }
 *      {   9,   6, [11,  13], 16,   40,  42,  75, } 
 *      {  [9,   6], 11, [13,  16],  40,  42,  75, }
 *      
 *      line 5:       V    V
 *      {  [9,   6], 11,  13,  16,   40,  42,  75, }
 *      {   6,  [9,  11], 13,  16,   40,  42,  75, }
 *      {   6,   9, [11,  13], 16,   40,  42,  75, }
 *      
 *      line 6:  V    V
 *      {  [6,   9], 11,  13,  16,   40,  42,  75, }
 *      {   6,  [9,  11], 13,  16,   40,  42,  75, }
 *      
 *      line 7:
 *          V    V
 *      {  [6,   9], 11,  13,  16,   40,  42,  75, }
 *      
 *      End:
 *      {   6,   9,  11,  13,  16,   40,  42,  75, }
 *
 *  So for this we did a minimum of 28 compare and at worst 28 swap operations on a data set of 8:
 *  
 *  Actually the exact big o notation of the algorithm is:  2 * (7 + 6 + 5 + 4 + 3 + 2 + 1) = 56
 *  
 *  That is the same as:   
 *  
 *      ((n-1)n)
 *      
 *  However it is custom to add a big O before the actual formula:
 *  
 *     Worst case:  O ((n-1)n)      = 56
 *     Best  case:  O ((n-1)n)/2)   = 28
 *     
 *  So this is more efficient than O(n^2) which is quadratic.  Quadratic would have been 84 instead of 56
 *
 * However it is almost quadratic
 *
 * Time Allocated: 20 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 29th June 2021
 */
public class BubbleSort {

    private Logger logger = LoggerFactory.getLogger( BubbleSort.class );

    private String show( int[] array ) {

        StringBuilder sb = new StringBuilder( "{" );

        for ( int someInt : array ) {

            sb.append( someInt ).append( ", " );
        }

        sb.append( "}" );
        return sb.toString();
    }


    /*
     * bubble sort method taking in an array and two integers of the index to start sorting from 
     * and index to which the array is to be sorted.
     */
    public void bubbleSort( int[] array, int fromIndex, int toIndex ) {

        int tempInt;

        for ( int i = toIndex - 1; i > fromIndex; i-- ) {

            // boolean to help break the loop if the "if" in the for loop below is not accessed as 
            // isSorted will remain true
            boolean isSorted = true;

            for ( int j = fromIndex; j < i; j++ ) {

                // logger.info( j + "" );

                // If consecutive elements in array are in wrong order then swap them!
                if ( ( ( Comparable<Integer> )array[j] ).compareTo( array[j + 1] ) > 0 ) {

                    isSorted = false;
                    tempInt = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempInt;
                }

                logger.info( show( array ) );
            }

            // If there is no swapping then array is already sorted!! Hence break!
            if ( isSorted ) {

                break;
            }
        }
    }
}
