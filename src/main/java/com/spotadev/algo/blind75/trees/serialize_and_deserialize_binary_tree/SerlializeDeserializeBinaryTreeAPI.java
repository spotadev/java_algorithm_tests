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
* @author John Dickerson - 13 Jun 2022
*/
public interface SerlializeDeserializeBinaryTreeAPI {

    //             1
    //         2       3
    //             4       5
    //
    // 1,2,3,4,5
    String serialize( TreeNode node );


    // Decodes your encoded data to tree.
    TreeNode deserialize( String data );

}