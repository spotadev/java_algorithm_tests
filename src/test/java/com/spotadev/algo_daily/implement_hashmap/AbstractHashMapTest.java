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

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractHashMapTest {

    protected HashMapAPI<Integer, String> hashMap;

    void doTest() {

        hashMap.put( 1, "JD" );
        hashMap.put( 101, "RK" );
        String name1 = hashMap.get( 1 );
        String name101 = hashMap.get( 101 );

        Assert.assertEquals( name1, "JD" );
        Assert.assertEquals( name101, "RK" );
    }
}
