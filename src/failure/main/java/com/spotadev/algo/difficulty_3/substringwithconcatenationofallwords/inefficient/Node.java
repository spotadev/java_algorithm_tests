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
package com.spotadev.algo.difficulty_3.substringwithconcatenationofallwords.inefficient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author John Dickerson - 7 Feb 2022
 */
public class Node {

    Node parent;
    String word;
    Set<Node> nodes = new HashSet<>();

    List<String> getUsedWords() {

        List<String> usedWords = new ArrayList<>();

        if ( parent != null ) {

            usedWords.addAll( parent.getUsedWords() );
        }

        usedWords.add( word );
        return usedWords;
    }


    String getCombination() {

        String combination;

        if ( parent != null ) {

            combination = parent.getCombination() + word;
        }
        else {

            combination = word;
        }

        return combination;
    }


    void add( Node node ) {

        nodes.add( node );
    }


    public Node( Node parent, String word ) {

        this.parent = parent;
        this.word = word;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        if ( parent != null ) {

            sb.append( parent.toString() );
            sb.append( " => " );
        }

        sb.append( word );
        return sb.toString();
    }
}
