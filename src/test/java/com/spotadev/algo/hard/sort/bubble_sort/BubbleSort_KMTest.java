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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Implement a method with the following method signature:
 * 
 *     public void bubbleSort(int[] array, int fromIndex, int toIndex)
 * 
 * The data in array should be sorted to a correct ascending order. Create a testng unit test to 
 * prove your bubble sort works. Print both unsorted and sorted array to the console.
 *
 * Time Allocated: 20 minutes
 *
 * Difficulty: 5
 * 
 * @author Kingsley Muturi - 29th June 2021
 */
public class BubbleSort_KMTest extends AbstractBubbleSortTest {

    @BeforeClass
    public void setUp() {

        bubbleSort = new BubbleSort_KM();
    }


    @Test
    public void bubbleSortTest() {

        super.bubbleSortTest();
    }
}
