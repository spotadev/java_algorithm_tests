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

/**
 * https://algodaily.com/challenges/implement-a-hash-map
 * 
 * Implement a hash map
 * 
 * Use an array-based implementation
 *
 * @author Karema99 - 29 Aug 2022
 */
public interface HashMapAPI<K, V> {

    V get( K key );


    void put( K key, V value );
}
