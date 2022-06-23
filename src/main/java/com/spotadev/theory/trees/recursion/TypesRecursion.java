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
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author John Dickerson - 23 Jun 2022
 */
public class TypesRecursion {

    private void buildUsingDfs( Node parentNode, int nodeName, Map<Integer, List<
            Integer>> dependencies ) {

        Node node = new Node( nodeName );
        parentNode.children.add( node );

        List<Integer> children = dependencies.get( nodeName );

        if ( children != null ) {

            for ( Integer child : children ) {

                buildUsingDfs( node, child, dependencies );
            }
        }
    }


    private Node buildTree( int[][] mappings ) {

        Map<Integer, List<Integer>> dependencies = new HashMap<>();

        for ( int[] mapping : mappings ) {

            List<Integer> list = dependencies.get( mapping[0] );

            if ( list == null ) {

                list = new ArrayList<>();
                dependencies.put( mapping[0], list );
            }

            list.add( mapping[1] );
        }

        Node dummyNode = new Node( -1 );
        buildUsingDfs( dummyNode, 0, dependencies );
        return dummyNode.children.get( 0 );
    }


    private void logUsing_DFS_Recursion( Node node ) {

        System.out.print( node.name + ", " );

        for ( Node child : node.children ) {

            logUsing_DFS_Recursion( child );
        }
    }


    /**
     *                   0                
     *             1            2  
     *          3     4      5      6 
     *         7 8   9 10  11 12  13 14
     *          
     *          Stack 
     *            0
     *            1, 2
     *            3, 4, 2
     *            7, 8, 4, 2
     *            8, 4, 2
     *            9, 10, 4, 2
     *            10, 4, 2
     *            4, 2
     *            9, 10, 2
     *            10, 2
     *            2
     *            5, 6
     *            11, 12, 6
     *            12, 6
     *            6
     *            13, 14
     *            14
     *            13
     *            
     *            Algo:
     *            
     *            (i) Consume left
     *            (ii) If has children
     *            (iii) Rotate children
     *            (iv) Push children to left
     *            (v) Repeat
     */

    private void logUsing_DFS_Deque( Node node ) {

        Deque<Node> queue = new LinkedList<>();
        queue.addFirst( node );

        while ( !queue.isEmpty() ) {

            Node polledNode = queue.removeFirst();
            System.out.print( polledNode.name + ", " );
            List<Node> children = polledNode.children;

            for ( int i = children.size() - 1; i >= 0; i-- ) {

                queue.addFirst( children.get( i ) );
            }
        }
    }


    private void logUsingBFS_Queue( Node node ) {

        Queue<Node> queue = new LinkedList<>();
        queue.add( node );

        while ( !queue.isEmpty() ) {

            Node polledNode = queue.poll();
            System.out.print( polledNode.name + ", " );

            for ( Node childNode : polledNode.children ) {

                queue.offer( childNode );
            }
        }
    }


    /**
     *  We have labelled the nodes in a Breath First Depth fashion.  This naming was determined by 
     *  the mappings.
     * 
     *                0                
     *            1       2  
     *          3   4   5   6  
     */
    public static void main( String[] args ) {

        TypesRecursion typesRecursion = new TypesRecursion();
        int[][] mappings = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 1, 4 }, { 2, 5 }, { 2, 6 } };
        Node rootNode = typesRecursion.buildTree( mappings );

        System.out.println( "Printing using DFS\n" );
        typesRecursion.logUsing_DFS_Recursion( rootNode );

        System.out.println( "\n\nPrinting using DFS Deque\n" );
        typesRecursion.logUsing_DFS_Deque( rootNode );

        System.out.println( "\n\nPrinting using BFS Queue\n" );
        typesRecursion.logUsingBFS_Queue( rootNode );
    }
}
