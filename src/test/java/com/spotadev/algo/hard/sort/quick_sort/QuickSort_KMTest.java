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
package com.spotadev.algo.hard.sort.quick_sort;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Implement a method with the following method signature:
 * 
 *     public void quickSort(int[] arr, int low, int high)
 * 
 * The data in array should be sorted to a correct ascending or descending order. Create a testng 
 * unit test to prove your quick sort works. Print both unsorted and sorted array to the console.
 * 
 * Here is how the quick sort algorithm works:
 * 
 *    1. A pivot element is picked from the array.
 *    
 *    2. All elements that are smaller than the pivot are placed to it's left
 *       while all elements that are greater are placed to it's right. (This is for ascending order)
 *       
 *    3. Pivot elements are again picked from the items on the right and those on the left of the 
 *       original pivot element and procedure 2 is repeated again till the array is sorted.
 *       
 *  Below is a visual representation of the procedure:
 *  
 *  suppose we have [ 14, 21, 5, 62, 1, 12, 7 ] as our array.
 *  
 *  Step 1 : select a pivot element in our case [62]
 *  
 *           Hence:
 *           
 *                  [ 14, 21, 5, (62), 1, 12, 7 ]
 *                  
 *  Step 2 : comparing the other elements placing smaller to the left and greater to the right of 
 *           the pivot
 *
 *          i.e
 *          
 *                  [ 14, 21, 5, 1, (62), 12, 7 ]
 *                  
 *          here, going through the array from 14, 14, 21 and 5 are all smaller than 62 hence they 
 *          remain on the left
 *          
 *          1 is swapped with 62 to come to it's left as it is smaller.
 *          
 *          hence:
 *          
 *                  [ 14, 21, 5, 1, 12, (62), 7 ]
 *                  
 *          then finally:
 *          
 *                  [ 14, 21, 5, 1, 12, 7, (62) ]
 *                  
 *  Step 3 : another pivot element is chosen from the remaining elements e.g 5 in our case
 *          hence:
 *                  [ 14, 21, (5), 1, 12, 7 ]
 *                  
 *          here we start with 14 being the primary pivot element for 5 (as it is the first greater 
 *          element than 5 on the left)
 *          
 *          meaning it will be swapped with first number that is less than 5
 *          
 *          i.e
 *                  [ 1, 21, (5), 14, 12, 7 ]
 *            
 *           Next 21 will again be swapped with first number less than 5,
 *           
 *           if there is no, it will be swapped with 5
 *           
 *           i.e
 *                  [ 1, (5), 21, 14, 12, 7 ]
 *           
 *           Since the left side of 5 is already sorted no swapping will occur
 *           
 *           we move to it's right side and choose a pivot e.g 14
 *           
 *           i.e
 *                  [ 21, (14), 12, 7 ]
 *                  
 *           21 (chosen as primary pivot as it is greater than 14 on the left) will again be swapped
 *           with first number that is less than 14
 *                
 *                  [ 12, (14), 21, 7 ]
 *               
 *           then 7 is swapped with 21
 *                 
 *                  [ 12, (14), 7, 21 ]
 *                  
 *           then 14 is finally swapped with 7
 *           
 *                  [ 12, 7, (14), 21 ]
 *                  
 *           Since right side of the pivot is sorted no swapping occurs 
 *           then left side is picked for sorting along with a pivot e.g. 12
 *           
 *           i.e
 *                  [ (12), 7 ]
 *           
 *           Finally they are swapped and now the array is sorted, but lets put 
 *           
 *           them back slowly for better understanding:
 *           
 *                  [ 7, 12, 14, 21]
 *                  
 *                  [ 1, 5, 7, 12, 14, 21 ]
 *                  
 *          then finally!!
 *                  
 *                  [ 1, 5, 7, 12, 14, 21, 62 ]
 *                  
 *  Now to the big O notation of the algorithm:
 *  
 *  Worst case occurs when the pivot element picked is either the greatest ( as in the beginning 
 *  above) or the smallest element.
 *  
 *  This condition leads to the case in which the pivot element lies in an extreme end of the 
 *  sorted array. 
 *  
 *  One sub-array is always empty and another sub-array contains n - 1 elements.
 *  
 *  Thus, quick sort is called only on this sub-array.
 *  
 *  Hence worst case is : O(n^2)
 *  
 *  Best case occurs when the pivot element is always the middle element hence a time complexity
 *  of O(n*log n)
 *           
 *  NB: Pivot elements chosen can be at the middle but still be the greatest elements
 *      hence a worst case situation of the algorithm.
 *
 * Time Allocated: 20 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 29th June 2021
 */
public class QuickSort_KMTest extends AbstractQuickSortTest {

    @BeforeClass
    public void setUp() {

        quickSort = new QuickSort_KM();
    }


    @Test
    public void heapSortTest() {

        super.heapSortTest();
    }
}
