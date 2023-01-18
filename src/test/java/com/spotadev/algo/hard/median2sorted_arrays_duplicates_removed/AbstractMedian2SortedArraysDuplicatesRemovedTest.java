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
package com.spotadev.algo.hard.median2sorted_arrays_duplicates_removed;

import org.testng.Assert;

/**
 * @author John Dickerson - 4 Feb 2022
 */
public class AbstractMedian2SortedArraysDuplicatesRemovedTest {

    protected Median2SortedArraysDuplicatesRemovedAPI median2SortedArrays;

    void findMedianUsingThirdArray_evenLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 4.5 );
    }


    void findMedianUsingThirdArray_oddLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6, 9 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 5.0 );
    }


    void findMedianUsingTreeSet_evenLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8 };

        double median = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        Assert.assertEquals( median, 4.5 );
    }


    void findMedianUsingTreeSet_oddLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6, 9 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        double median = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        Assert.assertEquals( median, 5.0 );
    }


    void findMedianUsingThirdArray_test_O_Notation() {

        int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num4 = { 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };

        for ( int i = 0; i < 10; i++ ) {

            // for warm up
            long nanoStartWarm = System.nanoTime();
            double warmMedium = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
            long nanoEndWarm = System.nanoTime();
            long nanoTest_Warm = nanoEndWarm - nanoStartWarm;
            System.out.println( "WARM: " + i + " " + nanoTest_Warm );
        }

        long nanoStartTest1 = System.nanoTime();
        double mediumTest1 = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        long nanoEndTest1 = System.nanoTime();
        long nanoTest1_Time = nanoEndTest1 - nanoStartTest1;
        System.out.println( nanoTest1_Time );

        long nanoStartTest2 = System.nanoTime();
        double mediumTest2 = median2SortedArrays.findMedianUsingThirdArray( num3, num4 );
        long nanoEndTest2 = System.nanoTime();
        long nanoTest2_Time = nanoEndTest2 - nanoStartTest2;
        System.out.println( nanoTest2_Time );

        Assert.assertEquals( mediumTest1, 8.5 );
        Assert.assertEquals( mediumTest2, 16.5 );
    }


    void findMedianUsingTreeSet_test_O_Notation() {

        int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] num4 = { 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };

        for ( int i = 0; i < 10; i++ ) {

            // for warm up
            long nanoStartWarm = System.nanoTime();
            double warmMedium = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
            long nanoEndWarm = System.nanoTime();
            long nanoTest_Warm = nanoEndWarm - nanoStartWarm;
            System.out.println( "WARM: " + i + " " + nanoTest_Warm );
        }

        long nanoStartTest1 = System.nanoTime();
        double mediumTest1 = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        long nanoEndTest1 = System.nanoTime();
        long nanoTest1_Time = nanoEndTest1 - nanoStartTest1;
        System.out.println( nanoTest1_Time );

        long nanoStartTest2 = System.nanoTime();
        double mediumTest2 = median2SortedArrays.findMedianUsingTreeSet( num3, num4 );
        long nanoEndTest2 = System.nanoTime();
        long nanoTest2_Time = nanoEndTest2 - nanoStartTest2;
        System.out.println( nanoTest2_Time );

        Assert.assertEquals( mediumTest1, 8.5 );
        Assert.assertEquals( mediumTest2, 16.5 );
    }
}
