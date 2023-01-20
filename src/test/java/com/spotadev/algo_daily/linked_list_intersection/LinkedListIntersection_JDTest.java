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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class LinkedListIntersection_JDTest extends AbstractLinkedListIntersectionTest {

    @BeforeClass
    public void setUp() {

        linkedListIntersection = new LinkedListIntersection_JD();
    }


    @Test
    public void getIntersectionTest() {

        super.getIntersectionTest();
    }
}
