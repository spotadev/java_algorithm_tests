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
package com.spotadev.algo.blind75.tries.word_hard.search_ii;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.tries.hard.word_search_ii.FastestLeetCodeWordSearchII;

/**
 * @author John Dickerson - 13 May 2022
 */
@Test
public class FastestLeetCodeWordSearchIITest extends AbstractWordSearchIITest {

    @BeforeClass
    public void setUp() {

        wordSearchII = new FastestLeetCodeWordSearchII();
    }


    @Test
    public void findWordsTest_1() {

        super.findWordsTest_1();
    }


    @Test
    public void findWordsTest_2() {

        super.findWordsTest_2();
    }


    @Test
    public void findWordsTest_3() {

        super.findWordsTest_3();
    }


    @Test
    public void findWordsTest_4() {

        super.findWordsTest_4();
    }
}
