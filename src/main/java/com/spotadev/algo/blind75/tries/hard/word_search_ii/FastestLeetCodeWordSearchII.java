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
public class FastestLeetCodeWordSearchII implements WordSearchIIApi {

    private static final char HASH_TAG = '#';
    private Tree root = new Tree();

    public List<String> findWords( char[][] board, String[] words ) {

        for ( String word : words ) {

            Tree temp = root;

            // Test case 60/63 
            for ( int i = word.length() - 1; i >= 0; i-- ) {

                int idx = word.charAt( i ) - 'a';

                if ( temp.val[idx] == null ) {
                    temp.val[idx] = new Tree();
                    temp.size += 1;
                    temp.val[idx].parent = temp;
                    temp.val[idx].idx = idx;
                }

                temp = temp.val[idx];
            }
            temp.word = word;
        }
        return searchWord( board );
    }


    private List<String> searchWord( char[][] board ) {

        List<String> res = new ArrayList<>();

        for ( int i = 0; i < board.length; i++ )
            for ( int j = 0; j < board[0].length; j++ ) {
                Tree temp = root;
                checkWord( res, i, j, board, temp );
            }

        return res;
    }


    private void checkWord( List<String> res, int y, int x, char[][] board, Tree temp ) {

        if ( x >= board[0].length || x < 0
                || y >= board.length || y < 0 )
            return;

        char ch = board[y][x];
        if ( ch == HASH_TAG || temp.val[ch - 'a'] == null )
            return;

        temp = temp.val[ch - 'a'];

        if ( temp.word != null ) {
            res.add( temp.word );
            temp.word = null; // Test case 17/63: When there is more than one answer
            Tree ptr = temp;
            while ( ptr.parent != null && ptr.isEmpty() ) {
                int idx = ptr.idx;
                ptr = ptr.parent;
                ptr.val[idx] = null;
                ptr.size -= 1;
            }
        }

        board[y][x] = HASH_TAG;

        checkWord( res, y, x + 1, board, temp );
        checkWord( res, y, x - 1, board, temp );
        checkWord( res, y + 1, x, board, temp );
        checkWord( res, y - 1, x, board, temp );

        board[y][x] = ch;
    }
}

class Tree {

    Tree parent;
    Tree[] val = new Tree[26];
    String word;
    int idx;
    int size;

    public boolean isEmpty() {

        return size <= 0;
    }
}
