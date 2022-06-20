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
package com.spotadev.algo.blind75.graphs.hard.alien_dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * =================================================================================================
 * =================================================================================================
 * 
 * NOTE this solution does not pass all test cases.  It is based on the solution from neetcode.io
 * which is a locked premium question and does not have exactly the same question a  tion:
 * 
 *     There may be multiple valid order of letters, return the smallest in normal lexicographical 
 *     order.
 * 
 * =================================================================================================
 * =================================================================================================
 * 
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=6kTZYvNNyps
 * 
 * https://www.lintcode.com/problem/892/
 * 
 * Description
 * 
 * There is a new alien language which uses the latin alphabet. However, the order among letters 
 * are unknown to you. 
 * 
 * You receive a list of non-empty words from the dictionary, where words are sorted 
 * lexicographically by the rules of this new language. Derive the order of letters in this 
 * language.
 * 
 *      * You may assume all letters are in lowercase.
 * 
 *      * The dictionary is invalid, if string a is prefix of string b and b is appear before a.
 * 
 *      * If the order is invalid, return an empty string.
 * 
 *      * There may be multiple valid order of letters, return the smallest in normal 
 *        lexicographical order.
 * 
 *      * The letters in one string are of the same rank by default and are sorted in Human 
 *        dictionary order.
 * 
 * Example 1:
 * 
 *     Input：{"wrt","wrf","er","ett","rftt" }
 *     Output："wertf"
 * 
 *     Explanation：
 *         from "wrt"and"wrf" ,we can get 't'<'f'
 *         from "wrt"and"er" ,we can get 'w'<'e'
 *         from "er"and"ett" ,we can get 'r'<'t'
 *         from "ett"and"rftt" ,we can get 'e'<'r'
 *         So return "wertf"
 * 
 * Example 2:
 * 
 *      Input：{"z","x"}
 *      Output："zx"
 * 
 *      Explanation：
 *          from "z" and "x"，we can get 'z' < 'x'
 *          So return "zx"
 *          
 *          
 * @author John Dickerson - 13 May 2022
 */
public class AlienDictionary_JD implements AlienDictionaryAPI {

    private Map<Character, List<Character>> graph = new HashMap<>();
    private Map<Character, Integer> inDegree = new HashMap<>();

    private void initializeGraph( String[] words ) {

        for ( String word : words ) {

            for ( char c : word.toCharArray() ) {

                if ( graph.get( c ) == null ) {
                    graph.put( c, new ArrayList<>() );
                    inDegree.put( c, 0 );
                }
            }
        }
    }


    private void populateGraph( String[] words ) throws Exception {

        for ( int i = 0; i < words.length - 1; i++ ) {

            String word1 = words[i];
            String word2 = words[i + 1];

            // Check that word2 is not a prefix of word1.  Return "" for invalid
            if ( word1.length() > word2.length() && word1.startsWith( word2 ) ) {

                throw new Exception( "Invalid Graph" );
            }

            for ( int j = 0; j < Math.min( word1.length(), word2.length() ); j++ ) {

                char parent = word1.charAt( j );
                char child = word2.charAt( j );

                if ( parent != child ) {

                    graph.get( parent ).add( child );
                    inDegree.put( child, inDegree.get( child ) + 1 );
                    break;
                }
            }
        }
    }


    private Queue<Character> getSources( Map<Character, Integer> inDegree ) {

        Queue<Character> sources = new LinkedList<>();

        for ( Map.Entry<Character, Integer> entry : inDegree.entrySet() ) {

            if ( entry.getValue() == 0 ) {

                sources.add( entry.getKey() );
            }
        }

        return sources;
    }


    public String alienOrder( String[] words ) {

        try {
            initializeGraph( words );
            populateGraph( words );
            Queue<Character> sources = getSources( inDegree );
            StringBuilder sb = new StringBuilder();

            // this is bfs
            while ( !sources.isEmpty() ) {

                Character vertex = sources.remove();
                sb.append( vertex );

                for ( char c : graph.get( vertex ) ) {

                    inDegree.put( c, inDegree.get( c ) - 1 );

                    if ( inDegree.get( c ) == 0 ) {

                        sources.add( c );
                    }
                }
            }

            // Check if there is a cyclic dependency
            if ( sb.length() != inDegree.size() ) {
                return "";
            }
            return sb.toString();
        }
        catch ( Exception e ) {
            return "";
        }
    }
}
