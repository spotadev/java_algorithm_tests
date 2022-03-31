/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
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
