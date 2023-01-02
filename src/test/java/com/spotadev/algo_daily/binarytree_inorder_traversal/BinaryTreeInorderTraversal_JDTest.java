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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class BinaryTreeInorderTraversal_JDTest extends AbstractBinaryTreeInorderTraversalTest {

    @BeforeClass
    public void setUp() {

        binaryTreeInorderTraversal = new BinaryTreeInorderTraversalJD();
    }


    @Test
    public void inorderTraversal_1_Test() {

        super.inorderTraversal_1_Test();
    }


    @Test
    public void inorderTraversal_2_Test() {

        super.inorderTraversal_2_Test();
    }
}
