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
package com.spotadev.algo.blind75.tries.medium.design_add_and_search_words_data_structure;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class DesignAddAndSearchWordsDataStructureTest {

    private DesignAddAndSearchWordsDataStructure wordDictionary;

    @BeforeClass
    public void setUp() {

        wordDictionary = new DesignAddAndSearchWordsDataStructure();
    }


    @Test
    public void testingTest_1() {

        wordDictionary.addWord( "bad" );
        wordDictionary.addWord( "dad" );
        wordDictionary.addWord( "mad" );
        Assert.assertFalse( wordDictionary.search( "pad" ) );
        Assert.assertTrue( wordDictionary.search( "bad" ) );
        Assert.assertTrue( wordDictionary.search( ".ad" ) );
        Assert.assertTrue( wordDictionary.search( "b.." ) );
    }


    @Test
    public void testingTest_2() {

        DesignAddAndSearchWordsDataStructure wordDictionary = null;

        String[] commands =
                { "WordDictionary", "addWord", "addWord", "addWord", "addWord", "addWord",
                        "addWord",
                        "search" };

        String[] data =
                { "", "at", "and", "an", "add", "a", "bat", ".at" };

        Boolean[] expected =
                { null, null, null, null, null, null, null, true };

        for ( int i = 0; i < commands.length; i++ ) {

            System.out.println( commands[i] + " : " + data[i] );

            switch ( commands[i] ) {

                case "WordDictionary":
                    wordDictionary = new DesignAddAndSearchWordsDataStructure();
                    break;
                case "addWord":
                    wordDictionary.addWord( data[i] );
                    break;
                case "search":
                    boolean found = wordDictionary.search( data[i] );
                    Assert.assertTrue( found == expected[i] );
                    break;
            }
        }
    }


    @Test
    public void testingTest_3() {

        DesignAddAndSearchWordsDataStructure wordDictionary = null;

        String[] commands =
                { "WordDictionary", "addWord", "addWord", "addWord", "addWord", "search" };

        String[] data =
                { "", "at", "and", "an", "add", ".at" };

        Boolean[] expected =
                { null, null, null, null, null, false };

        for ( int i = 0; i < commands.length; i++ ) {

            System.out.println( commands[i] + " : " + data[i] );

            switch ( commands[i] ) {

                case "WordDictionary":
                    wordDictionary = new DesignAddAndSearchWordsDataStructure();
                    break;
                case "addWord":
                    wordDictionary.addWord( data[i] );
                    break;
                case "search":
                    boolean found = wordDictionary.search( data[i] );
                    Assert.assertTrue( found == expected[i] );
                    break;
            }
        }
    }


    @Test
    public void testingTest_4() {

        DesignAddAndSearchWordsDataStructure wordDictionary = null;

        String[] commands =
                { "WordDictionary", "addWord", "addWord", "addWord", "addWord", "search",
                        "search", "addWord", "search", "search", "search", "search", "search",
                        "search" };

        String[] data =
                { "", "at", "and", "an", "add", "a", ".at", "bat", ".at", "an.", "a.d.", "b.",
                        "a.d", "." };

        Boolean[] expected =
                { null, null, null, null, null, false, false, null, true, true, false, false, true,
                        false };

        for ( int i = 0; i < commands.length; i++ ) {

            System.out.println( commands[i] + " : " + data[i] );

            switch ( commands[i] ) {

                case "WordDictionary":
                    wordDictionary = new DesignAddAndSearchWordsDataStructure();
                    break;
                case "addWord":
                    wordDictionary.addWord( data[i] );
                    break;
                case "search":
                    boolean found = wordDictionary.search( data[i] );
                    Assert.assertTrue( found == expected[i] );
                    break;
            }
        }
    }
}
