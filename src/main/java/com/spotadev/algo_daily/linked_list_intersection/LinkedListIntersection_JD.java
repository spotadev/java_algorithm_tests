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
 * @author John Dickerson - 5 Jan 2023
 */
public class LinkedListIntersection_JD implements LinkedListIntersectionAPI {

    /**
     * This is faster than O(n*m)
     * 
     * It is O(min(n,m))
     * 
     * i.e. it is proportional to the number of elements in the shortest list
     */
    @Override
    public LinkedList getIntersection( LinkedList list1, LinkedList list2 ) {

        LinkedListNode currentNode1 = list1.head;
        LinkedListNode currentNode2 = list2.head;
        LinkedList linkedListToReturn = new LinkedList();

        while ( true ) {

            if ( currentNode1.val > currentNode2.val ) {

                currentNode2 = currentNode2.next;
            }
            else if ( currentNode2.val > currentNode1.val ) {

                currentNode1 = currentNode1.next;
            }
            else if ( currentNode1.val == currentNode2.val ) {

                linkedListToReturn.append( currentNode1.val );

                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            }

            if ( currentNode1 == null || currentNode2 == null ) {

                break;
            }
        }

        return linkedListToReturn;
    }
}
