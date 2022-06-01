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
package com.spotadev.algo.blind75.tries.implement_trie;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class ImplementTrieTest {

    private ImplementTrie implementTrie;

    @BeforeClass
    public void setUp() {

        implementTrie = new ImplementTrie();
    }


    @Test
    public void testingTest() {

        implementTrie.insert( "apple" );
        Assert.assertTrue( implementTrie.search( "apple" ) );
        Assert.assertFalse( implementTrie.search( "app" ) );
        Assert.assertTrue( implementTrie.startsWith( "app" ) );
        implementTrie.insert( "app" );
        Assert.assertTrue( implementTrie.search( "app" ) );
    }
}
