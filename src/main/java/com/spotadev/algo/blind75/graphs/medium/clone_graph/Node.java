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
package com.spotadev.algo.blind75.graphs.medium.clone_graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Dickerson - 13 May 2022
 */
public class Node {

    public int val;
    public List<Node> neighbors;

    public Node() {

        val = 0;
        neighbors = new ArrayList<Node>();
    }


    public Node( int _val ) {

        val = _val;
        neighbors = new ArrayList<Node>();
    }


    public Node( int _val, ArrayList<Node> _neighbors ) {

        val = _val;
        neighbors = _neighbors;
    }


    @Override
    public String toString() {

        return "Node [val=" + val + "]";
    }
}
