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
package com.spotadev.algo.medium.search.binary;

// @todo
public class BinarySearch {
    public static int binarySearch(int[] arr, int value){
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            mid = low + (high - low) / 2;

            if(arr[mid] ==value)
                return mid;
            else if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Driver code
    public static void main (String [] args) {
        System.out.println("Binary search >>");
        int[] arrNums = {10, 20, 30, 40, 50, 60};
        System.out.println(binarySearch(arrNums, 90));
    }
}
