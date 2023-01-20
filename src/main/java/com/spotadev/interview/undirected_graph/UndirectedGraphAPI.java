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
package com.spotadev.interview.undirected_graph;

/**
 * This question came from:
 * 
 *     An interview Miguel did
 *     
 *     Ask Miguel for further details
 *     
 * You are given an undirected graph consisting of N vertices, numbered from 1 to N, and M edges.  
 * The graph is described by two arrays, A and B, both of length M. A pair (A[K], B[K]) for K from
 * 0 to M-1, describes an edge between vertex A[K] and vertex B[K].
 * 
 * Your task is to assign all values from the range [1..N] to the vertices of the graph, giving
 * one number to each of the vertices. Do it in such a a way that the sum over all edges of the 
 * values at the edges end points is maximal.
 * 
 * For example, given 
 * 
 *     N = 5, 
 *     A = [ 2, 2, 1, 2 ]
 *     B = [ 1, 3, 4, 4 ]
 *     
 * the graph has four edges:
 * 
 *     ( 2, 1 )
 *     ( 2, 3 )
 *     ( 1, 4 )
 *     ( 2, 4 )
 *     
 * In order to obtain the maximum sum of weights, you can assign the following values to the 
 * vertices:
 * 
 *     3, 5, 2, 4, 1
 *     
 * ( to vertices 1, 2, 3, 4, 5 respectively).
 * 
 *                                        [5]val=1
 *        [1]val=3___          
 *           |       8
 *           7       |___[2]val=5__7__[3]val=2
 *           |       |              
 *        [4]val=4__9
 * 
 * 
 * This way we obtain the sum of the values at all edge end points equal to:
 * 
 *     7 + 8 + 7 + 9 = 31
 *
 * @author John Dickerson - 26 Jun 2022
 */
public interface UndirectedGraphAPI {

    int sumOfAllEdges( int N, int[] A, int[] B );
}
