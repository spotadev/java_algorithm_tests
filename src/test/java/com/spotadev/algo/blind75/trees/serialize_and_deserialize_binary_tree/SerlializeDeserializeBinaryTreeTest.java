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
package com.spotadev.algo.blind75.trees.serialize_and_deserialize_binary_tree;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class SerlializeDeserializeBinaryTreeTest {

    private SerlializeDeserializeBinaryTree serlializeDeserializeBinaryTree;

    @BeforeClass
    public void setUp() {

        serlializeDeserializeBinaryTree = new SerlializeDeserializeBinaryTree();
    }


    private boolean compareTrees( TreeNode node, TreeNode deserialized ) {

        if ( node == null && deserialized == null ) {

            return true;
        }
        else if ( node != null && deserialized != null ) {

            if ( node.val == node.val ) {

                return compareTrees( node.left, deserialized.left ) &&
                        compareTrees( node.right, deserialized.right );
            }
        }

        return false;
    }


    @Test
    public void serializeDeserializeTest() {

        TreeNode root = new TreeNode( 1 );
        TreeNode node_2 = new TreeNode( 2 );
        TreeNode node_3 = new TreeNode( 3 );
        TreeNode node_4 = new TreeNode( 4 );
        TreeNode node_5 = new TreeNode( 5 );
        root.left = node_2;
        root.right = node_3;
        node_3.left = node_4;
        node_3.right = node_5;

        String data = serlializeDeserializeBinaryTree.serialize( root );
        System.out.println( data );
        TreeNode deserialized = serlializeDeserializeBinaryTree.deserialize( data );
        compareTrees( root, deserialized );
    }
}
