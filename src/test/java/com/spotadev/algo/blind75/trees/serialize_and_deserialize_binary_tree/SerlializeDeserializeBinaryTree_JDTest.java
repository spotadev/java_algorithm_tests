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
public class SerlializeDeserializeBinaryTree_JDTest extends
        AbstractSerlializeDeserializeBinaryTreeTest {

    protected SerlializeDeserializeBinaryTreeAPI serlializeDeserializeBinaryTree;

    @BeforeClass
    public void setUp() {

        serlializeDeserializeBinaryTree = new SerlializeDeserializeBinaryTree_JD();
    }


    @Test
    public void serializeDeserializeTest() {

        super.serializeDeserializeTest();
    }
}
