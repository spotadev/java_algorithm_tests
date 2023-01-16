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

import org.testng.Assert;

import com.spotadev.algo_daily.swap_two_nodes_list.SwapTwoNodesAPI.LinkedListNode;

/**
 * @author John Dickerson - 3 Jan 2023
 */
public class AbstractSwapTwoNodesTest {

    protected SwapTwoNodesAPI swapTwoNodes;

    public void createLinkedListNode( LinkedListNode head, int[] nodes ) {

        for ( int i = 0; i < nodes.length; i++ ) {

            LinkedListNode newNode = new LinkedListNode( nodes[i] );
            head.next = newNode;
            head = newNode;
        }
    }


    /**
     *     input: 1 -> 2 -> 3 -> 4   => output: 2 -> 1 -> 4 -> 3
     **/
    public void swapEveryTwo_1Test() {

        LinkedListNode head = new LinkedListNode( 1 );
        createLinkedListNode( head, new int[] { 2, 3, 4 } );
        LinkedListNode swapped = swapTwoNodes.swapEveryTwo( head );
        Assert.assertEquals( swapped.toString(), "2 -> 1 -> 4 -> 3" );
    }


    /** 
     *     input: 10 -> 20 -> 50 -> 40 => output: 20 -> 10 -> 40 -> 50
     **/
    public void swapEveryTwo_2Test() {

        LinkedListNode head = new LinkedListNode( 10 );
        createLinkedListNode( head, new int[] { 20, 50, 40 } );
        LinkedListNode swapped = swapTwoNodes.swapEveryTwo( head );
        Assert.assertEquals( swapped.toString(), "20 -> 10 -> 40 -> 50" );
    }


    /**
     *     input: 4 -> 5 -> 6 -> 7  => output: 5 -> 4 -> 7 -> 6
     **/
    public void swapEveryTwo_3Test() {

        LinkedListNode head = new LinkedListNode( 4 );
        createLinkedListNode( head, new int[] { 5, 6, 7 } );
        LinkedListNode swapped = swapTwoNodes.swapEveryTwo( head );
        Assert.assertEquals( swapped.toString(), "5 -> 4 -> 7 -> 6" );
    }
}
