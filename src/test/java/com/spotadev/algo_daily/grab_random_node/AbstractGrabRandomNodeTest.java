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

import org.testng.Assert;

import com.spotadev.algo_daily.grab_random_node.GrabRandomNodeAPI.LinkedListNode;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractGrabRandomNodeTest {

    protected GrabRandomNodeAPI grabRandomNode;

    public void fetchRandomNodeTest() {

        LinkedListNode headNode = new LinkedListNode( 1 );
        LinkedListNode node2 = new LinkedListNode( 2 );
        LinkedListNode node3 = new LinkedListNode( 3 );
        LinkedListNode node4 = new LinkedListNode( 4 );

        headNode.next = node2;
        node2.next = node3;
        node3.next = node4;

        int result = grabRandomNode.fetchRandomNode( headNode );
        Assert.assertTrue( result > 0 );
    }
}
