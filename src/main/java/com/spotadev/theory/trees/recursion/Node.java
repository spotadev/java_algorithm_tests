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
package com.spotadev.theory.trees.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Dickerson - 23 Jun 2022
 */
public class Node {

    int name;
    List<Node> children = new ArrayList<>();

    public Node( int name ) {

        this.name = name;
    }


    @Override
    public String toString() {

        return "Node [name=" + name + "]";
    }
}
