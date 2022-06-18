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
package com.spotadev.algo.blind75.graphs.medium.graph_valid_tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *  https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=bXsUuownnoQ
 * 
 * https://www.lintcode.com/problem/178/
 *
 * Description
 * 
 * Given n nodes labelled from 0 to n - 1 and a list of undirected edges (each edge is a pair of 
 * nodes), write a function to check whether these edges make up a valid tree.
 * 
 * A valid tree has nodes that are connected and do not loop.
 * 
 * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, 
 * [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * 
 * Example 1:
 * 
 *         0
 *      1  2  3  
 *      4
 *     
 *     n = 5 
 *     { {0, 1}, {0, 2}, {0, 3}, {1, 4} }
 * 
 *     Output: true.
 * 
 * Example 2:
 * 
 *         0
 *       1
 *     2-3 4
 *     
 *     Note in above: 
 *     
 *         1 is connected to 2 
 *         1 is connected to 3
 *         2 is connected to 3   ==> that makes a loop
 * 
 *     { {0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4} }
 * 
 *     Output: false.
 * 
 * @author John Dickerson - 13 May 2022
 */
public class GraphValidTree_JD implements GraphValidTreeAPI {

    /**
     *      0
     *    1    2
     *   3 4  5 6
     *   
     *   Visits like 0 1 3 4 2 5 6
     */
    private void dfs( int x, Map<Integer, Set<Integer>> graph, Set<Integer> visited ) {

        visited.add( x );

        for ( Integer neighbor : graph.get( x ) ) {

            if ( visited.contains( neighbor ) )
                continue;

            dfs( neighbor, graph, visited );
        }
    }


    /**
     *      0
     *    1    2
     *   3 4  5 6
     *   
     *   Visits like 0 1 2 3 4 5 6
     */
    private void bfs( int x, Map<Integer, Set<Integer>> graph, Set<Integer> visited ) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer( x ); // adds on end of queue
        visited.add( x );

        while ( !queue.isEmpty() ) {

            int node = queue.poll(); // takes from beginning of queue

            for ( Integer neighbor : graph.get( node ) ) {

                if ( visited.contains( neighbor ) )
                    continue;

                queue.offer( neighbor );
                visited.add( neighbor );
            }
        }
    }


    private Map<Integer, Set<Integer>> initializeGraph( int n, int[][] edges ) {

        Map<Integer, Set<Integer>> graph = new HashMap<>();

        for ( int i = 0; i < n; i++ ) {

            graph.put( i, new HashSet<Integer>() );
        }

        for ( int[] edge : edges ) {

            Arrays.sort( edge );
            graph.get( edge[0] ).add( edge[1] );
        }

        return graph;
    }


    @Override
    public boolean validTree( int n, int[][] edges ) {

        if ( n == 0 )
            return false;

        if ( edges.length != n - 1 )
            return false;

        Map<Integer, Set<Integer>> graph = initializeGraph( n, edges );
        Set<Integer> visited = new HashSet<>();

        bfs( 0, graph, visited );
        // dfs( 0, graph, visited );

        return ( visited.size() == n );
    }
}
