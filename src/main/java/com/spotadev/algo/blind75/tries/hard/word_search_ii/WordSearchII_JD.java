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
package com.spotadev.algo.blind75.tries.hard.word_search_ii;

import java.util.ArrayList;
import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=asbcE9mZz_U
 * 
 * https://leetcode.com/problems/word-search-ii/
 * 
 *     Runtime: 26 ms, faster than 99.09% of Java online submissions for Word Search II.
 *     Memory Usage: 43.3 MB, less than 79.78% of Java online submissions for Word Search II.
 * 
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * 
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent 
 * cells are horizontally or vertically neighboring. The same letter cell may not be used more 
 * than once in a word.
 * 
 * Example 1:
 * 
 *     Input: 
 *      
 *         o a a n
 *         w t a e
 *         i h k r
 *         i f l v 
 * 
 *         board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], 
 *         words = ["oath","pea","eat","rain"]
 *         
 *     Output: 
 * 
 *         ["eat","oath"]
 * 
 * Example 2:
 *  
 *     Input: 
 *     
 *         a b
 *         c d
 *     
 *         board = [["a","b"],["c","d"]], words = ["abcb"]
 *     
 *     Output: []
 *  
 * Constraints:
 * 
 *     m == board.length
 *     n == board[i].length
 *     1 <= m, n <= 12
 *     board[i][j] is a lowercase English letter.
 *     1 <= words.length <= 3 * 10^4
 *     1 <= words[i].length <= 10
 *     words[i] consists of lowercase English letters.
 *     All the strings of words are unique.
 * 
 * @author John Dickerson - 13 May 2022
 */
public class WordSearchII_JD implements WordSearchIIApi {

    class Node {

        Node parent;
        char c;
        Node[] children = new Node['z' - 'a' + 1];
        String word;
        int childSize = 0;

        Node( char c, Node parent ) {

            this.c = c;
            this.parent = parent;
            this.parent.childSize++;

        }


        Node( char c ) {

            this.c = c;
        }


        boolean hasNoChildren() {

            return childSize <= 0;
        }


        void addWord( String word, int[] boardFreq ) {

            // =================================================================================
            // Getting frequency of letters in word and checking there are sufficient letters
            // on board. If there are not we do not bother searching for the word.
            int[] wordFreq = new int['z' - 'a' + 1];

            char[] letters = word.toCharArray();

            for ( char c : letters ) {
                wordFreq[c - 'a']++;
            }

            for ( char c : letters ) {
                if ( wordFreq[c - 'a'] > boardFreq[c - 'a'] ) {
                    return;
                }
            }
            // =================================================================================

            char firstChar = letters[0];
            char lastChar = letters[letters.length - 1];
            Node current = this;

            // if the last letter of the word has less occurrences that the first letter we
            // search for the word backwards - more efficient - so we add to the try structure
            // backwards
            if ( wordFreq[firstChar - 'a'] < wordFreq[lastChar - 'a'] ) {

                // adding word backwards
                for ( int i = letters.length - 1; i >= 0; i-- ) {

                    int cIndex = letters[i] - 'a';

                    if ( current.children[cIndex] == null ) {
                        current.children[cIndex] = new Node( letters[i], current );
                    }

                    current = current.children[cIndex];
                }
            }
            else {

                // adding word normally
                for ( char c : letters ) {

                    int cIndex = c - 'a';

                    if ( current.children[cIndex] == null ) {
                        current.children[cIndex] = new Node( c, current );
                    }

                    current = current.children[cIndex];
                }
            }

            current.word = word;
        }


        void buildTrie( String[] words, int[] boardFreq ) {

            for ( String word : words ) {

                addWord( word, boardFreq );
            }
        }


        @Override
        public String toString() {

            return "Node [c=" + c + ", word=" + word + "]";
        }

    }

    private void depthFirstSearch( int row, int col, Node trie, char[][] board, int numRow,
            int numCol, List<String> foundWords ) {

        Node trieChild;
        char c;

        if ( row < 0 || row == numRow || col < 0 || col == numCol || // row & col are valid
                ( c = board[row][col] ) == '$' || // we have visited already
                ( trieChild = trie.children[c - 'a'] ) == null ) // letter does not match trie
            return;

        if ( trieChild.c == c ) {
            if ( trieChild.word != null ) {
                foundWords.add( trieChild.word );
                trieChild.word = null; // Prevents duplicates in foundWords

                // The idea is that if we find a word we should navigate from the last letter up
                // to the first letter and if any of the parents have no children that means those
                // nodes should no longer be used as we only have one word using it and we found 
                // that word.  We can thus remove some of the nodes.  The question says a letter 
                // cannot be used by more than one word.  This greatly speeds up the algo.
                Node node = trieChild;

                while ( node.parent != null && node.hasNoChildren() ) {

                    node.parent.children[node.c - 'a'] = null;
                    node.parent.childSize--;
                    node = node.parent;
                }
            }

            board[row][col] = '$';
            depthFirstSearch( row - 1, col, trieChild, board, numRow, numCol, foundWords ); // N
            depthFirstSearch( row + 1, col, trieChild, board, numRow, numCol, foundWords ); // S
            depthFirstSearch( row, col - 1, trieChild, board, numRow, numCol, foundWords ); // W
            depthFirstSearch( row, col + 1, trieChild, board, numRow, numCol, foundWords ); // E
            board[row][col] = c; // back tracking
        }
    }


    public List<String> findWords( char[][] board, String[] words ) {

        Node root = new Node( '$' );
        int numRow = board.length;
        int numCol = board[0].length;

        // =========================================================================================
        // Getting frequency of letters on board
        int[] boardFreq = new int['z' - 'a' + 1];

        for ( int row = 0; row < board.length; row++ ) {
            for ( int column = 0; column < board[0].length; column++ ) {
                char c = board[row][column];
                boardFreq[c - 'a']++;
            }
        }
        // =========================================================================================

        root.buildTrie( words, boardFreq );
        List<String> foundWords = new ArrayList<>();

        for ( int row = 0; row < numRow; row++ ) {
            for ( int col = 0; col < numCol; col++ ) {
                depthFirstSearch( row, col, root, board, numRow, numCol, foundWords );
            }
        }

        return foundWords;
    }


    /**
     * a 97
     * z 122
     * A 65
     * Z 90
     */
    public static void main( String[] args ) {

        System.out.println( "a " + ( int )'a' );
        System.out.println( "z " + ( int )'z' );
        System.out.println( "A " + ( int )'A' );
        System.out.println( "Z " + ( int )'Z' );
    }
}
