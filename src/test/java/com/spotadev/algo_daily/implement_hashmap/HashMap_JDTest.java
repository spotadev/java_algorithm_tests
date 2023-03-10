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
package com.spotadev.algo_daily.implement_hashmap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://algodaily.com/challenges/implement-a-hash-map
 * 
 * Implement a hash map
 * 
 * Use an array-based implementation
 *
 * @author John Dickerson - 2 Jan 2023
 */
public class HashMap_JDTest extends AbstractHashMapTest {

    @BeforeClass
    public void setUp() {

        hashMap = new HashMapJD<>();
    }


    @Test
    public void doTest() {

        super.doTest();
    }
}
