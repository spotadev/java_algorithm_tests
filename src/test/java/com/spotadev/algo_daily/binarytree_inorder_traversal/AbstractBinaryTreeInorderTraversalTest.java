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
package com.spotadev.algo_daily.binarytree_inorder_traversal;

import java.util.List;

import org.testng.Assert;

import com.spotadev.algo_daily.binarytree_inorder_traversal.BinaryTreeInorderTraversalAPI.Node;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractBinaryTreeInorderTraversalTest {

    protected BinaryTreeInorderTraversalAPI binaryTreeInorderTraversal;

    public void inorderTraversal_1_Test() {

        Node node4 = new Node( 4 );
        Node node5 = new Node( 5 );
        Node node6 = new Node( 6 );

        node4.right = node5;
        node5.left = node6;

        List<Integer> output = binaryTreeInorderTraversal.inorderTraversal( node4 );

        Assert.assertEquals( output.get( 0 ).intValue(), 4 );
        Assert.assertEquals( output.get( 1 ).intValue(), 6 );
        Assert.assertEquals( output.get( 2 ).intValue(), 5 );
    }


    public void inorderTraversal_2_Test() {

        Node node1 = new Node( 1 );
        Node node2 = new Node( 2 );
        Node node3 = new Node( 3 );
        Node node4 = new Node( 4 );
        Node node5 = new Node( 5 );
        Node node6 = new Node( 6 );
        Node node7 = new Node( 7 );

        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;

        List<Integer> output = binaryTreeInorderTraversal.inorderTraversal( node4 );

        Assert.assertEquals( output.get( 0 ).intValue(), 1 );
        Assert.assertEquals( output.get( 1 ).intValue(), 2 );
        Assert.assertEquals( output.get( 2 ).intValue(), 3 );
        Assert.assertEquals( output.get( 3 ).intValue(), 4 );
        Assert.assertEquals( output.get( 4 ).intValue(), 5 );
        Assert.assertEquals( output.get( 5 ).intValue(), 6 );
        Assert.assertEquals( output.get( 6 ).intValue(), 7 );
    }
}
