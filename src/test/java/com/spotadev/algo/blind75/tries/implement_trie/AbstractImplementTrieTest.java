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

import org.testng.Assert;

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
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractImplementTrieTest {

    protected ImplementTrieAPI implementTrie;

    void testingTest() {

        implementTrie.insert( "apple" );
        Assert.assertTrue( implementTrie.search( "apple" ) );
        Assert.assertFalse( implementTrie.search( "app" ) );
        Assert.assertTrue( implementTrie.startsWith( "app" ) );
        implementTrie.insert( "app" );
        Assert.assertTrue( implementTrie.search( "app" ) );
    }
}
