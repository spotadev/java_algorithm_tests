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

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class KthSmallestElementInABSTTest {

    private KthSmallestElementInABST kthSmallestElementInABST;

    @BeforeClass
    public void setUp() {

        kthSmallestElementInABST = new KthSmallestElementInABST();
    }


    @Test
    public void kthSmallest() {

        TreeNode root = null;
        int smallest = kthSmallestElementInABST.kthSmallest( root, 0 );
        Assert.assertEquals( smallest, 0 );

    }
}
