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
package com.spotadev.algo.blind75.graphs.hard.alien_dictionary;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractAlienDictionaryTest {

    protected AlienDictionaryAPI alienDictionary;

    void alienOrderTest_1() {

        String[] words = new String[] { "wrt", "wrf", "er", "ett", "rftt" };
        String result = alienDictionary.alienOrder( words );
        Assert.assertEquals( result, "wertf" );
    }


    void alienOrderTest_2() {

        String[] words = new String[] { "z", "x" };
        String result = alienDictionary.alienOrder( words );
        Assert.assertEquals( result, "zx" );
    }


    /**
     * Tree:
     * 
     *     y   z
     *     x   
     */
    void alienOrderTest_3() {

        String[] words = new String[] { "zy", "zx" };
        String result = alienDictionary.alienOrder( words );
        Assert.assertEquals( result, "yxz" );
    }


    void alienOrderTest_4() {

        String[] words = new String[] { "ab", "adc" };
        String result = alienDictionary.alienOrder( words );
        Assert.assertEquals( result, "abcd" );
    }
}
