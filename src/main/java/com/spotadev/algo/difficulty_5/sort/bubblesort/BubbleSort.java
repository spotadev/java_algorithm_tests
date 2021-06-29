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
package com.spotadev.algo.difficulty_5.sort.bubblesort;

/**
 * Implement a method with the following method signature:
 * 
 * public void bubbleSort(int[] array, int fromIndex, int toIndex)
 * 
 * The data in array should be sorted to a correct ascending or descending
 * order. Create a testng unit test to prove your reverse works. Print both
 * unsorted and sorted array to the console.
 *
 * Time Allocated: 20 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 29th June 2021
 */

public class BubbleSort {

	/*
	 * bubble sort method taking in an array and two integers of the index to start
	 * sorting from and index to which the array is to be sorted
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void bubbleSort(int[] array, int fromIndex, int toIndex) {
		int d;

		// for loop iterating the whole array again if elements aren't sorted yet
		for (int i = toIndex - 1; i > fromIndex; i--) {
			/*
			 * boolean to help break the loop if the "if" in the for loop below is not
			 * accesses as isSorted will remain true
			 */
			boolean isSorted = true;
			for (int j = fromIndex; j < i; j++) {
				// If consecutive elements in array are in wrong order then swap them!
				if (((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
					isSorted = false;
					d = array[j + 1];
					array[j + 1] = array[j];
					array[j] = d;
				}
			}
			// If there is no swapping then array is already sorted!! Hence break!
			if (isSorted)
				break;
		}
	}
}
