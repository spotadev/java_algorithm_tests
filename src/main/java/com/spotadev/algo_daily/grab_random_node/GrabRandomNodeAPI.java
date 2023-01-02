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
package com.spotadev.algo_daily.grab_random_node;

/**
 * https://algodaily.com/challenges/grab-a-random-node
 * 
 * Given a linked list, write a method to get a random node within it? Assuming you are given a 
 * random node generator.
 * 
 * The linked list can have at least 2 nodes,  and may look something like this:
 * 
 *     1 -> 2 -> 3 -> 4
 *  
 * The odds of getting any number between 1 and 4 inclusive should be exactly the same
 *
 * Constraints
 * ===========
 *     Length of the linked list <= 10000
 *     
 *     Nodes will always contain integer values between -1000000000 and 1000000000
 *     
 *     Time Complexity: O(n)
 *     
 *     Space Complexity: O(n)
 *
 * @author Karema99 - 29 Aug 2022
 */
public interface GrabRandomNodeAPI {

    class LinkedListNode {

        public LinkedListNode next;
        public int val;

        public LinkedListNode( int val ) {

            this.val = val;
        }
    }

    int fetchRandomNode( LinkedListNode headNode );
}
