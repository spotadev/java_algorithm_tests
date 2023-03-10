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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=oobqoCJlHA0
 * 
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 *     
 *     Runtime: 67 ms, faster than 37.24% of Java online submissions for Implement Trie 
 *     (Prefix Tree).
 *     
 *     Memory Usage: 68.9 MB, less than 33.73% of Java online submissions for Implement 
 *     Trie (Prefix Tree).
 * 
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store 
 * and retrieve keys in a dataset of strings. There are various applications of this data structure, 
 * such as autocomplete and spellchecker.
 * 
 * Implement the Trie class:
 * 
 *     Trie() Initializes the trie object.
 *     
 *     void insert(String word) Inserts the string word into the trie.
 *     
 *     boolean search(String word) Returns true if the string word is in the trie (i.e., was 
 *     inserted before), and false otherwise.
 *     
 *     boolean startsWith(String prefix) Returns true if there is a previously inserted string word 
 *     that has the prefix prefix, and false otherwise.
 *  
 * Example 1:
 * 
 *     Input
 *         ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 *         [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 *     Output
 *         [null, null, true, false, true, null, true]
 * 
 * Explanation
 *     Trie trie = new Trie();
 *     trie.insert("apple");
 *     trie.search("apple");   // return True
 *     trie.search("app");     // return False
 *     trie.startsWith("app"); // return True
 *     trie.insert("app");
 *     trie.search("app");     // return True
 * 
 * Constraints:
 * 
 *     1 <= word.length, prefix.length <= 2000
 *     word and prefix consist only of lowercase English letters.
 *     At most 3 * 104 calls in total will be made to insert, search, and startsWith.
 * 
 * Instructions
 * 
 *     Your Trie object will be instantiated and called as such:
 *     Trie obj = new Trie();
 *     obj.insert(word);
 *     boolean param_2 = obj.search(word);
 *     boolean param_3 = obj.startsWith(prefix);
 * 
 * @author John Dickerson - 13 May 2022
 */
public class ImplementTrie_JD implements ImplementTrieAPI {

    class Node {

        Node[] children = new Node[26];
        boolean isLastLetter = false;
    }

    private Node rootNode;

    public ImplementTrie_JD() {

        rootNode = new Node();
    }


    @Override
    public void insert( String word ) {

        Node node = rootNode;
        int code;

        for ( char c : word.toCharArray() ) {

            code = c - 'a';

            if ( node.children[code] == null ) {

                node.children[code] = new Node();
            }

            node = node.children[code];
        }

        node.isLastLetter = true;
    }


    @Override
    public boolean search( String word ) {

        Node node = rootNode;
        int code;

        for ( char c : word.toCharArray() ) {

            code = c - 'a';

            if ( node.children[code] == null ) {

                return false;
            }

            node = node.children[code];
        }

        return node.isLastLetter;
    }


    @Override
    public boolean startsWith( String prefix ) {

        Node node = rootNode;
        int code;

        for ( char c : prefix.toCharArray() ) {

            code = c - 'a';

            if ( node.children[code] == null ) {

                return false;
            }

            node = node.children[code];
        }

        return true;
    }


    public static void main( String[] args ) {

        int code = 'a' - 97;

        System.out.println( code + "" );
    }
}
