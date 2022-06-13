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
package com.spotadev.algo.blind75.arraysandhashing.medium.group_anagram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class GroupAnagram_JDTest extends AbstractGroupAnagramTest {

    @BeforeClass
    public void setUp() {

        groupAnagram = new GroupAnagram_JD();
    }


    @Test
    public void groupAnagramsTest_1() {

        super.groupAnagramsTest_1();
    }


    @Test
    public void groupAnagramsTest_2() {

        super.groupAnagramsTest_2();
    }


    @Test
    public void groupAnagramsTest_3() {

        super.groupAnagramsTest_3();
    }
}
