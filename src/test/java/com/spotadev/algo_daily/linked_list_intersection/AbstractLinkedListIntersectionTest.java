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
package com.spotadev.algo_daily.linked_list_intersection;

import org.testng.Assert;

import com.spotadev.algo_daily.linked_list_intersection.LinkedListIntersectionAPI.LinkedList;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractLinkedListIntersectionTest {

    protected LinkedListIntersectionAPI linkedListIntersection;

    private LinkedList createLinkedList( int[] numbers ) {

        LinkedList list = new LinkedList();

        for ( int number : numbers ) {

            list.append( number );
        }

        return list;
    }


    public void getIntersectionTest() {

        int[] numbers1 = { 4, 5, 6, 7, 8, 9, 10 };
        LinkedList list1 = createLinkedList( numbers1 );
        int[] numbers2 = { 2, 3, 4, 5, 6, 7, 8 };
        LinkedList list2 = createLinkedList( numbers2 );
        LinkedList result = linkedListIntersection.getIntersection( list1, list2 );
        String resultStr = result.toString();
        Assert.assertEquals( resultStr, "4 -> 5 -> 6 -> 7 -> 8" );
    }
}
