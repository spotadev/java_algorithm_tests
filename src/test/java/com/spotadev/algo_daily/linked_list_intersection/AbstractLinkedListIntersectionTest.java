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
 * https://algodaily.com/challenges/find-the-intersection-of-two-linked-lists
 *
 * Given 2 linked list, return the intersection of the 2 linked list as a linked list.
 * 
 *  4 => 5 => 6 => 7 => 8 => 10
 *  3 => 7 => 8 => 9
 *  
 *  The intersection is:
 *  
 *      7 => 8
 *      
 * Constraints
 * 
 *     Length of the two linked lists <= 1000
 *     
 *     The nodes in the list will always contain integer values between -1000000000 and 1000000000
 *     
 *     Expected time complexity : O(n*m) (the lengths of the two lists)
 * 
 *     Expected space complexity : O(n)
 *      
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


    void getIntersectionTest() {

        int[] numbers1 = { 4, 5, 6, 7, 8, 9, 10 };
        LinkedList list1 = createLinkedList( numbers1 );
        int[] numbers2 = { 2, 3, 4, 5, 6, 7, 8 };
        LinkedList list2 = createLinkedList( numbers2 );
        LinkedList result = linkedListIntersection.getIntersection( list1, list2 );
        String resultStr = result.toString();
        Assert.assertEquals( resultStr, "4 -> 5 -> 6 -> 7 -> 8" );
    }
}
