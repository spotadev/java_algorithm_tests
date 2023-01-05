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
 * @author Karema99 - 29 Aug 2022
 */
public interface LinkedListIntersectionAPI {

    class LinkedListNode {

        public LinkedListNode next;
        public int val;

        public LinkedListNode( int val ) {

            this.val = val;
        }


        public String toString() {

            String toReturn = val + "";

            if ( next != null ) {

                toReturn = toReturn + " -> ";
                toReturn = toReturn + next.toString();
            }

            return toReturn;
        }
    }

    class LinkedList {

        LinkedListNode head;
        LinkedListNode tail;

        public LinkedList() {

            this.head = null;
            this.tail = null;
        }


        public void prepend( int newVal ) {

            final LinkedListNode currentHead = this.head;
            final LinkedListNode newNode = new LinkedListNode( newVal );
            newNode.next = currentHead;
            this.head = newNode;

            if ( this.tail == null ) {
                this.tail = newNode;
            }
        }


        public void append( int newVal ) {

            final LinkedListNode newNode = new LinkedListNode( newVal );

            if ( this.head == null ) {

                this.head = newNode;
                this.tail = newNode;
            }
            else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }


        public String toString() {

            return head.toString();
        }
    }

    LinkedList getIntersection( LinkedList list1, LinkedList list2 );
}
