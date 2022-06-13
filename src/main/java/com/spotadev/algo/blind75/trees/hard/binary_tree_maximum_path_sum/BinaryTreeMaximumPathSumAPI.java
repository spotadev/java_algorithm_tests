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
package com.spotadev.algo.blind75.trees.hard.binary_tree_maximum_path_sum;

/**
* @author John Dickerson - 13 Jun 2022
*/
public interface BinaryTreeMaximumPathSumAPI {

    /**
     *            -10
     *       9           20
     *               15       7 
     *               
     *   Consider that when we start with -10 the max is max of left and max of right:
     *   
     *        9 => -10 => 20 => 15
     *        
     *   The method returns the max of it can achieve from by going left or right
     *   
     *   However the max count is updated internally
     *   
     *   We are using an array for a single value to path by reference. We could have used 
     *   AtomicInteger but that would have involved getters and setters.
     */
    int maxPathSum( TreeNode node, int[] max );


    int maxPathSum( TreeNode root );

}