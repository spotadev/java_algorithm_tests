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
package com.spotadev.algo.blind75.tries.medium.design_add_and_search_words_data_structure;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=BTf05gs_8iU
 * 
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * 
 *     Runtime: 830 ms, faster than 69.33% of Java online submissions for Design Add and Search 
 *     Words Data Structure.
 * 
 *     Memory Usage: 79.8 MB, less than 98.80% of Java online submissions for Design Add and Search 
 *     Words Data Structure.
 * 
 * Design a data structure that supports adding new words and finding if a string matches any 
 * previously added string.
 * 
 * Implement the WordDictionary class:
 * 
 *     WordDictionary() Initializes the object.
 * 
 *     void addWord(word) Adds word to the data structure, it can be matched later.
 * 
 *     bool search(word) Returns true if there is any string in the data structure that matches 
 *     word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 *  
 * Example:
 * 
 *     Input
 *         ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 *         [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * 
 *     Output
 *         [null,null,null,null,false,true,true,true]
 * 
 * Explanation
 * 
 *     WordDictionary wordDictionary = new WordDictionary();
 *     wordDictionary.addWord("bad");
 *     wordDictionary.addWord("dad");
 *     wordDictionary.addWord("mad");
 *     wordDictionary.search("pad"); // return False
 *     wordDictionary.search("bad"); // return True
 *     wordDictionary.search(".ad"); // return True
 *     wordDictionary.search("b.."); // return True
 * 
 * Constraints:
 * 
 *     1 <= word.length <= 25
 *     word in addWord consists of lowercase English letters.
 *     word in search consist of '.' or lowercase English letters.
 *     There will be at most 3 dots in word for search queries.
 *     At most 104 calls will be made to addWord and search.
 * 
 * Instructions
 * 
 *      Your WordDictionary object will be instantiated and called as such:
 * 
 *          WordDictionary obj = new WordDictionary();
 *          obj.addWord(word);
 *          boolean param_2 = obj.search(word);

 * 
 * @author John Dickerson - 13 May 2022
 */
public class DesignAddAndSearchWordsDataStructure_JD implements DesignAddAndSearchWordsDataStructureAPI {

    class Node {

        Node[] children = new Node[26];
        boolean isLastCharacter = false;
        char letter;

        @Override
        public String toString() {

            return "Node [isLastCharacter=" + isLastCharacter + ", letter=" + letter + "]";
        }


        Node() {

        }


        Node( char letter ) {

            this.letter = letter;
        }
    }

    private Node rootNode;

    public DesignAddAndSearchWordsDataStructure_JD() {

        rootNode = new Node();
    }


    @Override
    public void addWord( String word ) {

        Node node = rootNode;
        int code;

        for ( char c : word.toCharArray() ) {

            code = c - 'a';

            if ( node.children[code] == null ) {

                node.children[code] = new Node( c );
            }

            node = node.children[code];
        }

        node.isLastCharacter = true;
    }


    private boolean search( String word, Node node ) {

        int code;

        for ( int i = 0; i < word.length(); i++ ) {

            char c = word.charAt( i );

            if ( c == '.' ) {

                for ( Node childNode : node.children ) {

                    if ( childNode != null ) {

                        String wordFragment = word.substring( i + 1 );
                        boolean found = search( wordFragment, childNode );

                        if ( found ) {

                            return true;
                        }
                    }
                }

                return false;
            }
            else {
                code = c - 'a';

                if ( node.children[code] == null ) {

                    return false;
                }

                node = node.children[code];
            }
        }

        return node.isLastCharacter;
    }


    @Override
    public boolean search( String word ) {

        Node node = rootNode;
        return search( word, node );
    }
}
