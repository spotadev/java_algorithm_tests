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
package com.spotadev.algo.blind75.trees.easy.same_tree;

import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractSameTreeTest {

    protected SameTreeAPI sameTree;

    void isSameTreeTest_1() {

        TreeNode p = new TreeNode( 1 );
        p.left = new TreeNode( 2 );
        p.right = new TreeNode( 3 );

        TreeNode q = new TreeNode( 1 );
        q.left = new TreeNode( 2 );
        q.right = new TreeNode( 3 );

        boolean isSameTree = sameTree.isSameTree( p, q );
        Assert.assertTrue( isSameTree );
    }


    void isSameTreeTest_2() {

        TreeNode p = new TreeNode( 1 );
        p.left = new TreeNode( 2 );

        TreeNode q = new TreeNode( 1 );
        q.right = new TreeNode( 2 );

        boolean isSameTree = sameTree.isSameTree( p, q );
        Assert.assertFalse( isSameTree );
    }


    void isSameTreeTest_3() {

        TreeNode p = new TreeNode( 1 );
        p.left = new TreeNode( 2 );
        p.right = new TreeNode( 1 );

        TreeNode q = new TreeNode( 1 );
        q.left = new TreeNode( 1 );
        q.right = new TreeNode( 2 );

        boolean isSameTree = sameTree.isSameTree( p, q );
        Assert.assertFalse( isSameTree );
    }
}
