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
 *     3. Merges the elements back to their sublists while sorting the elements in the order 
 *        intended.
 * 
 * For better understanding the above is visually shown below:
 *  
 * Having the list - { 5, 89, 34, 62, 17, 28, 46 }
 *  
 * The list is broken down to sublists i.e:
 *  
 *     { 5, 89, 62 , 34 } and { 17, 28, 46 }
 *  
 *  then:
 *  
 *     { 5, 89 } and { 62, 34 } and { 17, 28 } and { 46 }
 *  
 * then to single elements:
 *  
 *     { 5 } { 89 } { 62 } { 34 } { 17 } { 28 } { 46 }
 *  
 * the single elements are then merged back to their respective sublists when sorted  till the 
 * whole list is sorted
 *   
 * i.e
 *  
 *     { 5 } { 89 } { 62 } { 34 } { 17 } { 28 } { 46 }
 *  
 * are merged back as:
 *  
 *     { 5, 89 } { 34, 62 } { 17, 28 } { 46 }
 *  
 * then:
 *  
 *     { 5, 34, 62, 89 } and { 17, 28, 46 }
 *  
 * then finally:
 *  
 *     { 5, 17, 28, 34, 46, 62, 89 }
 *  
 * The big O notation of the algorithm is O (n*log n) in all cases i.e best, worst, average.
 *  
 * This is because whenever we divide a number into half in every step,  it can be represented 
 * using a logarithmic function, which is log n and the number of steps can be represented by 
 * log n + 1(at most)
 *  
 * Also, we perform a single step operation to find out the middle of any sub array, i.e. O(1).
 * And to merge the sub arrays, made by dividing the original array of n elements, a running time 
 * of O(n) will be required.
 *  
 * Hence the total time for mergeSort function will become n(log n + 1), which gives us a time 
 * complexity of O(n*log n). 
 *
 * Time Allocated: 25 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 2nd July 2021
 */
public class MergeSort {

    @SuppressWarnings( { "rawtypes", "unchecked" } )
    private void merge( Comparable[] first, Comparable[] second, Comparable[] result ) {

        // Index Position in first array - starting with first element
        int iFirst = 0;

        // Index Position in second array - starting with first element
        int iSecond = 0;

        // Index Position in merged array - starting with first position
        int iMerged = 0;

        // Compare elements at iFirst and iSecond, 
        // and move smaller element at iMerged
        while ( iFirst < first.length && iSecond < second.length ) {

            if ( first[iFirst].compareTo( second[iSecond] ) < 0 ) {

                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }

            iMerged++;
        }

        // copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy( first, iFirst, result, iMerged, first.length - iFirst );
        System.arraycopy( second, iSecond, result, iMerged, second.length - iSecond );
    }


    @SuppressWarnings( "rawtypes" )
    public Comparable[] mergeSort( Comparable[] list ) {

        // If list is empty; no need to do anything -- error handling
        if ( list.length <= 1 ) {

            return list;
        }

        // Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy( list, 0, first, 0, first.length );
        System.arraycopy( list, first.length, second, 0, second.length );

        // Sort each half recursively
        mergeSort( first );
        mergeSort( second );

        // Merge both halves together, overwriting to original array
        merge( first, second, list );
        return list;
    }
}
