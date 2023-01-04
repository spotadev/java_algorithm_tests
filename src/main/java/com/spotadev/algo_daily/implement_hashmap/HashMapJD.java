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
 *  @author John Dickerson - 2 Jan 2023
 */
public class HashMapJD<K, V> implements HashMapAPI<K, V> {

    private int ARRAY_SIZE = 100;
    private Node<K, V>[] nodes = new Node[ARRAY_SIZE];

    class Node<KK, VV> {

        Node<KK, VV> next;
        KK key;
        VV value;

        public Node( KK key, VV value ) {

            this.key = key;
            this.value = value;
        }
    }

    private V getValue( K key, Node<K, V> node ) {

        if ( node.key.equals( key ) ) {

            return node.value;
        }

        while ( ( node = node.next ) != null ) {

            if ( key.equals( node.key ) ) {

                return node.value;
            }
        }

        return null;
    }


    @Override
    public V get( K key ) {

        int index = key.hashCode() % ARRAY_SIZE;
        Node<K, V> node = nodes[index];

        if ( node != null ) {

            return getValue( key, node );
        }

        return null;
    }


    @Override
    public void put( K key, V value ) {

        int index = key.hashCode() % ARRAY_SIZE;
        Node<K, V> existingNode = nodes[index];
        Node<K, V> newNode = new Node<K, V>( key, value );

        if ( existingNode == null ) {

            nodes[index] = newNode;
        }
        else {

            existingNode.next = newNode;
        }
    }
}
