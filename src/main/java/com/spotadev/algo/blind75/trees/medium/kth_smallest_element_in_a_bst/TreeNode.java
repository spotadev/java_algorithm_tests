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
package com.spotadev.algo.blind75.trees.medium.kth_smallest_element_in_a_bst;

/**
 * @author John Dickerson - 13 May 2022
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }


    TreeNode( int val ) {

        this.val = val;
    }


    TreeNode( int val, TreeNode left, TreeNode right ) {

        this.val = val;
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {

        return "TreeNode [val=" + val + "]";
    }
}
