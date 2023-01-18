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
package com.spotadev.algo.blind75.backtracking.medium.word_search;

import org.testng.Assert;

/**
 * @author John Dickerson - 9 Jun 2022
 */
public abstract class AbstractWordSearchTest {

    protected WordSearchAPI wordSearch;

    void existTest_1() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCCED";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }


    void existTest_2() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "SEE";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }


    void existTest_3() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCB";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertFalse( exist );
    }


    void existTest_4() {

        char[][] board = new char[][] {

                { 'A', 'B' },
                { 'C', 'D' }
        };

        String word = "CDBA";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }


    void existTest_5() {

        char[][] board = new char[][] {

                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'E', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCESEEEFS";
        boolean exist = wordSearch.exist( board, word );
        Assert.assertTrue( exist );
    }
}
