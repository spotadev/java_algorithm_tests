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
 * https://algodaily.com/challenges/binary-tree-inorder-traversal
 * 
 * Write a function to traverse a binary-tree in-order, and print  out the value of each node
 * as it passes?
 *
 * Example 1
 * =========
 * 
 *      4
 *      \
 *      5
 *      /
 *      6
 *  
 *      output -> [ 4, 6, 5 ]
 *  
 * Example 2
 * =========
 *                4 
 *          2          6  
 *      1      3    5     7
 *      
 *      output -> [ 1, 2, 3, 4, 5, 6, 7 ]
 *
 *
 * Constraints
 * =========== 
 *  
 *     Number of vertices in the tree <= 100000
 * 
 *     The value of vertices in the tree will be between - 10000000 and 1000000000
 * 
 * Time complexity : O(n)
 * Space complexity: O(1)
 * 
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractBinaryTreeInorderTraversalTest {

    protected BinaryTreeInorderTraversalAPI binaryTreeInorderTraversal;

    void inorderTraversal_1_Test() {

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


    void inorderTraversal_2_Test() {

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
