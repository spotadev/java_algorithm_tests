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

/**
* @author John Dickerson - 13 Jun 2022
*/
public interface ImplementTrieAPI {

    void insert( String word );


    boolean search( String word );


    boolean startsWith( String prefix );

}