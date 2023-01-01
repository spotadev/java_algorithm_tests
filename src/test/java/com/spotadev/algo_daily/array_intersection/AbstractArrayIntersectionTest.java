package com.spotadev.algo_daily.array_intersection;

import java.util.Arrays;

import org.testng.Assert;

/**
 * @author John Dickerson - 5 Feb 2022
 */
public class AbstractArrayIntersectionTest {

    protected ArrayIntersectionAPI arrayIntersection;

    public void intersection_1_Test() {

        int[] num1 = { 1, 2, 3, 4, 5 };
        int[] num2 = { 2, 3 };
        int[] expected = { 2, 3 };
        int[] intersection = arrayIntersection.intersection( num1, num2 );
        Assert.assertTrue( Arrays.equals( intersection, expected ) );
    }


    public void intersection_2_Test() {

        int[] num1 = { 3, 5, 6, 7 };
        int[] num2 = { 5, 6, 8 };
        int[] expected = { 5, 6 };
        int[] intersection = arrayIntersection.intersection( num1, num2 );
        Assert.assertTrue( Arrays.equals( intersection, expected ) );
    }
}
