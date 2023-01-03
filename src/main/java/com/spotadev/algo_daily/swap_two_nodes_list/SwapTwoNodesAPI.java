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
package com.spotadev.algo_daily.swap_two_nodes_list;

/**
 * https://algodaily.com/challenges/swap-every-two-nodes-in-a-linked-list
 * 
 * Write a recursive algorithm that swaps every two nodes in a linked list. This is called a 
 * pairwise swap.
 *
 * Examples
 * ========
 * 
 *     input: 1 -> 2 -> 3 -> 4   => output: 2 -> 1 -> 4 -> 3
 * 
 *     input: 10 -> 20 -> 50 -> 40 => output: 20 -> 10 -> 40 -> 50
 * 
 *     input: 4 -> 5 -> 6 -> 7  => output: 5 -> 4 -> 7 -> 6
 *
 * The method will be invoked as follows:
 * 
 *     Node list = new Node(1);
 * 
 *     list.next = new Node(2);
 *     list.next.next = new Node(3);
 * 
 *     list.next.next.next = new Node(4)
 *
 *     invoking the method :
 * 
 *          swapEveryTwoList(list)
 *
 * Constraints
 * ===========
 * 
 *      Length of the linked list <= 100000
 * 
 *      Nodes will always contain integer values between -1000000000 and 1000000000
 * 
 *      The list can be empty
 * 
 *      Time Complexity: O(n)
 * 
 *      Space Complexity: O(n)
 *      
 * @author Karema99 - 29 Aug 2022
 */
public interface SwapTwoNodesAPI {

    class LinkedListNode {

        public LinkedListNode next;
        public int val;

        public LinkedListNode( int val ) {

            this.val = val;
        }


        public String toString() {

            String toReturn = val + "";

            if ( next != null ) {

                toReturn = toReturn + " => " + next.toString();
            }

            return toReturn;
        }
    }

    LinkedListNode swapEveryTwo( LinkedListNode head );
}
