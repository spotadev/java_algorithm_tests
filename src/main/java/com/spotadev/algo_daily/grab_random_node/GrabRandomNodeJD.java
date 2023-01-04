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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
 * @author John Dickerson - 2 Jan 2023
 */
public class GrabRandomNodeJD implements GrabRandomNodeAPI {

    private Random random = new Random();

    @Override
    public int fetchRandomNode( LinkedListNode headNode ) {

        List<LinkedListNode> nodes = new ArrayList<>();
        nodes.add( headNode );

        headNode = headNode.next;

        while ( ( headNode = headNode.next ) != null ) {

            nodes.add( headNode );
        }

        int index = random.nextInt( nodes.size() );
        return nodes.get( index ).val;
    }
}
