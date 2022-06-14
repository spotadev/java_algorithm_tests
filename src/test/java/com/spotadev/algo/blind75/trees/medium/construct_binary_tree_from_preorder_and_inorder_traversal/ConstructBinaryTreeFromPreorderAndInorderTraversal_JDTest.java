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
package com.spotadev.algo.blind75.trees.medium.construct_binary_tree_from_preorder_and_inorder_traversal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_JDTest extends
        AbstractConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @BeforeClass
    public void setUp() {

        constructBinaryTreeFromPreorderAndInorderTraversal =
                new ConstructBinaryTreeFromPreorderAndInorderTraversal_JD();
    }


    /**
     *             3
     *          9     20
     *              15    7  
     */
    @Test
    public void buildTreeTest() {

        super.buildTreeTest();
    }
}
