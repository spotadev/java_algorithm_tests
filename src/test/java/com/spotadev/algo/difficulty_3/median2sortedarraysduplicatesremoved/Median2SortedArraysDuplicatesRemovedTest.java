/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_3.median2sortedarraysduplicatesremoved;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.difficulty_3.median2sortedarraysduplicatesremoved.Median2SortedArraysDuplicatesRemoved;

/**
 * @author John Dickerson - 4 Feb 2022
 */
public class Median2SortedArraysDuplicatesRemovedTest {

    private Median2SortedArraysDuplicatesRemoved median2SortedArrays;

    @BeforeClass
    public void setUp() {

        median2SortedArrays = new Median2SortedArraysDuplicatesRemoved();
    }


    @Test
    public void findMedianUsingThirdArray_evenLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 4.5 );
    }


    @Test
    public void findMedianUsingThirdArray_oddLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6, 9 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        double median = median2SortedArrays.findMedianUsingThirdArray( num1, num2 );
        Assert.assertEquals( median, 5.0 );
    }


    @Test
    public void findMedianUsingTreeSet_evenLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8 };

        double median = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        Assert.assertEquals( median, 4.5 );
    }


    @Test
    public void findMedianUsingTreeSet_oddLengthMergedTest() {

        int[] num1 = { 1, 3, 4, 5, 6, 7, 8 };
        int[] num2 = { 2, 3, 4, 5, 6, 9 };
        // int[] merged = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        double median = median2SortedArrays.findMedianUsingTreeSet( num1, num2 );
        Assert.assertEquals( median, 5.0 );
    }


    @Test
    public void findMedianUsingThirdArray_test_O_Notation() {

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


    @Test
    public void findMedianUsingTreeSet_test_O_Notation() {

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