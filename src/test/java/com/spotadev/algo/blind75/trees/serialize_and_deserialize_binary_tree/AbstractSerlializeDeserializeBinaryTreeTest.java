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

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=u4JAi2JJhI8
 * 
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * 
 *      Runtime: 24 ms, faster than 45.03% of Java online submissions for Serialize and Deserialize 
 *      Binary Tree.
 *      
 *      Memory Usage: 52.7 MB, less than 43.21% of Java online submissions for Serialize and 
 *      Deserialize Binary Tree.
 * 
 * Serialization is the process of converting a data structure or object into a sequence of bits 
 * so that it can be stored in a file or memory buffer, or transmitted across a network 
 * connection link to be reconstructed later in the same or another computer environment.
 * 
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on 
 * how your serialization/deserialization algorithm should work. You just need to ensure that a 
 * binary tree can be serialized to a string and this string can be deserialized to the original 
 * tree structure.
 * 
 * Clarification: The input/output format is the same as how LeetCode serializes a binary tree. 
 * You do not necessarily need to follow this format, so please be creative and come up with 
 * different approaches yourself.
 *     
 * Example 1:
 * 
 *             1
 *         2       3
 *             4       5
 * 
 *     Input: root = [1,2,3,null,null,4,5]
 *     Output: [1,2,3,null,null,4,5]
 * 
 * Example 2:
 * 
 *     Input: root = []
 *     Output: []
 *  
 * 
 * Constraints:
 * 
 *     The number of nodes in the tree is in the range [0, 104].
 *     -1000 <= Node.val <= 1000
 *     
 * Instructions
 * 
 *     Your Codec object will be instantiated and called as such:
 *      
 *         Codec ser = new Codec();
 *         Codec deser = new Codec();
 *         TreeNode ans = deser.deserialize(ser.serialize(root));
 * 
 * @author John Dickerson - 13 May 2022
 */
public abstract class AbstractSerlializeDeserializeBinaryTreeTest {

    protected SerlializeDeserializeBinaryTreeAPI serlializeDeserializeBinaryTree;

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


    void serializeDeserializeTest() {

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
