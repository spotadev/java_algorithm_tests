package com.spotadev.algo.difficulty_5.sort.bubblesort;

import java.util.Arrays;

/**
 * Implement a method with the following method signature:
 * 
 *     public void bubbleSort(int[] array, int fromIndex, int toIndex)
 * 
 * The data in array should be sorted to a correct ascending order. Create a testng unit test to prove
 * your bubble sort works. Print both unsorted and sorted array to the console.
 *
 * Time Allocated: 20 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 29th June 2021
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BubbleSortTest {
	private Logger logger = LoggerFactory.getLogger(BubbleSortTest.class);
	private BubbleSort bubbleSort;

	// method to make output array to be readable and understandable
	private String show(int[] array) {
		StringBuilder sb = new StringBuilder("{");

		for (int someInt : array) {

			sb.append(someInt).append(", ");
		}

		sb.append("}");
		return sb.toString();
	}

	@BeforeClass
	public void setUp() {

		bubbleSort = new BubbleSort();
	}

	@Test
	public void bubbleSortTest() {

		// This is unsorted array
		int[] someArray = new int[] { 16, 13, 42, 11, 9, 6, 75, 40 };

		// This is the expected array after using bubble sort method
		int[] expected = new int[] { 6, 9, 11, 13, 16, 40, 42, 75 };

		logger.info(show(someArray));

		// sorting values in the array using the bubble sort method
		bubbleSort.bubbleSort(someArray, 0, someArray.length);

		// show the sorted array using bubble sort
		logger.info(show(someArray));

		// compare if the output is equal to the expected sorted array.
		Assert.assertTrue(Arrays.equals(someArray, expected));
	}
}
